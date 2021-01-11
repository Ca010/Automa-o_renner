package core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class DSL extends DriverFactory{

    public Object executarJS(String cmd, Object... param) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript(cmd, param);
    }

    public void entrarFrame(String id) {
        driver.switchTo().frame(id);
    }

    public void clicarBotao(String id) {
        driver.findElement(By.id(id)).click();
    }


    public String alertaObterTextoEAceita(){
        Alert alert = driver.switchTo().alert();
        String valor = alert.getText();
        alert.accept();
        return valor;

    }
}
