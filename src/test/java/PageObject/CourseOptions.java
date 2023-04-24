package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseOptions {
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/h3")
    private WebElement courseOptionsHeader;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/div[3]/input")
    private WebElement ThirdOptionButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement NextOptionButton;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement NextCourseOptionButton;

    public CourseOptions(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getCourseOptionsHeaderText() {
        return courseOptionsHeader.getText();
    }
    public void IselectThirdOptionButton(){
        this.ThirdOptionButton.click();
    }
    public void IclickonNextcourseOptionButton(){
       this.NextCourseOptionButton.click();
    }
    public void selectoptionButton(){
        IselectThirdOptionButton();
    }
}
