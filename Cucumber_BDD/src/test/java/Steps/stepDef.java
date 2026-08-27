package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class stepDef extends BasePage {


    @Given("^I am on the login page$")
    public void I_login_To_Website() {
        loginPage.clickLoginButton();
    }

    @And("^I enter email (.*)$")
    public void I_enter_email( String email) {
        loginPage.LoginEmailField(email);
    }

    @And("^I enter password (.*)$")
    public void I_enter_password( String password) {
        loginPage.LoginPasswordField(password);
    }

    @When("^I click the login button$")
    public void Click_login_button() {
        loginPage.clickLoginSubmit();
    }

    // AI suggestion for the use of contains
    @Then("^I should be logged in successfully$")
    public void I_should_be_logged_in_successfully() {
        Assert.assertTrue(driver.getPageSource().contains("Welcome back"));
    }

    @And("^I click on the logged in user$")
    public void I_click_on_the_logged_in_user() {
        dashboardPage.clickMenuButton();
    }

    @And("^I click on the admin panel$")
    public void I_click_on_the_admin_panel() {
        dashboardPage.clickAdminPanelButton();
    }

    @And("^I click on the groups tab$")
    public void I_click_on_the_groups_tab() {
        adminPanelPage.GroupsButton();
    }

    @And("^I click on the new group button$")
    public void I_click_on_the_new_group_button() {
        adminPanelPage.NewGroup();
    }
    //Ask about how this relates to gherkin syntax later
    @And("^I enter group name (.*)$")
    public void I_enter_group_name(String groupName) {
        adminPanelPage.GroupNameInput(groupName);
    }

    // fix later
    @And("^I enter group description (.*)$")
    public void I_enter_group_description(String groupDescription) {
        adminPanelPage.GroupDescription(groupDescription);
    }

    @And("^I enter year (.*)$")
    public void I_enter_year(String year) {
        adminPanelPage.GroupYear(year);
    }

    @And("^I enter max capacity (.*)$")
    public void I_enter_max_capacity(String maxCapacity) {
        adminPanelPage.GroupMaxCapacity(maxCapacity);
    }

    @And("^I enter start date (.*)$")
    public void I_enter_start_date(String startDate) {
        adminPanelPage.GroupStartDate(startDate);
    }

    @And("^I enter end date (.*)$")
    public void I_enter_end_date(String endDate) {
        adminPanelPage.GroupEndDate(endDate);
    }

    @When("^I click on the create group button$")
    public void I_click_on_the_create_group_button() {
        adminPanelPage.CreateGroupButton();
    }

    //Fix Gherkin syntax and typo mistake later
}


