package com.usuarios.controller.dto;

import com.usuarios.entities.Telefono;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTO {
    private Long id;
    private String name;
    private String email;
    private String password;
    private List<Telefono> phones;
}
