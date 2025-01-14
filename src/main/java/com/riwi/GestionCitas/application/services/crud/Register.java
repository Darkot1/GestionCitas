package com.riwi.GestionCitas.application.services.crud;

public interface Register<Entity, EntityRequest> {

    public Entity register(EntityRequest entityRequest);
}
