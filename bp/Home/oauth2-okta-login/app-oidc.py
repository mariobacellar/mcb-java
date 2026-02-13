from flask import Flask, redirect, url_for
from flask_oidc import OpenIDConnect
from flask_cors import CORS
import os
import logging

# Set up logging
logging.basicConfig(level=logging.INFO)

app = Flask(__name__)
CORS(app)

# Configuration for Okta
app.config.update({
    'SECRET_KEY': 'VPRPZ4XgCJkPqoZ1wJZw3eObPZ-qHqzYxAfjv9bzR2M',
    'OIDC_CLIENT_SECRETS': os.path.join(os.path.dirname(__file__), 'client_secrets.json'),
    'OIDC_SCOPES': ['openid', 'profile', 'email'],
    'OIDC_INTROSPECTION_AUTH_METHOD': 'client_secret_post',
    'OIDC_REDIRECT_URI': 'http://localhost:5000/oidc/callback',
    'OIDC_POST_LOGOUT_REDIRECT_URI': 'http://localhost:5000/',
})

oidc = OpenIDConnect(app)

@app.route('/')
def index():
    return 'Welcome to the OIDC Login with Okta!'

@app.route('/login')
def login():
    logging.info("Login method called")
    _url = oidc.redirect_to_auth_server()
    print(f"Redirecting to: {_url}")
    return oidc.redirect_to_auth_server()

@app.route('/oidc/callback')
def callback():
    return 'Logged in successfully!'

@app.route('/logout')
def logout():
    oidc.logout()
    return redirect(url_for('index'))

if __name__ == '__main__':
    app.run(debug=True)
