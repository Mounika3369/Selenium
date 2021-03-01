package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import seleniumEssay.LoginPage;

import java.awt.*;

public class StepDef {

    LoginPage login = new LoginPage();

    @Given("^the user luanch the broewser and open application$")
     public void theUserLuanchTheBroewserAndOpenApplication() throws InterruptedException {
        login.lunchBrowser();
    }

    @When("the user upload a file")
    public void theUserUploadAFile() throws InterruptedException, AWTException {
        login.uploadFile();
    }
}
