package web.dio.api.my.dio.api.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@AutoConfigureMockMvc
class UsuarioRepositoryTest {
    @Autowired
    private MockMvc mockMvc;


    @Test
    @DisplayName("Deve devolver Código Http 404 quando informações estiverem invalidas..")
    void save() throws Exception{

    }
}