package net.serenity.bdd.ui;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import static org.hamcrest.Matchers.containsString;

public class AddStudentService {

    private Response response;
    private RequestSpecification request;
    private Response post;

    public void getStudent() {
        response = RestAssured.given().header("auth", "Sh@r3dSe3cr3t").
                get("http://localhost:54802/api/student");
    }

    public void getStatusLog() {
        response.then().assertThat().statusCode(200);
        response.then().log().all();
    }

    public void newStudent() {
        RestAssured.baseURI = "http://localhost:54802/api/student";
        request = RestAssured.given().header("auth", "Sh@r3dSe3cr3t");

        JSONObject requestParams = new JSONObject();
        requestParams.put("firstName", "Api"); // Cast
        requestParams.put("lastName", "Test");
        requestParams.put("year", "2");

        request.header("Content-Type", "application/json");

        // Add the Json to the body of the request
        request.body(requestParams.toString());
    }

    public void postStudent() {
        // Post the request and check the response
        post = request.post("http://localhost:54802/api/student");
        int statusCode = response.getStatusCode();
        post.then().assertThat().body("firstName", containsString ("Api"));
    }

}
