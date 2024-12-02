package br.ce.asoares.BookStore.Account.Token;

public class teste {
    public static void main(String[] args) {

        TokenPage tokenPage = new TokenPage();
        Token token = new Token();

        String tkn;
        tkn = token.gerarToken(tokenPage.getUsuario(), tokenPage.getSenha());

        System.out.println(tkn);
    }
}
