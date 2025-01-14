package com.riwi.GestionCitas.domain.ports.service;

import com.riwi.GestionCitas.application.services.crud.*;
import com.riwi.GestionCitas.domain.entities.Doctor;

import javax.print.Doc;

public interface IDoctorService extends

        Create<Doctor, Doctor>,
        ReadById<Doctor, Long>,
        ReadAll<Doctor>,
        Update<Long, Doctor, Doctor>,
        Delete<Long> {
    }
