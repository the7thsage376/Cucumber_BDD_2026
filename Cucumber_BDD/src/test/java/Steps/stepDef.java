package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import pages.DashboardPage;
import pages.LoginPage;

public class stepDef extends BasePage{


    @Given("i am on the login page")
    public void I_login_To_Website(){
        loginPage.clickLoginButton();
    }

    @And("I enter email")
    public void I_enter_email(){
        loginPage.LoginEmailField();
    }

    @And("I enter password")
    public void I_enter_password(){
        loginPage.LoginPasswordField();
    }

    @When("I click the login button")
    public void Click_login_button(){
        loginPage.clickLoginSubmit();
    }

//    @Then("I should be logged in successfully")
//    //add assertion here


    @And(" I click on the logged in user")
    public void I_click_on_the_logged_in_user(){
        DashboardPage.clickAdminPanelButton()
    }
}


