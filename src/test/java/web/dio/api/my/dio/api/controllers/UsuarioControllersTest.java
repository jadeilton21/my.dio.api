package web.dio.api.my.dio.api.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc
class UsuarioControllersTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Deve devolver Código Http 404 quando informações estiverem invalidas..")
    void cadastrarUsuario() throws Exception {
        var response = mockMvc.perform(
                post("/usuario")
        ).andReturn().getResponse();

        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.BAD_REQUEST.value());
    }


    @Test
    @DisplayName("Deve Devolver Código Http 404 quando informações forem invalidas")
    void atualizarUsuario() throws Exception{

        var response = mockMvc.perform(
                post("/usuario")
        ).andReturn().getResponse();

        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.BAD_REQUEST.value());



    }

    @Test
    @DisplayName("Deve devolver Código Http 404 quando informações estiverem invalidas..")
    void deletarUsuario() throws Exception{

        var response = mockMvc.perform(
                post("/usuario")
        ).andReturn().getResponse();


        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.BAD_REQUEST.value());
    }
}