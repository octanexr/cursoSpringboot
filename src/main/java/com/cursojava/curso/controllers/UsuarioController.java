package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Octavio");
        usuario.setApellido("Riego");
        usuario.setEmail("octa@mail.com");
        usuario.setTelefono("12314563");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){

        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(123);
        usuario.setNombre("Octavio");
        usuario.setApellido("Riego");
        usuario.setEmail("octa@mail.com");
        usuario.setTelefono("12314563");

        Usuario usuario2 = new Usuario();
        usuario2.setId(456);
        usuario2.setNombre("Sebastian");
        usuario2.setApellido("Riego");
        usuario2.setEmail("seba@mail.com");
        usuario2.setTelefono("4353453");

        Usuario usuario3 = new Usuario();
        usuario3.setId(789);
        usuario3.setNombre("Raqueñ");
        usuario3.setApellido("Leon");
        usuario3.setEmail("raquel@mail.com");
        usuario3.setTelefono("567568678");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
    }

    @RequestMapping(value = "usuario789")
    public Usuario editarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Octavio");
        usuario.setApellido("Riego");
        usuario.setEmail("octa@mail.com");
        usuario.setTelefono("12314563");
        return usuario;
    }

    @RequestMapping(value = "usuario456")
    public Usuario eliminarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Octavio");
        usuario.setApellido("Riego");
        usuario.setEmail("octa@mail.com");
        usuario.setTelefono("12314563");
        return usuario;
    }

    @RequestMapping(value = "usuario123")
    public Usuario buscarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Octavio");
        usuario.setApellido("Riego");
        usuario.setEmail("octa@mail.com");
        usuario.setTelefono("12314563");
        return usuario;
    }

}



