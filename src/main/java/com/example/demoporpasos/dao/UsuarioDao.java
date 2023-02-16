package com.example.demoporpasos.dao;

import com.example.demoporpasos.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    List<Usuario> getUsuarios();
    void eliminar(Long id);

    void registrar(Usuario usuario);
}
