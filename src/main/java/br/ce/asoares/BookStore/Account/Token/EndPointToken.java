package br.ce.asoares.BookStore.Account.Token;

import br.ce.asoares.BookStore.EndPointBookStore;

public interface EndPointToken {

    String POST_TOKEN = EndPointBookStore.BASE_URL + "/Account/v1/GenerateToken";
}
