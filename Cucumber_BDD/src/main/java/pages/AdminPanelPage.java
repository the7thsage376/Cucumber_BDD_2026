package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPanelPage {
    WebDriver driver;
    WebDriverWait wait;

    public AdminPanelPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//span[text()='Admin Panel']")
    WebElement adminPanelButton;

    @FindBy(xpath = "//button[contains(text(), 'Groups')]")
    WebElement groupsButton;

    @FindBy(xpath = "//button[contains(text(), '+ Create New Group')]")
    WebElement createNewGroupButton;

    @FindBy(xpath = "//input[@name='name']")
    WebElement groupNameInput;

    @FindBy(xpath = "//textarea[@name='description']")
    WebElement groupDescriptionInput;

    @FindBy(xpath = "//input[@name='year']")
    WebElement groupYearInput;

    @FindBy(xpath = "//input[@name='maxCapacity']")
    WebElement groupMaxCapacityInput;

    @FindBy(css = "input[name='startDate']")
    WebElement groupStartDateInput;

    @FindBy(css = "input[name='endDate']")
    WebElement groupEndDateInput;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement CreateGroupButton;


    public void AdminPanel(){
        adminPanelButton.click();
    }

    public void GroupsButton(){
        groupsButton.click();
    }

    public void NewGroup(){
        createNewGroupButton.click();
    }

    public void GroupNameInput(String groupName){
        groupNameInput.sendKeys(groupName);
    }

    //Add gherkin syntax later
    public void GroupDescription(){
        groupDescriptionInput.sendKeys("Group Description");
    }

    public void GroupYear(){
        groupYearInput.sendKeys("2018");
    }

    public void GroupMaxCapacity(){
        groupMaxCapacityInput.sendKeys("100");
    }

    public void GroupStartDate(){
        groupStartDateInput.sendKeys("2018");
    }

    public void GroupEndDate(){
        groupEndDateInput.sendKeys("2018");

    }

    public void CreateGroupButton(){
        CreateGroupButton.click();
    }



}
