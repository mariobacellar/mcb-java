import socket

def check_port(port):
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
        result = s.connect_ex(('localhost', port))
        if result == 0:
            print(f"Port {port} is in use.")
        else:
            print(f"Port {port} is free.")

if __name__ == "__main__":
    port_to_check = int(input("Enter the port number to check: "))
    check_port(port_to_check)
