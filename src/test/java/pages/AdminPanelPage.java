package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPanelPage {
    WebDriver driver;
    WebDriverWait wait;

    public AdminPanelPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
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

        wait.until(ExpectedConditions.elementToBeClickable(adminPanelButton)).click();
    }

    public void GroupsButton(){
        wait.until(ExpectedConditions.elementToBeClickable(groupsButton)).click();
    }

    public void NewGroup(){
        wait.until(ExpectedConditions.elementToBeClickable(createNewGroupButton)).click();
    }

    public void GroupNameInput(String groupName){

        wait.until(ExpectedConditions.visibilityOf(groupNameInput)).sendKeys(groupName);
    }

    //Add gherkin syntax later
    public void GroupDescription(String groupDescription){
        wait.until(ExpectedConditions.visibilityOf(groupDescriptionInput)).sendKeys(groupDescription);
    }

    public void GroupYear( String year){
        wait.until(ExpectedConditions.visibilityOf(groupYearInput)).sendKeys(year);
    }

    public void GroupMaxCapacity(String maxCapacity){
        wait.until(ExpectedConditions.visibilityOf(groupMaxCapacityInput)).sendKeys(maxCapacity);
    }

    public void GroupStartDate( String startDate){
        wait.until(ExpectedConditions.visibilityOf(groupStartDateInput)).sendKeys(startDate);
    }

    public void GroupEndDate(String endDate){
        wait.until(ExpectedConditions.visibilityOf(groupEndDateInput)).sendKeys(endDate);
    }

    public void CreateGroupButton(){
        wait.until(ExpectedConditions.elementToBeClickable(CreateGroupButton)).click();
    }


}
