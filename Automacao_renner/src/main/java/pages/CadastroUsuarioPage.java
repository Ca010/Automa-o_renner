package pages;

import core.CommonsBasePage;
import org.openqa.selenium.By;


public class CadastroUsuarioPage extends CommonsBasePage {

    By logoRenner = By.xpath("//*[@id=\"header\"]/div/div[3]/a/h1/div");
    By botaoEntreCadastrese = By.xpath("//*[@id=\"header\"]/div/div[3]/div[3]/div/div[1]/a");
    By botaoCadastrar = By.cssSelector("#header > div > div.wrapper > div.user-info-wrapper > div > div.user_nav > a");
    By inputEmail = By.id("inputEmailRegister");
    By inputCpf = By.id("inputLegalDocumentRegister");
    By inputNome = By.id("firstName");
    By inputSobrenome = By.id("lastName");
    By inputdataDeNasc = By.id("dateOfBirth");

    public void encontrarLogoRenner(){
        encontrarElemento(logoRenner);
    }

    public void clicarEntreCadastrese() {
        clicarElemento(botaoEntreCadastrese);
    }

    public void clicarQueroMeCadastrar(){
        clicarElemento(botaoCadastrar);
}

    public void preencherCampoEmail(String email){
    enviarTextoElemento(inputEmail, email);
}

    public void preencherCampoCpf(String cpf){
        enviarTextoElemento(inputCpf, cpf);
}

    public void preencherCampoNome(String nome){
        enviarTextoElemento(inputNome, nome);
    }

    public void preencherCampoSobrenome(String sobrenome){
        enviarTextoElemento(inputSobrenome, sobrenome);

    }
    public void preencherCampoDataDeNasc(String dataDeNasc){
        enviarTextoElemento(inputdataDeNasc, dataDeNasc);

    }
}
