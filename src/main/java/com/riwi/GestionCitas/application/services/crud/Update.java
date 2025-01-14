package com.riwi.GestionCitas.application.services.crud;

public interface Update<ID, Entity, EntityRequest> {

    public Entity update(ID id, EntityRequest entity);
}
