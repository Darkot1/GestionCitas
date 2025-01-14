package com.riwi.GestionCitas.application.services.crud;

public interface ReadByName<Entity, NAME>{

    public Entity readByName(NAME name);
}