package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.WebPages;

public class WebStep {

    WebPages webPages;

    public WebStep(){
        this.webPages = new WebPages();
    }

    @Given("open web Demoblaze")
    public void openWebDemoblaze() {
        webPages.openBrowser();
    }

    @And("user click button sign up")
    public void userClickButtonSignup() {
        webPages.userClickButtonSignup();
    }

    @Then("user should see a Sign Up modal")
    public void userShouldSeeAModal() {
        webPages.userShouldSeeAModal();
    }

    @And("user input signup username {string}")
    public void userInputSignupUsername(String username) {
        webPages.userInputSignupUsername(username);
    }

    @And("user input signup password {string}")
    public void userInputSignupPassword(String password) {
        webPages.userInputSignupPassword(password);
    }

    @And("user click button sign up button on modal")
    public void userClickButtonSignUpButtonOnModal() {
        webPages.userClickButtonSignUpButtonOnModal();
    }


    //login
    @And("user click button login")
    public void userClickButtonLogin() {
        webPages.userClickButtonLogin();
    }

    @And("user input username {string}")
    public void userInputUsername(String username) {
        webPages.userInputUsername(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        webPages.userInputPassword(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        webPages.userClickLoginButton();
    }

    @Then("user will see error message")
    public void userWillSeeErrorMessage() {
    }

    @Then("user should see welcome message {string}")
    public void userShouldSeeWelcomeMessage(String wlcm_mssg) {
        webPages.userShouldSeeWelcomeMessage(wlcm_mssg);
    }

    @And("user click item")
    public void userClickItem() {
        webPages.userClickItem();
    }

    @And("user click button add to cart")
    public void userClickButtonAddToCart() {
        webPages.userClickButtonAddToCart();
    }

    @Then("verify user will se popup message {string}")
    public void verifyUserWillSePopupMessage(String mssg) {
        webPages.verifyUserWillSePopupMessage(mssg);
    }


    @And("user click logout button")
    public void userClickLogoutButton() {
        webPages.userClickLogoutButton();
    }

    @And("user click cart menu")
    public void userClickCartMenu() {
        webPages.userClickCartMenu();
    }

    @Then("verify total price item")
    public void verifyTotalPriceItem() {
        webPages.verifyTotalPriceItem();
    }

    @And("user click button place order")
    public void userClickButtonPlaceOrder() {
        webPages.userClickButtonPlaceOrder();
    }

    //random username
    @And("user input signup random username")
    public void userInputSignupRandomUsername() {
        webPages.generateRandomUsername();
    }

    //random password
    @And("user input signup random password")
    public void userInputSignupRandomPassword() {
        webPages.generateRandomPassword();
    }

    @And("user input name")
    public void userInputName() {
        webPages.userInputName();
    }

    @And("user input country")
    public void userInputCountry() {
        webPages.userInputCountry();
    }

    @And("user input city")
    public void userInputCity() {
        webPages.userInputCity();
    }

    @And("user input credit card")
    public void userInputCreditCard() {
        webPages.userInputCreditCard();
    }

    @And("user input month")
    public void userInputMonth() {
        webPages.userInputMonth();
    }

    @And("user input year")
    public void userInputYear() {
        webPages.userInputYear();
    }

    @And("user click purchase")
    public void userClickPurchase() {
        webPages.userClickPurchase();
    }

    @Then("user should see message success purchase {string}")
    public void userShouldSeeMessageSuccessPurchase(String mssg) {
        webPages.userShouldSeeMessageSuccess(mssg);
    }

    @And("user delete button")
    public void userDeleteButton() {
        webPages.userDeleteButton();

    }
    
    @And("user click next button")
    public void userClickNextButton() {
        webPages.userClickNextButton();
    }

    @And("user click previous button")
    public void userClickPreviousButton() {
        webPages.userClickPreviousButton();
    }

    @And("user click menu contact")
    public void userClickMenuContact() {
        webPages.userClickMenuContact();
    }

    @And("user input contact email")
    public void userInputContactEmail() {
        webPages.userInputContactEmail();
    }

    @And("user input contact name")
    public void userInputContactName() {
        webPages.userInputContactName();
    }

    @And("user input message")
    public void userInputMessage() {
        webPages.userInputMessage();
    }

    @And("user click send message button")
    public void userClickSendMessageButton() {
        webPages.userClickSendMessageButton();
    }
}



