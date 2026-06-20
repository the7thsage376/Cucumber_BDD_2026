package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class stepDef extends BasePage{

    @Given("i am on the login page")
    public void clickLoginButton(){
        loginButton.click();
    }
}
