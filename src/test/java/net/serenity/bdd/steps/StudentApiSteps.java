package net.serenity.bdd.steps;

import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import org.json.JSONObject;
import static org.hamcrest.Matchers.*;

public class StudentApiSteps {
private Response response;
private RequestSpecification request;
private Response post;

    @Step
    public void getStudentApi() {
        response = RestAssured.given().header("auth","Sh@r3dSe3cr3t").
                get("http://localhost:54802/api/student");
         }

    @Step
    public void checkStatusCode() {
        response.then().assertThat().statusCode(200);
    }

    @Step
    public void getStudentDetails() {
        response.then().log().all();
    }

    public void newStudentDetail() {
        RestAssured.baseURI ="http://localhost:54802/api/student";
        request = RestAssured.given().header("auth","Sh@r3dSe3cr3t");

        JSONObject requestParams = new JSONObject();

        requestParams.put("firstName", "Api"); // Cast
        requestParams.put("lastName", "Test");
        requestParams.put("year", "2");

        request.header("Content-Type", "application/json");

        // Add the Json to the body of the request
        request.body(requestParams.toString());
    }

    public void postNewStudent() {
        // Post the request and check the response
        post = request.post("http://localhost:54802/api/student");
        int statusCode = response.getStatusCode();

    }

    public void checkNewStudent() {
        post.then().assertThat().body("firstName", containsString ("Api"));
    }


}
