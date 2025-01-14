package com.riwi.GestionCitas.application.services.crud;

public interface Create<Entity, EntityRequest> {

    public Entity create(EntityRequest entityRequest);

}
