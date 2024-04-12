package web.dio.api.my.dio.api.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.http.RequestEntity.post;

@SpringBootTest
@AutoConfigureMockMvc
class UsuarioRepositoryTest {
    @Autowired
    private MockMvc mockMvc;


    @Test
    @DisplayName("Deve devolver Código Http 404 quando informações estiverem invalidas..")
    void save() throws Exception{

        var response = mockMvc.perform(
                (RequestBuilder) post("/repository")
        ).andReturn().getResponse();


        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.BAD_REQUEST.value());
    }
}