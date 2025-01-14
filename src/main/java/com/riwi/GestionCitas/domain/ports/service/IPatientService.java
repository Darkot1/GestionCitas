package com.riwi.GestionCitas.domain.ports.service;

import com.riwi.GestionCitas.application.services.crud.*;
import com.riwi.GestionCitas.domain.entities.Patient;

public interface IPatientService extends

        Create<Patient, Patient>,
        ReadByDocument<Patient, Patient>,
        ReadAll<Patient>,
        UpdateByDocument<String, Patient, Patient>,
        DeleteByDocument<String>
{
}
