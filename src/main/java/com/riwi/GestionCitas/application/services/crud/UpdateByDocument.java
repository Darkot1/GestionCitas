package com.riwi.GestionCitas.application.services.crud;

public interface UpdateByDocument<DOCUMENT, Entity, EntityRequest> {

    public Entity updateByDocument(DOCUMENT document, EntityRequest entity);
}
