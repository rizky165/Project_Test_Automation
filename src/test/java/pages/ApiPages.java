package pages;

import helper.Endpoint;
import helper.Utility;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.File;
import java.util.List;

import static helper.Models.*;
import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiPages {

    String setURL, global_id;
    Response res;
    public void prepareforURL(String url){
        switch (url) {
            case "GET_LIST_USER":
                setURL = Endpoint.GET_LIST_USER;
                break;
            case "CREATE_NEW_USER":
                setURL = Endpoint.CREATE_NEW_USER;
                break;
            case "DELETE_USER":
                setURL = Endpoint.DELETE_USER;
                break;
            case  "INVALID_ENDPOINT":
                setURL = Endpoint.INVALID_ENDPOINT;
            default:
                System.out.println("URL");
        }
        System.out.println("Endpoint :" + setURL);
    }

    public void hitApiGetListUsers(){
        res = getListUsers(setURL);
        System.out.println(res.getBody().asString());
    }
    public void statusCodeShouldBe(Integer statusCode){
        assertThat(res.statusCode()).isEqualTo(statusCode);
        System.out.println(statusCode);
    }
    public void Validationresponsebodygetlistdata(){
        List<Object> id = res.jsonPath().getList("id");
        List<Object> name = res.jsonPath().getList("name");
        List<Object> email = res.jsonPath().getList("email");
        List<Object> gender = res.jsonPath().getList("gender");
        List<Object> status = res.jsonPath().getList("status");

        assertThat(id.get(0)).isNotNull();
        assertThat(name.get(0)).isNotNull();
        assertThat(email.get(0)).isNotNull();
        assertThat(gender.get(0)).isIn("female", "male");
        assertThat(status.get(0)).isIn("active", "inactive");
    }

    public void validationResponseJsonWithJSONSchema(String filename){
        File JSONFile = Utility.getJSONSchemaFile(filename);
        res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JSONFile));
        System.out.println(JSONFile);
    }

    public void hitApiPostCreateUser(){
        res = postCreateUser(setURL);
        System.out.println(res.getBody().asString());
    }
    public void validationResponseBodyCreateNewUser() {
        JsonPath jsonPath = res.jsonPath();
        Integer id = jsonPath.get("id");
        String name = jsonPath.get("name");
        String email = jsonPath.get("email");
        String gender = jsonPath.get("gender");
        String status = jsonPath.get("status");

        assertThat(id).isNotNull();
        assertThat(name).isNotNull();
        assertThat(email).isNotNull();
        assertThat(gender).isIn("female", "male");
        assertThat(status).isIn("active", "inactive");
        global_id = Integer.toString(id);
    }
    public void hitApiDeleteNew() {
        res = deleteUser(setURL, global_id);
    }

    public void hitApiGetListUserWithInvalidEndpoint(){
        res = getListUsers(setURL);
        System.out.println(res.getBody().asString());
    }
    public void responseBodyContaint(String noMssg){
        assertThat(res.getBody().asString());
    }
    public void hitApiPostCreateInvalidUser(){
        res = postCreateInvalidUser(setURL);
        System.out.println(res.getBody().asString());
    }
    public void hitApiUpdateData(){
        res = updateUser(setURL,global_id);
        System.out.println(res.getBody().asString());
    }

}
