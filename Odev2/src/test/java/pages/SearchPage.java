package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    By Button = By.cssSelector("a[title='SUDI ETUZ X LC WAIKIKI İNCE ASKILI KRUVAZE YAKA FIRFIR DETAYLI KADIN MEIS JEAN ELBİSE']");

    WebDriver driver;

    public SearchPage(WebDriver driver){

        this.driver = driver;
    }


    public void clickButton(){

        driver.findElement(Button).click();
    }


}
