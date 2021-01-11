package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CadastroUsuarioPage;


public class CadastroUsuarioSteps {

  CadastroUsuarioPage cadastroUsuarioPage = new CadastroUsuarioPage();


    @Dado("que eu acesse o site da renner")
    public void que_eu_acesse_o_site_da_renner() {
        cadastroUsuarioPage.encontrarLogoRenner();
    }

    @Quando("clico no botao entre ou cadastre-se")
    public void clico_no_botao_entre_ou_cadastre_se() {
        cadastroUsuarioPage.clicarEntreCadastrese();
    }

    @E("clico em cadastre-se")
    public void clico_em_cadastre_se() {
        cadastroUsuarioPage.clicarQueroMeCadastrar();
    }

    @E("preencho email como {string}")
    public void preencho_email_como(String email) {
        cadastroUsuarioPage.preencherCampoEmail(email);
    }

    @E("preencho cpf como {string}")
    public void preencho_cpf_como(String cpf) {
        cadastroUsuarioPage.preencherCampoCpf(cpf);
    }

    @E("preencho nome como {string}")
    public void preencho_nome_como(String nome) {
        cadastroUsuarioPage.preencherCampoNome(nome);
    }

    @E("preencho sobrenome como {string}")
    public void preencho_sobrenome_como(String sobrenome) {
        cadastroUsuarioPage.preencherCampoSobrenome(sobrenome);
        cadastroUsuarioPage.scroll();
    }

    @E("preencho dataDeNasc como {string}")
    public void preencho_data_de_nasc_como(String dataDeNasc) {
        cadastroUsuarioPage.preencherCampoDataDeNasc(dataDeNasc);
    }

    @E("clico no botao prefiro nao comentar")
    public void clico_no_botao_prefiro_nao_comentar() {

    }


    @E("preencho senha como {string}")
    public void preencho_senha_como(String string) {

    }

    @E("preencho telefone como {string}")
    public void preencho_telefone_como(String string) {

    }

    @E("clico no botao li e aceito a politica")
    public void clico_no_botao_li_e_aceito_a_politica() {

    }

    @E("clico no botao não sou um robo")
    public void clico_no_botao_não_sou_um_robo() {

    }

    @E("clico no botao cadastrar")
    public void clico_no_botao_cadastrar() {

    }

    @Entao("validar mensagem Olá,")
    public void validar_mensagem_olá() {

    }

    @Entao("validar mensagem {string}")
    public void validar_mensagem(String string) {

    }
}
