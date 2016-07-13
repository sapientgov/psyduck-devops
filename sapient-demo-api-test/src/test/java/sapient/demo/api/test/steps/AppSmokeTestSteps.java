package sapient.demo.api.test.steps;

import sapient.demo.api.test.module.AppPostSteps;
import cucumber.api.java.en.Given;

public class AppSmokeTestSteps {

    AppPostSteps appointmentPost = new AppPostSteps();

    @Given("^create new apointment$")
    public void create_new_apointment() throws Throwable {

        appointmentPost.CreateNewUserAppointment();
    }
}
