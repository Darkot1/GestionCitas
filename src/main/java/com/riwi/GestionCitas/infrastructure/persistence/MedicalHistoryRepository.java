package com.riwi.GestionCitas.infrastructure.persistence;

import com.riwi.GestionCitas.domain.entities.MedicalHistory;
import com.riwi.GestionCitas.domain.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory, Long> {

    List<MedicalHistory> findByPatient(Patient patient);

}
