package com.example.demoporpasos.controllers;

import com.example.demoporpasos.dao.UsuarioDao;
import com.example.demoporpasos.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;
    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Daniel");
        usuario.setApellido("Moreno");
        usuario.setEmail("danimople@gmail.com");
        usuario.setTelefono("65159195");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios")
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuario123")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Daniel");
        usuario.setApellido("Moreno");
        usuario.setEmail("danimople@gmail.com");
        usuario.setTelefono("65159195");
        return usuario;

    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id) {
        usuarioDao.eliminar(id);

    }

    @RequestMapping(value = "api/usuario125")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Daniel");
        usuario.setApellido("Moreno");
        usuario.setEmail("danimople@gmail.com");
        usuario.setTelefono("65159195");
        return usuario;

    }
}