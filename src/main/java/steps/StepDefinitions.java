package steps;

import base.Config;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepDefinitions extends BaseStepDefinitions {

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        System.out.println(testsContext.a);
        scenario.log(String.valueOf(testsContext.a));
        testsContext.a = cukes;
        System.out.println(testsContext.a);
        scenario.log(String.valueOf(testsContext.a));
    }

    @Given("Make request")
    public void makeGetRequest() {
        RequestSpecification request = RestAssured.given();
        // Setting Base URI
        request.baseUri(Config.appBaseURL);
        // Setting Base Path
        request.basePath("/books/v1/volumes");

        request.param("q", "paulo+coelho");

        Response response = request.get();

        System.out.println(response.asString());
    }
}
