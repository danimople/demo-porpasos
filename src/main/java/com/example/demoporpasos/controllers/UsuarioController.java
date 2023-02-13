package com.example.demoporpasos.controllers;

import com.example.demoporpasos.dao.UsuarioDao;
import com.example.demoporpasos.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Daniel");
        usuario.setApellido("Moreno");
        usuario.setEmail("danimople@gmail.com");
        usuario.setTelefono("65159195");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "usuario123")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Daniel");
        usuario.setApellido("Moreno");
        usuario.setEmail("danimople@gmail.com");
        usuario.setTelefono("65159195");
        return usuario;

    }

    @RequestMapping(value = "usuario124")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Daniel");
        usuario.setApellido("Moreno");
        usuario.setEmail("danimople@gmail.com");
        usuario.setTelefono("65159195");
        return usuario;

    }

    @RequestMapping(value = "usuario125")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Daniel");
        usuario.setApellido("Moreno");
        usuario.setEmail("danimople@gmail.com");
        usuario.setTelefono("65159195");
        return usuario;

    }
}