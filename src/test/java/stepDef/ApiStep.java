package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ApiPages;
import io.cucumber.java.en.Given;

public class ApiStep {
    ApiPages apiPages;

    public ApiStep(){
        this.apiPages = new ApiPages();
    }

    @Given("Url valid for {string}")
    public void urlValidFor(String url) {
        apiPages.prepareforURL(url);
        System.out.println(url);
    }

    @And("Hit api get list users")
    public void hitApiGetListUsers() {
        apiPages.hitApiGetListUsers();
    }

    @Then("Status code should be {int}")
    public void statusCodeShouldBe(int statusCode) {
        apiPages.statusCodeShouldBe(statusCode);
    }

    @Then("Validation response body get list data")
    public void validationResponseBodyGetListData() {
        apiPages.Validationresponsebodygetlistdata();
    }

    @Then("Validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String filename) {
        apiPages.validationResponseJsonWithJSONSchema(filename);
    }

    @Then("Hit api post create user")
    public void hitApiPostCreateUser() {
        apiPages.hitApiPostCreateUser();
    }

    @Then("Validation response body create new user")
    public void validationResponseBodyCreateNewUser() {
        apiPages.validationResponseBodyCreateNewUser();
    }

    @And("Hit api delete new")
    public void hitApiDeleteNew() {
        apiPages.hitApiDeleteNew();
    }

    //negative test
    @Given("Url invalid for {string}")
    public void urlInvalidFor(String url) {
        apiPages.prepareforURL(url);
    }

    @Then("Hit api get list user with invalid endpoint")
    public void hitApiGetListUserWithInvalidEndpoint() {
        apiPages.hitApiGetListUserWithInvalidEndpoint();
    }

    @And("Response body containt {string}")
    public void responseBodyContaint(String noMssg) {
        apiPages.responseBodyContaint(noMssg);
    }

    @Then("Hit api post create invalid user")
    public void hitApiPostCreateInvalidUser() {
        apiPages.hitApiPostCreateInvalidUser();
    }

    @And("Hit api update data")
    public void hitApiUpdateData() {
        apiPages.hitApiUpdateData();
    }

    @Then("Validation response body update user")
    public void validationResponseBodyUpdateUser() {
    }
}
