package com.riwi.GestionCitas.domain.enums;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
public enum Role {

    ADMIN(Set.of("MANAGE_ALL")),
    DOCTOR(Set.of("MANAGE_APPOINTMENTS")),
    PATIENT(Set.of("VIEW_APPOINTMENTS"))
    ;

    private final Set<String> permissions;

    Role(Set<String> permissions) {
        this.permissions = permissions;
    }

}
