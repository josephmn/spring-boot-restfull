package com.usuarios.service;

import com.usuarios.entities.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> findAll();
    Optional<Usuario> findById(Long id);
    Usuario save(Usuario usuario);
    Usuario updateUsuario(Long id, Usuario usuario);
    void deleteById(Long Id);
}
