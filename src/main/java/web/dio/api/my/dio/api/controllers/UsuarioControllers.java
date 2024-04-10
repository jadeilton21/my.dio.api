package web.dio.api.my.dio.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web.dio.api.my.dio.api.doMain.Usuario;
import web.dio.api.my.dio.api.repository.UsuarioRepository;

import java.util.List;

@RestController
public class UsuarioControllers {
    @Autowired
    private UsuarioRepository repository;
    @PostMapping("/usuario")
    public void cadastrarUsuario(@RequestBody Usuario usuario){


            repository.save(usuario);
    }
    @PutMapping("/usuario")
    public void atualizarUsuario(@RequestBody Usuario usuario){
        repository.update(usuario);

    }
    @DeleteMapping("/usuario/{id}")
    public void deletarUsuario(@PathVariable("id") Integer id){

        repository.remove(id);


    }
    @GetMapping("/usuario")
    public List<Usuario> listarUsuario(){
        return repository.listAll();
    }
    @GetMapping("/usuario/{id}")
    public Usuario pegarUm(@PathVariable("id") Integer id){
        return repository.finById(id);
    }



}
