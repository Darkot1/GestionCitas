package com.riwi.GestionCitas.domain.ports.service;

import com.riwi.GestionCitas.application.dto.request.UserWithoutId;
import com.riwi.GestionCitas.application.services.crud.ReadById;
import com.riwi.GestionCitas.application.services.crud.Register;
import com.riwi.GestionCitas.domain.entities.User;

public interface IUserService extends
        Register<User, UserWithoutId>,
        ReadById<User, String>
{

}
