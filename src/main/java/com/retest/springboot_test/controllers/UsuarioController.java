package com.retest.springboot_test.controllers;

import com.retest.springboot_test.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController//indica que es un controlador

public class UsuarioController {



    @RequestMapping(value= "usuarios")
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(123L);
        usuario.setNombre("Pablo");
        usuario.setApellido("Morales");
        usuario.setEmail("pablo@mail.com");
        usuario.setTelefono("4751111");
        usuario.setPassword("123456");

        Usuario usuario2 = new Usuario();
        usuario2.setId(456L);
        usuario2.setNombre("Pedro");
        usuario2.setApellido("Ramirez");
        usuario2.setEmail("pedroo@mail.com");
        usuario2.setTelefono("4752222");
        usuario2.setPassword("123456");

        Usuario usuario3 = new Usuario();
        usuario3.setId(789L);
        usuario3.setNombre("Cesar");
        usuario3.setApellido("Morales");
        usuario3.setEmail("cesar@mail.com");
        usuario3.setTelefono("4871510");
        usuario3.setPassword("123456");

        Usuario usuario4 = new Usuario();
        usuario4.setId(741L);
        usuario4.setNombre("Maria");
        usuario4.setApellido("Perez");
        usuario4.setEmail("maria@mail.com");
        usuario4.setTelefono("4568520");
        usuario4.setPassword("123456");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);

        return usuarios;
    }

    @RequestMapping(value= "usuarioEdit")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Pablo");
        usuario.setApellido("Morales");
        usuario.setEmail("pablomorales@gmail.com");
        usuario.setTelefono("456123789");
        return usuario;
    }

    @RequestMapping(value= "usuarioDel")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Pablo");
        usuario.setApellido("Morales");
        usuario.setEmail("pablomorales@gmail.com");
        usuario.setTelefono("456123789");
        return usuario;
    }

    @RequestMapping(value= "usuarioSearch")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Pablo");
        usuario.setApellido("Morales");
        usuario.setEmail("pablomorales@gmail.com");
        usuario.setTelefono("456123789");
        return usuario;
    }
}
