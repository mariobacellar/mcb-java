package com.example.kafkarestapi.controller;

import com.example.kafkarestapi.dto.AuthResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {

    @GetMapping("/public/info")
    public AuthResponse publicEndpoint() {
        return new AuthResponse(
            "Este é um endpoint público - não requer autenticação",
            "anonymous",
            new String[]{"PUBLIC"}
        );
    }

    @GetMapping("/protected/user-info")
    public AuthResponse protectedEndpoint(@AuthenticationPrincipal Jwt jwt) {
        return new AuthResponse(
            "Endpoint protegido - autenticação OIDC bem-sucedida!",
            jwt.getClaimAsString("preferred_username"),
            jwt.getClaimAsStringList("authorities").toArray(new String[0])
        );
    }

    @GetMapping("/protected/admin")
    public AuthResponse adminEndpoint(Authentication authentication) {
        return new AuthResponse(
            "Endpoint administrativo - acesso concedido!",
            authentication.getName(),
            authentication.getAuthorities().stream()
                .map(Object::toString)
                .toArray(String[]::new)
        );
    }
}
