package techproed.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import techproed.pages.GetLandeLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class getLandStepDefinitions {

    GetLandeLoginPage getLandEstate=new GetLandeLoginPage();

    @Given("Kullanici {string} sites gider")
    public void kullanici_sites_gider(String url) {
       Driver.getDriver().get(url);
    }

    @When("sayfada login kismina tiklanir")
    public void sayfada_login_kısmına_tıklanır() {
        getLandEstate.loginButton.click();
    }

    @Then("Admin E-Postası girilir")
    public void admin_e_postası_girilir() {
        // Kodu buraya yaz
    }

    @Then("Admin Şifre girilir ve sayfaya giriş yapılır")
    public void admin_şifre_girilir_ve_sayfaya_giriş_yapılır() {
        // Kodu buraya yaz
    }

    @Then("Sayfa üst kısmında yer alan ingilizce butonuna tıklanır")
    public void sayfa_üst_kısmında_yer_alan_ingilizce_butonuna_tıklanır() {
        // Kodu buraya yaz
    }


}
