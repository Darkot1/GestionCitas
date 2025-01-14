package com.riwi.GestionCitas.infrastructure.persistence;

import com.riwi.GestionCitas.domain.entities.Appointment;
import com.riwi.GestionCitas.domain.entities.Doctor;
import com.riwi.GestionCitas.domain.entities.Patient;
import com.riwi.GestionCitas.domain.enums.AppointmentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {

    List<Appointment> findByDoctorIdAndAppointmentDate(Long doctorId, LocalDateTime appointmentDate);
    List<Appointment> findByDoctorId(Long doctorId);
    List<Appointment> findByPatientIdAndStatus(Long patientId, AppointmentStatus status);
    List<Appointment> findByDoctorIdAndAppointmentDateBetween(Long doctorId, LocalDateTime startDate, LocalDateTime endDate);
    Optional<Appointment> findByPatientAndDoctorAndStatus (Patient patient, Doctor doctor, AppointmentStatus status);
    Optional<Appointment> findByPatientAndDoctor(Patient patient, Doctor doctor);

    @Query("SELECT a.appointmentDate FROM Appointment a WHERE a.doctor.id = :doctorId AND a.appointmentDate > :date")
    List<LocalDateTime> findAppointmentTimesByDoctorIdAndAppointmentDateAfter(Long doctorId, LocalDateTime date);
}
