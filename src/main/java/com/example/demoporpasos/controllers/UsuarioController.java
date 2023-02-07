package com.example.demoporpasos.controllers;

import com.example.demoporpasos.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
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
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(234L);
        usuario.setNombre("Daniel");
        usuario.setApellido("Moreno");
        usuario.setEmail("danimople@gmail.com");
        usuario.setTelefono("65159195");

        Usuario usuario2 = new Usuario();
        usuario2.setId(235L);
            usuario2.setNombre("Pepe");
        usuario2.setApellido("Perez");
        usuario2.setEmail("dajnfjeni@gmail.com");
        usuario2.setTelefono("8741548");

        Usuario usuario3 = new Usuario();
        usuario3.setId(236L);
        usuario3.setNombre("Juan");
        usuario3.setApellido("jdbc");
        usuario3.setEmail("juanjo@gmail.com");
        usuario3.setTelefono("8496526");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
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