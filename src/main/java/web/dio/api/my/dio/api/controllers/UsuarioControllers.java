package web.dio.api.my.dio.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web.dio.api.my.dio.api.doMain.Usuario;
import web.dio.api.my.dio.api.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControllers {
    @Autowired
    private UsuarioRepository repository;
    @PostMapping()
    public void cadastrar(@RequestBody Usuario usuario){


            repository.save(usuario);
    }
    @PutMapping()
    public void atualizar(@RequestBody Usuario usuario){
        repository.update(usuario);

    }
    @DeleteMapping
    public void deletar(@RequestBody Usuario usuario){

        repository.delete(usuario);


    }



}
