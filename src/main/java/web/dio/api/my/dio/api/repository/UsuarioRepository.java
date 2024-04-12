package web.dio.api.my.dio.api.repository;

import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.dio.api.my.dio.api.doMain.Usuario;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequestMapping("/repository")
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
        usuarios.add(new Usuario("jadeilton","password"));
        usuarios.add(new Usuario("jade","masterpass"));
        return usuarios;

    }

    public Usuario finById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("jade","password");
    }
}
