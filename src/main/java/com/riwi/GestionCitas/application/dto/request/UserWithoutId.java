package com.riwi.GestionCitas.application.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class UserWithoutId {


    private String name;


    private String document;


    private String email;


    private String password;
}
