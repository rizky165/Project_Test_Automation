package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static helper.Utility.*;

public class Models {

    private static RequestSpecification request;

    public static void setupHeaders(){
        request = RestAssured.given()
                .header("Content-type","application/json")
                .header("Accept","application/json")
                .header("Authorization", "Bearer 873e7322c1189814a537efb350d1014a1d25294792fdb343a67bb3f70f4ebbe9");
    }

    public static Response getListUsers(String endpoint){
        setupHeaders();
        return request.when().get(endpoint);
    }

    public static Response postCreateUser(String endpoint){
        String name     = "Rizky Yalvinsya";
        String gender   = "male";
        String email    = generateRandomEmail();
        String status   = "active";

        JSONObject payload = new JSONObject();

        payload.put("name", name);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("status", status);

        setupHeaders();
        return request.body(payload.toString()).when().post(endpoint);
    }
    public static Response deleteUser(String endpoint, String user_id){
        setupHeaders();
        String finalendpoint = endpoint + "/" + user_id;
        return request.when().delete(finalendpoint);
    }

    public static Response postCreateInvalidUser(String endpoint){
        String name = "Rizky Fachrieza Yalvinsya";
        String gender = "male";
        String email = " ";

        String status = "active";
        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("status", status);

        setupHeaders();
        return request.when().body(payload.toString()).when().post(endpoint);
    }

    public static Response updateUser(String endpoint, String user_id) {
        String name = "Rizky Yalvinsya";
        String gender = "male";
        String email = generateRandomEmail();
        String status = "active";
        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("status", status);

        setupHeaders();

        String finalendpoint = endpoint + "/" + user_id;
        return request.body(payload.toString()).when().patch(finalendpoint);
    }

    //WEB
    public static String randomUsername(){
        String username = generateUsername();
        return username;
    }
    public static String randomPassword(){
        String password = generatePassword();
        return password;
    }
    public static String randomName(){
        String name = generateName();
        return name;
    }
    public static String randomCountry(){
        String country = generateCountry();
        return country;
    }
    public static String randomCity(){
        String city = generateCity();
        return city;
    }
    public static String randomCredit(){
        String card = generateCard();
        return card;
    }
    public static String randomMonth(){
        String month = generateMonth();
        return month;
    }
    public static String randomYear(){
        String year = generateYear();
        return year;
    }
    public static String randomMessage(){
        String msg  = generateMessage();
        return msg;
    }
}
