package com.riwi.GestionCitas.infrastructure.persistence;

import com.riwi.GestionCitas.domain.entities.Doctor;
import com.riwi.GestionCitas.domain.enums.DoctorStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {

    Doctor findByUserDocument(String userDocument);

    List<Doctor> findBySpeciality(String speciality);

    List<Doctor> findByStatus(DoctorStatus status);
}
