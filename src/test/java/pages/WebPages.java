package pages;
import static helper.Models.*;
import static helper.Utility.*;

import io.cucumber.java.en.And;
import io.restassured.response.Response;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import  org.assertj.core.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.time.Duration;


public class WebPages {
    Response res;

    By input_signup_username = By.id("sign-username");

    By input_signup_password = By.id("sign-password");

    By signup_button1        = By.xpath("(//*[text()='Sign up'])[3]");

    By signup_button2        = By.xpath("(//*[text()='Sign up'])[2]");

    By signup_modal          = By.xpath("//button[.='Sign up']");

    By login_button          = By.xpath("//a[.='Log in']");

    By logout_button         = By.xpath("//a[.='Log out']");

    By input_username        = By.id("loginusername");

    By input_password        = By.id("loginpassword");

    By button_login          = By.xpath("//button[.='Log in']");

    By welcome_user          = By.xpath("//a[@id='nameofuser']");

    By add_item              = By.xpath("//a[@class='hrefch'][1]");

    By add_to_cart           = By.xpath("(//*[contains(text(),'Add to cart')])");

    By cart_menu             = By.xpath("//a[@id='cartur']");

    By total_price           = By.xpath("//h3[@id='totalp']");

    By place_order           = By.xpath("(//*[contains(text(),'Place Order')])");

    By name_form             = By.xpath("//input[@id='name']");

    By country_form          = By.xpath("//input[@id='country']");

    By city_form             = By.xpath("//input[@id='city']");

    By credit_card_form      = By.xpath("//input[@id='card']");

    By month_form            = By.xpath("//input[@id='month']");

    By year_form             = By.xpath("//input[@id='year']");

    By purchase_button       = By.xpath("//button[.='Purchase']");

    By modal_mssg            = By.xpath("//h2[.='Thank you for your purchase!']");

    By btn_confirm           = By.xpath("//button[@class='confirm btn btn-lg btn-primary']");

    By delete_btn            = By.xpath("(//*[text()='Delete'])");

    By next_btn              = By.xpath("//button[.='Next']");

    By previous_btn          = By.xpath("//button[.='Previous']");

    By contact_button        = By.xpath("//a[.='Contact']");

    By contact_email         = By.xpath("//input[@id='recipient-email']");

    By contact_name          = By.xpath("//input[@id='recipient-name']");

    By message               = By.xpath("//textarea[@id='message-text']");

    By send_mssg_btn         = By.xpath("//button[.='Send message']");

    //Code
    public void openBrowser(){
        driver.get("https://www.demoblaze.com/");
    }
    public void userClickButtonSignup(){
        driver.findElement(signup_button1).click();
    }

    //verify user see element modal
    public void userShouldSeeAModal(){
        driver.findElement(signup_modal).isDisplayed();
    }

    //input username
    public void userInputSignupUsername(String username){
        driver.findElement(input_signup_username).sendKeys(username);

    }
    public void userInputSignupPassword(String password){
        driver.findElement(input_signup_password).sendKeys(password);
    }

    public void userClickButtonSignUpButtonOnModal(){
        driver.findElement(signup_button2).click();
    }

    //random username
    public void generateRandomUsername(){
        String username = randomUsername();
        driver.findElement(input_signup_username).sendKeys(username);
        System.out.println(username);
    }

    //random password
    public void generateRandomPassword(){
        String password = randomPassword();
        driver.findElement(input_signup_password).sendKeys(password);
        System.out.println(password);
    }

    //login
    public void userClickButtonLogin(){
        driver.findElement(login_button).click();
    }

    public void userInputUsername(String username){
        driver.findElement(input_username).sendKeys(username);
    }

    public void userInputPassword(String password){
        driver.findElement(input_password).sendKeys(password);
    }
    public void userClickLoginButton(){
        driver.findElement(button_login).click();
    }

    //verify welcome message
    public void userShouldSeeWelcomeMessage(String wlcm_mssg){
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.visibilityOfElementLocated(welcome_user)).getText();

        String expectedmssg = wlcm_mssg;
        String actualmssg   = driver.findElement(welcome_user).getText();

        Assertions.assertThat(actualmssg).isEqualTo(expectedmssg);

        System.out.println("Expected message :" + expectedmssg);
        System.out.println("Actual message   :" + actualmssg);
    }

    //logout
    public void userClickLogoutButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(logout_button));
        driver.findElement(logout_button).click();
    }

    //delete item
    public void userDeleteButton(){
        driver.findElement(delete_btn).click();
    }

    //next btn test
    public void userClickNextButton(){
        driver.findElement(next_btn).click();
    }
    public void userClickPreviousButton(){
        driver.findElement(previous_btn).click();
    }

    //add item
    public void userClickItem(){
        driver.findElement(add_item).click();
    }

    public void userClickButtonAddToCart(){
        driver.findElement(add_to_cart).click();
    }

    //verify popup message
    public void verifyUserWillSePopupMessage(String mssg){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String expectedMessage = mssg;
        String alertMessage = alert.getText();

        Assertions.assertThat(alertMessage).isEqualTo(expectedMessage);
        System.out.println("Expected Message :" + expectedMessage);
        System.out.println("Actual Message   :" + alertMessage);

        driver.switchTo().alert().accept();
    }

    public void userClickCartMenu (){
        driver.findElement(cart_menu).click();
    }
    public void verifyTotalPriceItem(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(total_price));
        String totalprice = driver.findElement(total_price).getText();
        System.out.println("Total price = " + totalprice);
    }
    public void userClickButtonPlaceOrder(){
        driver.findElement(place_order).click();
    }

    //fill place order modal form
    public void userInputName() {
        String name = randomName();
        driver.findElement(name_form).sendKeys(name);
        System.out.println(name);
        System.out.println(name);
    }
    public void userInputCountry() {
        String country = randomCountry();
        driver.findElement(country_form).sendKeys(country);
        System.out.println(country);
    }
    public void userInputCity() {
        String city = randomCity();
        driver.findElement(city_form).sendKeys(city);
        System.out.println(city);
    }
    public void userInputCreditCard() {
        String card = randomCredit();
        driver.findElement(credit_card_form).sendKeys(card);
        System.out.println(card);
    }
    public void userInputMonth() {
        String month = randomMonth();
        driver.findElement(month_form).sendKeys(month);
        System.out.println(month);
    }
    public void userInputYear() {
        String year = randomYear();
        driver.findElement(year_form).sendKeys(year);
        System.out.println(year);
    }
    public void userClickPurchase(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(purchase_button));
        driver.findElement(purchase_button).click();
    }

    //verify message
    public void userShouldSeeMessageSuccess(String mssg){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.visibilityOfElementLocated(modal_mssg));

        String exectedMssg = mssg;
        String actualMssg  = driver.findElement(modal_mssg).getText();

        Assertions.assertThat(actualMssg).isEqualTo(exectedMssg);
        System.out.println("Expected Message : " + exectedMssg);
        System.out.println("Actual Message   : " + actualMssg);

    }

    //test menu contact
    public void userClickMenuContact(){
        driver.findElement(contact_button).click();
    }
    public void userInputContactEmail(){
        String email = generateRandomEmail();
        driver.findElement(contact_email).sendKeys(email);
    }
    public void userInputContactName(){
        String name = randomName();
        driver.findElement(contact_name).sendKeys(name);
    }
    public void userInputMessage(){
        String mssg = randomMessage();
        driver.findElement(message).sendKeys(mssg);
    }
    public void userClickSendMessageButton(){
        driver.findElement(send_mssg_btn).click();
    }
}
