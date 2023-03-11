package PageObject;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnrollmentPage {
    public EnrollmentPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/div[1]/input")
    private WebElement FirstNameField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/div[2]/input")
    private WebElement LastNameField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/div[3]/input")
    private  WebElement UserNameField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/div[4]/input")
    private WebElement PasswordField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/div[5]/input")
    private WebElement ConfirmPasswordField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement NextButton;

    public void writeFirstName(String firstname){
        this.FirstNameField.sendKeys(firstname);
    }
    public void writeLastName(String lastname){
        this.LastNameField.sendKeys(lastname);
    }
    public void writeUserName(String username){
        this.UserNameField.sendKeys(username);
    }
    public void writePassword(String password){
        this.PasswordField.sendKeys(password);

    }
    public  void confirmPassword(String password){
        this.ConfirmPasswordField.sendKeys(password);
    }
    public void clickOnNextButton(){
        this.NextButton.click();
    }




}



