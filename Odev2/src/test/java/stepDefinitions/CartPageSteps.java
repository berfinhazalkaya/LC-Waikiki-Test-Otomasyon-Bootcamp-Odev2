package stepDefinitions;

import Util.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.ProductPage;

public class CartPageSteps {

    WebDriver driver = DriverFactory.getDriver();
    CartPage cartPage = new CartPage(driver);

    @When("Sepete gidilir")
    public void sepeteGidilir() {
        cartPage.clickButton4();
    }

    @When("Odeme adimina gecilir")
    public void odemeAdiminaGecilir() {
        cartPage.clickButton5();
    }

    @When("Uye olmadan devam etmek icin mail adresi kismina {string} yazilir")
    public void uyeOlmadanDevamEtmekIcinMailAdresiKisminaYazilir(String text) {
        cartPage.setMail(text);
    }

    @When("Kullanim sozlesmesini onayla")
    public void kullanimSozlesmesiniOnayla() {
        cartPage.clickButton6();
    }

    @When("Uye olmadan devam et butonuna tıkla")
    public void uyeOlmadanDevamEtButonunaTıkla() {
        cartPage.clickButton7();
    }

    @Then("Odeme sayfasinin geldigi kontrol edilir")
    public void odemeSayfasininGeldigiKontrolEdilir() {
        cartPage.clickButton8();
    }
}
