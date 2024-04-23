package techproed.pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class GetLandEstatePage {
    public void getLandEstate() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[text()='Login']")
    public WebElement loginButton;
    @FindBy(xpath = "//*[@placeholder='Email']")
    public WebElement emailGiris;
    @FindBy(xpath = "//*[@name='password']")
    public WebElement passwordGiris;
    @FindBy(xpath = "//*[@class='form-submit-button']")
    public WebElement loginButton2;
    @FindBy(xpath = "(//*[@src])[5]")
    public WebElement englishLanguage;
    @FindBy(xpath = "(//*[@src])[7]")
    public WebElement turkishLanguage;
    @FindBy(xpath = "(//*[@src])[8]")
    public WebElement franceLanguage;
    @FindBy(xpath = "(//*[@src])[9]")
    public WebElement almancaLanguage;
    @FindBy(xpath = "(//*[@src])[10]")
    public WebElement ispanyolcaLanguage;


}


