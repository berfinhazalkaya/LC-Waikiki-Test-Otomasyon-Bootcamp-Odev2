package stepDefinitions;

import Util.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SearchPage;

public class SearchPageSteps {

//    SearchPage searchPage = new SearchPage(DriverFactory.getDriver());

    WebDriver driver = DriverFactory.getDriver();
    SearchPage searchPage = new SearchPage(driver);

    @When("{int}.siradaki elbiseye tiklanir")
    public void siradakiAyakkabiyaTiklanir(int arg0) {


        try {
            Thread.sleep(1500); //1.5 saniye bekler
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        searchPage.clickButton();
    }
}
