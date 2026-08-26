package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.Assert;
import pages.DashboardPage;
import pages.LoginPage;

public class stepDef extends BasePage {


    @Given("i am on the login page")
    public void I_login_To_Website() {
        loginPage.clickLoginButton();
    }

    @And("I enter email")
    public void I_enter_email() {
        loginPage.LoginEmailField();
    }

    @And("I enter password")
    public void I_enter_password() {
        loginPage.LoginPasswordField();
    }

    @When("I click the login button")
    public void Click_login_button() {
        loginPage.clickLoginSubmit();
    }

    // AI suggestion for the use of contains
    @Then("I should be logged in successfully")
    public void I_should_be_logged_in_successfully() {
        Assert.assertTrue(driver.getPageSource().contains("Welcome back"));
    }

    @And(" I click on the logged in user")
    public void I_click_on_the_logged_in_user() {
        dashboardPage.clickMenuButton();
    }

    @And("I click on the admin panel")
    public void I_click_on_the_admin_panel() {
        dashboardPage.clickAdminPanelButton();
    }

    @And("I click on the groups tab")
    public void I_click_on_the_groups_tab() {
        adminPanelPage.GroupsButton();
    }

    @And("I click on the new group button")
    public void I_click_on_the_new_group_button() {
        adminPanelPage.NewGroup();
    }
    //Ask about how this relates to gherkin syntax later
    @And("I enter group name <groupName>")
    public void I_enter_group_name(String groupName) {
        adminPanelPage.GroupNameInput(groupName);
    }

    // fix later
    @And("I enter group description <groupDescription>")
    public void I_enter_group_description(String groupDescription) {
        adminPanelPage.GroupDescription();
    }

    @And("I enter year <year>")
    public void I_enter_year(String year) {
        adminPanelPage.GroupYear();
    }

    @And("I enter max capacity <maxCapacity>")
    public void I_enter_max_capacity(String maxCapacity) {
        adminPanelPage.GroupMaxCapacity();
    }

    @And("I enter start date <startDate>")
    public void I_enter_start_date(String startDate) {
        adminPanelPage.GroupStartDate();
    }

    @And("I enter end date <endDate>")
    public void I_enter_end_date(String endDate) {
        adminPanelPage.GroupEndDate();
    }

    @When("I click on the create group button")
    public void I_click_on_the_create_group_button() {
        adminPanelPage.CreateGroupButton();
    }

    //Fix Gherkin syntax and typo mistake later
}


