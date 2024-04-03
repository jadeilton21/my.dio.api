package web.dio.api.my.dio.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.dio.api.my.dio.api.doMain.Usuario;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControllers {
    @Autowired
    private UsuarioRepository repository;
    @PostMapping
    public void cadastrar(@RequestBody Usuario usuario){


            repository.save(usuario);
    }





}
