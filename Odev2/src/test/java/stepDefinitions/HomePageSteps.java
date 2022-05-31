package stepDefinitions;

import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class HomePageSteps {

    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);
    //HomePage homePage = new HomePage(DriverFactory.getDriver());

    @Given("Uygulama acilir")
    public void uygulamaAcilir() {

        homePage.checkLogo();
    }

    @When("Arama cubuguna {string} yazilir")
    public void aramaCubugunaKadinElbiseYazilir(String product){

        homePage.setSearchBox(product);
    }

    @When("Ara butonuna tiklanir")
    public void araButonunaTiklanir() {
        homePage.clickSearchButton();
        
    }


}
