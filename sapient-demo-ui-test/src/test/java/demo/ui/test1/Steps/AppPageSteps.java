package demo.ui.test1.Steps;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import demo.ui.test1.Module.AppPageModule;

public class AppPageSteps {
    protected String Anumber = null;
    protected String status = null;
    protected String cid = null;

    @Steps
    AppPageModule aSteps;
    Properties prop = new Properties();

    public AppPageSteps() throws IOException {

        InputStream input = null;
        input = getClass().getResourceAsStream("/datafile.properties");
        prop.load(input);

    }

    @Given("^go to app page")
    public void go_to_app_page() throws Throwable {
        String testURL = prop.getProperty("URL").toString();
        System.out.println("file url title = " + testURL);
        aSteps.gotoApp(testURL);
    }

    @Given("^enter search key \"([^\"]*)\"$")
    public void enter_search_key(String arg1) throws Throwable {
        aSteps.enterSearchKey(arg1);
    }

}
