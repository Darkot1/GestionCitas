package com.riwi.GestionCitas.application.services.crud;

import java.util.Optional;

public interface ReadById<Entity, ID>{
    public Optional<Entity> readById(ID id);
}
