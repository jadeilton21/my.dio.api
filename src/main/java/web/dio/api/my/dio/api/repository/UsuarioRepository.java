package web.dio.api.my.dio.api.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
import web.dio.api.my.dio.api.doMain.Usuario;

import java.util.List;

@Repository
public class UsuarioRepository {


    public void save(Usuario usuario) {
        System.out.println("Salvo - Usúario salvo na camada de Repository(banco de dados)");
        System.out.println(usuario);

    }

    public void update(Usuario usuario) {
        System.out.println("Atualizado - Usúario é atualizado na camada de Repository(banco de dados)");
        System.out.println(usuario);

    }

    public void remove(Integer id) {

    }

    public List<Usuario> listAll() {

    }

    public Usuario finById(Integer id) {

    }
}
