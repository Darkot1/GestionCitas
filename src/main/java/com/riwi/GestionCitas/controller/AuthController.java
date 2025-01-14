package com.riwi.GestionCitas.controller;

import com.riwi.GestionCitas.application.dto.request.UserWithoutId;
import com.riwi.GestionCitas.domain.entities.User;
import com.riwi.GestionCitas.domain.ports.service.IUserService;
import com.riwi.GestionCitas.infrastructure.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = {"http://127.0.0.1:8000", "http://localhost:8000"})
@RequiredArgsConstructor
public class AuthController {

    private final IUserService userService;
    private final UserRepository userRepository;


    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody UserWithoutId userDTO) {
        try {
            if (userRepository.existsByDocument(userDTO.getDocument())) {
                return ResponseEntity.status(409).body(null);
            }

            User user = userService.register(userDTO);
            return ResponseEntity.status(201).body(user);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(null);
        }
    }
}
