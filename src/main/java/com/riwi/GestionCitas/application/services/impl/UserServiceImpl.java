package com.riwi.GestionCitas.application.services.impl;

import com.riwi.GestionCitas.application.dto.request.UserWithoutId;
import com.riwi.GestionCitas.domain.entities.Patient;
import com.riwi.GestionCitas.domain.entities.User;
import com.riwi.GestionCitas.domain.enums.Role;
import com.riwi.GestionCitas.domain.ports.service.IUserService;
import com.riwi.GestionCitas.infrastructure.persistence.DoctorRepository;
import com.riwi.GestionCitas.infrastructure.persistence.PatientRepository;
import com.riwi.GestionCitas.infrastructure.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    @Override
    public User register(UserWithoutId userDTO) {
        // Crear el nuevo usuario
        User user = new User();
        user.setDocument(userDTO.getDocument());
        //user.setPassword(encryptPassword(userDTO.getPassword()));
        user.setName(userDTO.getName());
        user.setRole(Role.PATIENT);

        user = userRepository.save(user);

        Patient patient = new Patient();
        patient.setUser(user);
        patientRepository.save(patient);


        System.out.println("Usuario guardado: " + user);

        return user;
    }

    @Override
    public Optional<User> readById(String document) {
        Optional<User> user = userRepository.findByDocument(document);

        if (user.isEmpty()){
            throw new RuntimeException("Usuario no encontrado con el documento: " + document);
        }
        return user;
    }
}