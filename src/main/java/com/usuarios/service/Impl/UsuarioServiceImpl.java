package com.usuarios.service.Impl;

import com.usuarios.entities.Usuario;
import com.usuarios.repository.UsuarioRepository;
import com.usuarios.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario updateUsuario(Long id, Usuario usuario) {
        Optional<Usuario> user = usuarioRepository.findById(id);
        if (user.isPresent()) {
            Usuario existingUser = user.get();

            existingUser.setName(usuario.getName());
            existingUser.setEmail(usuario.getEmail());
            existingUser.setPassword(usuario.getPassword());

            existingUser.getPhones().clear();
            existingUser.getPhones().addAll(usuario.getPhones());

            return usuarioRepository.save(existingUser);
        } else {
            return null;
        }
    }

    @Override
    public void deleteById(Long Id) {
        usuarioRepository.deleteById(Id);
    }
}
