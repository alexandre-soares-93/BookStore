import br.ce.asoares.BookStore.Account.CriarUser.CriarUserLogic;
import org.junit.Test;

public class CriarUserTest {

    CriarUserLogic userLogic = new CriarUserLogic();

    @Test
    public void CriarUsuario() {
        userLogic.criarUsuario();
        userLogic.validarUsuario();
    }
}
