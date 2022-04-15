package automatizado.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;

import automatizado.Pege.GooglePO;

public class GoogleTest extends BaseTeste {

    private static GooglePO googlePage;

    @BeforeClass
    public static void prepararTestes() {
        googlePage = new GooglePO(driver);
    }

    @Test
    public void TC001_devePesquisarNoGoogle() {

        // googlePage.inputPesquisa.sendKeys("Batata Frita" + Keys.ENTER);// Escrever no
        // navegador + clicar Enter
        googlePage.pesquisar("Batata Frita");
        String resultado = googlePage.obterResultadoDaPesquisa();

        assertTrue(resultado, resultado.contains("Aproximadamente"));

    }

    @Test
    public void TC002_deveSerPossivelPesquisarNoGoogle2() {

        googlePage.pesquisar("Nutella");

        String resultado = googlePage.obterResultadoDaPesquisa();

        assertTrue(resultado, resultado.contains("resultados"));
    }

}
