package br.ce.asoares.BookStore.Account.Token;

import lombok.Getter;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import lombok.Setter;
import org.json.JSONObject;


import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

@Getter
@Setter
public class Token {

    TokenPage tokenPage = new TokenPage();
    Response response;
    String body;

    public String gerarToken(String usuario, String senha) {
        body = new JSONObject()
                .put("userName", usuario)
                .put("password", senha).toString();

        setResponse(given().contentType(ContentType.JSON).body(getBody())
                .request(Method.POST, EndPointToken.POST_TOKEN));

        return getResponse().path("token");
    }
}
