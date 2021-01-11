package core;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    public  WebDriver driver;

    //configurar(Ex: tamanho tela) o chromedriver no chromeOptions (pesquisar 'chromeOptions list')
    public ChromeOptions configuraChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-fullscreen");
        return options;
    }




    public void instanciarDriver(){ driver = new ChromeDriver(configuraChromeOptions());}

    public WebDriver pegarDriver() {return driver;}


}
