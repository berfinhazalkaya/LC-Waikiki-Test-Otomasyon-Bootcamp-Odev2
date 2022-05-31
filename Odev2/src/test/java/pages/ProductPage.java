package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    By Button2 = By.cssSelector("body > div:nth-child(11) > div:nth-child(1) > div:nth-child(14) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > a:nth-child(6)");
    //CSS Selector ile 34 Bedeni seçtik

    By Button3 = By.cssSelector("#pd_add_to_cart");
    //id ile sepete Ekledik

    WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }


    public void clickButton2(){
        driver.findElement(Button2).click();
    }

    public void clickButton3(){
        driver.findElement(Button3).click();
    }

}
