package br.ce.asoares.BookStore.Account.Token;

import com.github.javafaker.Faker;
import lombok.Getter;

@Getter
public class TokenPage {

    Faker faker = new Faker();

    private String usuario = "jdoe";
    private String senha = "Demo123!";

    private String userErro = faker.name().username();
    private String senhaErro = faker.internet().password();

    private String userBranco = "";
    private String senhaBranco = "";


    private String loginSucesso = "Success";
    private String resultSucesso = "User authorized successfully.";

    private String loginFalha = "Failed";
    private String resultFalha = "User authorization failed.";

    private String codFalha = "1200";
    private String msgFalha = "UserName and Password required.";
}
