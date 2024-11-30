package br.ce.asoares.BookStore.Account.CriarUser;

import lombok.Getter;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import lombok.Setter;
import org.apache.http.HttpStatus;


import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

@Getter
@Setter
public class CriarUserLogic {

    CriarUserPage userPage = new CriarUserPage();
    Response response;

    public void criarUsuario() {
        setResponse(given().contentType(ContentType.JSON).body(userPage.getBody())
                .request(Method.POST, EndPointCriarUser.POST_CRIARUSER));
    }

    public void validarUsuario() {
        assertEquals(getResponse().statusCode(), HttpStatus.SC_CREATED);
        assertEquals(getResponse().path("username"), userPage.getNovoUsuario());
    }
}
