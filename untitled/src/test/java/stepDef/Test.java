package stepDef;

import elements.Login;
import io.cucumber.java.Before;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Пусть;
import io.cucumber.java.ru.Тогда;

public class Test {
    Login steps = new Login();

    @Before
    public void setUp() {
        steps.init();
    }

    @Пусть("открыт ресурс sgw43")
    public void sgw43() throws InterruptedException {
        steps.sgw43();
    }

    @И("в поле введено имя пользователя")
    public void writeN() {
        steps.writeName();
    }

    @И("в введен пароль")
    public void writeP() {
        steps.writePassword();
    }

    @Тогда("нажать на кнопку 'Войти'")
    public void comeIn() {
        steps.comeIn();
    }
}
