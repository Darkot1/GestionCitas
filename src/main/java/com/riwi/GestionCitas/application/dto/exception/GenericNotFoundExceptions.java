package com.riwi.GestionCitas.application.dto.exception;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GenericNotFoundExceptions extends RuntimeException {

    public GenericNotFoundExceptions(String message) {
        super(message);
    }

}