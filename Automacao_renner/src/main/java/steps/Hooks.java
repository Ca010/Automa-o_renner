package steps;

import core.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends DriverFactory {

    @Before
    public void iniciarDriver(){
        instanciarDriver();
        pegarDriver().get("https://www.lojasrenner.com.br/");
    }

//    @After
//    public void limparDriver(){
//        pegarDriver().quit();
//    }
}
