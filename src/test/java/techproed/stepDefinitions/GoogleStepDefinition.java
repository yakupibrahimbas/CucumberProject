package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.GooglePage;
import techproed.utilities.Driver;

import java.util.List;

public class GoogleStepDefinition {
    GooglePage googlePage = new GooglePage();

    @When("google arama kutusunda {string} aratir")
    public void googleAramaKutusundaAratir(String str) {
        googlePage.aramaKutusu.sendKeys(str, Keys.ENTER);

    }

    @Then("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String str) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(str));
    }

    @But("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int second) {

        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("kullanici verilen bilgilerle arama yapar")
    public void kullaniciVerilenBilgilerleAramaYapar(DataTable data) {

        List<String> dataTableList = data.asList();
        for (int i = 0; i < dataTableList.size(); i++) {
            googlePage.aramaKutusu.sendKeys(dataTableList.get(i), Keys.ENTER);
            Assert.assertTrue(Driver.getDriver().getTitle().contains(dataTableList.get(i)));
            googlePage.aramaKutusu.clear();
        }
    }

    @When("kullanici verilen bilgilerle arama yapar ikinci yol")
    public void kullaniciVerilenBilgilerleAramaYaparIkinciYol(List<String> list) {

        for (String w : list) {
            googlePage.aramaKutusu.sendKeys(w, Keys.ENTER);
            Assert.assertTrue(Driver.getDriver().getTitle().contains(w));
            googlePage.aramaKutusu.clear();
        }
    }

}

