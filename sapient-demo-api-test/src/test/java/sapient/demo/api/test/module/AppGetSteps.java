package sapient.demo.api.test.module;

import static net.serenitybdd.rest.SerenityRest.rest;
import net.thucydides.core.annotations.Step;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.SSLConfig;

public class AppGetSteps {

    public AppGetSteps() {
        RestAssured.baseURI = "https://54.208.105.112";

    }

    @Step
    public void getOfficesName() {

        rest()
                .given().config(RestAssured.config().sslConfig(new SSLConfig().allowAllHostnames()))
                .get("/offices.json")
                .then()
                .assertThat()
                .statusCode(200);
    }

}
