package com.riwi.GestionCitas.domain.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "medical_histories")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MedicalHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;

    @OneToOne
    private Patient patient;

    private LocalDateTime appointmentDate;

    private String diagnosis;

    private String appointmentReason;
}
