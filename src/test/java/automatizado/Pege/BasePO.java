package automatizado.Pege;

/**
 * Classe base para criação das novas PageObjects.
 * Todas as pages deve ser herdadas desta classe.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePO {

    /** Driver base que sera usado pelas pages */
    protected WebDriver driver;

    /**
     * Construtor base para criação de fabricas de elementos.(PageFactory)
     * 
     * @param driver Driver da página atual.
     */

    protected BasePO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);// a pagenia que estiver executa:Toda a fabrica para trabalhar com o
                                               // pageFactory

    }

}
