package web.dio.api.my.dio.api.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
import web.dio.api.my.dio.api.doMain.Usuario;

import java.util.ArrayList;
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
        System.out.println(String.format("DELETAR/ID - Deletando o id: %d e excluido o usuario", id));
        System.out.println(id);

    }

    public List<Usuario> listAll() {
        System.out.println("LIST - Listando os usários do sistema");
        List<Usuario> usuarios = new ArrayList<>();

    }

    public Usuario finById(Integer id) {

    }
}
