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
        steps.start();
    }

    @Пусть("открыт ресурс авито")
    public void sgw43() {
        steps.sgw43();
    }

    @И("в поле введено имя пользователя")
    public void writeN() {
    }

    @И("в введен пароль")
    public void writeP() {
    }

    @Тогда("нажать на кнопку 'Войти'")
    public void comeIn() {
    }
}
