package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class GooglePage {
    /*
      PageFactory.initElements(Driver.getDriver(),this); kodu bu classtaki ögeleri Webdriver ile eslestirir
      ve bu sayede bu classtaki webelementlere erismek icin @FindBy gibi pagefactory e yardimci notasyonlar kullanilabilir hale gelir
     */

    public GooglePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id= "APjFqb")
    public WebElement aramaKutusu;



}