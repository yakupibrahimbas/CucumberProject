package techproed.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import techproed.pages.GetLandEstatePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class getLandStepDefinitions {
    GetLandEstatePage getLandEstate=new GetLandEstatePage();

    @Given("Kullanici {string} sitesine gider")
    public void kullanici_sitesine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("getLandEstateUrl"));
    }
    @When("sayfada login kısmına tıklanır")
    public void sayfada_login_kısmına_tıklanır() {
        getLandEstate.loginButton.click();

    }
    @Then("Admin E-Postası girilir")
    public void admin_e_postası_girilir() {
        getLandEstate.emailGiris.sendKeys(ConfigReader.getProperty("customerGiris"));

    }
    @Then("Admin Şifre girilir ve sayfaya giriş yapılır")
    public void admin_şifre_girilir_ve_sayfaya_giriş_yapılır() {
        getLandEstate.passwordGiris.sendKeys(ConfigReader.getProperty("customerPassword"), Keys.ENTER);

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("getLandEstateUrl"));
    }

    @Given("Kullanici {string} sites gider")
    public void kullaniciSitesGider(String arg0) {
        {
            Driver.getDriver().get(ConfigReader.getProperty("getLandEstateUrl"));
        }
    }
}
