package com.riwi.GestionCitas.application.services.crud;

import java.util.Optional;

public interface ReadByDocument<Entity, DOCUMENT>{
    public Optional<Entity> readByDocument(DOCUMENT document);
}
