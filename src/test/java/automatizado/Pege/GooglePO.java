package automatizado.Pege;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO {
    @FindBy(name = "q")
    public WebElement inputPesquisa;

    @FindBy(id = "result-stats")
    public WebElement divResultadoPesquisa;

    /**
     * Construtor para criação da pagina do Google.
     * 
     * @param driver Driver da pagina do Google
     */

    public GooglePO(WebDriver driver) {
        super(driver);

    }

    /**
     * Metodo que ira realizar uma pesquisa no Google
     * baseado no texto informado e comcluindo com ENTER.
     * 
     * @param texto Texto a ser pesquisado.
     */
    public void pesquisar(String texto) {
        inputPesquisa.sendKeys(texto + Keys.ENTER);
    }

    /**
     * Metodo que retorna o resultado aproximado da pesquisa.
     * 
     * @return Retorna o resultado da pesquisa.
     */

    public String obterResultadoDaPesquisa() {
        return divResultadoPesquisa.getText();

    }

}
