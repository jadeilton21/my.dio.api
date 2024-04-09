package web.dio.api.my.dio.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web.dio.api.my.dio.api.doMain.Usuario;
import web.dio.api.my.dio.api.repository.UsuarioRepository;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControllers {
    @Autowired
    private UsuarioRepository repository;
    @PostMapping()
    public void cadastrarUsuario(@RequestBody Usuario usuario){


            repository.save(usuario);
    }
    @PutMapping()
    public void atualizarUsuario(@RequestBody Usuario usuario){
        repository.update(usuario);

    }
    @DeleteMapping({"id"})
    public void deletarUsuario(@PathVariable("id") Integer id){

        repository.remove(id);


    }
    @GetMapping
    public List<Usuario> listarUsuario(){
        return repository.listAll();
    }
    @GetMapping("{id}")
    public Usuario pegarUm(@PathVariable("id") Integer id){
        return repository.finById(id);
    }



}
