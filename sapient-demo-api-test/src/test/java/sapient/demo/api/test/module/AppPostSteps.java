package sapient.demo.api.test.module;

import static net.serenitybdd.rest.SerenityRest.rest;

import java.io.IOException;

import net.thucydides.core.annotations.Step;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.SSLConfig;

public class AppPostSteps {

    public AppPostSteps() {
        RestAssured.baseURI = "https://54.208.105.112";
        // RestAssured.port = 8380;
        // RestAssured.basePath = "";
    }

    @Step
    @Test
    public void CreateFirstAppointment() throws IOException {
        String jsonBody = IOUtils.toString(
                this.getClass().getResourceAsStream("/createNewAppointment.json"));
        final String responseBody = rest()
                .given()
                .config(RestAssured.config().sslConfig(new SSLConfig().allowAllHostnames()))
                .contentType("application/json; charset=UTF-8")
                .body(jsonBody)
                .when()
                .post("/appointments.json")
                .prettyPrint();

        JSONObject obj = new JSONObject(responseBody);
        String userName = obj.getString("lastname");

        assert (userName.contains("Applicant"));

    }

    @Step
    @Test
    public void CreateSecondAppointment() throws IOException {
        String jsonBody = IOUtils.toString(
                this.getClass().getResourceAsStream("/createNewAppointment.json"));
        String responseBody = rest()
                .given()
                .config(RestAssured.config().sslConfig(new SSLConfig().allowAllHostnames()))
                .contentType("application/json; charset=UTF-8")
                .body(jsonBody)
                .when()
                .post("/appointments.json")
                .prettyPrint();

        JSONObject obj = new JSONObject(responseBody);
        String userName = obj.getString("lastname");

        System.out.println("user name = " + userName);

    }

    @Step
    @Test
    public void CreatethirdAppointment() throws IOException {
        String jsonBody = IOUtils.toString(
                this.getClass().getResourceAsStream("/createNewAppointment.json"));
        String responseBody = rest()
                .given()
                .config(RestAssured.config().sslConfig(new SSLConfig().allowAllHostnames()))
                .contentType("application/json; charset=UTF-8")
                .body(jsonBody)
                .when()
                .post("/appointments.json")
                .prettyPrint();

    }

    @Step
    @Test
    public void createStaff() throws IOException {
        String jsonBody = IOUtils.toString(
                this.getClass().getResourceAsStream("/createStaff.json"));
        String responseBody = rest()
                .given()
                .config(RestAssured.config().sslConfig(new SSLConfig().allowAllHostnames()))
                .contentType("application/json; charset=UTF-8")
                .body(jsonBody)
                .when()
                .post("/staffs.json")
                .prettyPrint();

    }
}
