package sapient.demo.api.test.steps;

import sapient.demo.api.test.module.AppGetSteps;
import sapient.demo.api.test.module.AppPostSteps;
import cucumber.api.java.en.Given;

public class AppSmokeTestSteps {

    AppPostSteps appointmentPost = new AppPostSteps();
    AppGetSteps appointmentGet = new AppGetSteps();

    @Given("^create first appointment$")
    public void create_first_appointment() throws Throwable {

        appointmentPost.CreateFirstAppointment();
    }

    @Given("^create second appointment$")
    public void create_second_appointment() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        appointmentPost.CreateSecondAppointment();
    }

    @Given("^create third appointment$")
    public void create_third_appointment() throws Throwable {
        appointmentPost.CreatethirdAppointment();
    }

    @Given("^get office names$")
    public void get_office_names() throws Throwable {
        appointmentGet.getOfficesName();

    }
}
