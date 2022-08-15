package com.retest.springboot_test.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//indica que es un controlador

public class UsuarioController {

    @RequestMapping(value= "prueba")
    public List<String> prueba(){
        return List.of("Manzana","Banana","Pera");
    }
}
