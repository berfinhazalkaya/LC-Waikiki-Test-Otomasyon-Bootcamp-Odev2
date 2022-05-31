package stepDefinitions;

import Util.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.ProductPage;
import pages.SearchPage;

import java.util.Properties;

public class ProductPageSteps {

//    ProductPage productPage = new ProductPage(DriverFactory.getDriver());

    WebDriver driver = DriverFactory.getDriver();
    ProductPage productPage = new ProductPage(driver);


    @When("Elbise bedeni olarak {int} secilir")
    public void elbiseBedeniOlarakSecilir(int arg0) {

        try {
            Thread.sleep(1000); //1 saniye bekler
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        productPage.clickButton2();
    }

    @When("Sepete ekleye tiklanir")
    public void sepeteEkleyeTiklanir() {
        try {
            Thread.sleep(1000); //1 saniye bekler
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        productPage.clickButton3();
    }
}
