package com.riwi.GestionCitas.domain.ports.service;

import com.riwi.GestionCitas.application.services.crud.*;
import com.riwi.GestionCitas.domain.entities.Appointment;

public interface IAppointmentService extends

        Create<Appointment, Appointment>,
        ReadById<Appointment, Long>,
        ReadAll<Appointment>,
        Update<Long, Appointment, Appointment>,
        Delete<Long>

{
}
