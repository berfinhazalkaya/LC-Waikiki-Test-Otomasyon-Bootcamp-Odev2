package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    By Button4 = By.cssSelector("#shopping-cart"); //Sepete tıkladık
    By yazi = By.cssSelector(".main-button mb-10"); //Odeme adimina gec yazisini kontrol ettik
    By Button5 = By.cssSelector(".mt-15");
    By mail = By.cssSelector("input[data-tracking-label='UyeliksizEmail']"); //Uyeliksiz giris yapiyoruz
    By Button6= By.cssSelector("input[value='false'][name='memberPrivacyApprove']");//Kullanim sozlesmesini onayladik
    By Button7= By.cssSelector(".login-form__button.login-form__button--bg-blue.login-form__without-login-button");//Uye olmadan devam et butonuna tikladik
    By Button8= By.cssSelector(".modalAddButton");//Odeme sayfasi kontrol edilir


    WebDriver driver;

    public CartPage(WebDriver driver){

        this.driver = driver;
    }

    public void clickButton4(){

        driver.findElement(Button4).click();
    }

    public void checkLogo(){
        driver.findElement(yazi);
    }

    public void clickButton5(){
        driver.findElement(Button5).click();
    }
    public void setMail(String text){
        driver.findElement(mail).sendKeys(text);
    }

    public void clickButton6(){
        driver.findElement(Button6).click();
    }

    public void clickButton7(){
        driver.findElement(Button7).click();
    }

    public void clickButton8(){
        driver.findElement(Button8).click();
    }


}
