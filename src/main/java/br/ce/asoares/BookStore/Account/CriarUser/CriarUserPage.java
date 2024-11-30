package br.ce.asoares.BookStore.Account.CriarUser;

import com.github.javafaker.Faker;
import lombok.Getter;
import org.json.JSONObject;

@Getter
public class CriarUserPage {

    Faker faker = new Faker();

    private String novoUsuario = faker.name().username();
    private String novaSenha = "Demo1234!";

    private String body = new JSONObject()
            .put("userName", getNovoUsuario())
            .put("password", getNovaSenha()).toString();
}
