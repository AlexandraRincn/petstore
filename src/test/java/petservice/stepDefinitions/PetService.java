package petservice.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class PetService {

    private RequestSpecification request;
    private Response response;
    String url = "https://petstore.swagger.io/v2";


    @Given("I have a header")
    public void iHaveAHeader() {
        request = given().headers(
                "Content-Type",
                "application/json",
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON);
    }

    @And("I create a get request with {string}")
    public void ICreateGetRequestPet(String status){
        response = request.when()
                .get(url+"/pet/findByStatus?status="+status);
    }

    @Then("I see status code 200 in DB")
    public void iGetStatusFromDB() {
        Assert.assertEquals(200, response.getStatusCode());
    }

    @And("I see name and ID in JSON response")
    public void iSendRequestToGetPet(){
        String Name = response.jsonPath().getString("category");
        System.out.print(Name);
    }



}
