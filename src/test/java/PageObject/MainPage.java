package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emaiField;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement virtualReadMoreButton;

    @FindBy(xpath = "/html/body/section[5]/div/div/div[2]/img")
    private WebElement SeleniumButton;

    @FindBy(xpath = "/html/body/section[5]/div/div/div[1]/a")
    private WebElement ReadMoreLearnSeleniumButton;
    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement StartEnrollmentButton;
    private WebDriver driver;

    @FindBy(xpath = "/html/body/section[6]/div/h2")
    private WebElement Faqheader;
    @FindBy(xpath = "/html/body/nav/div/div/ul/li[2]/a")
    private WebElement Questionbutton;
    @FindBy(xpath = "/html/body/nav/div/div/ul/li[3]/a")
    private WebElement InstructorsButton;
    @FindBy(xpath = "/html/body/section[7]/div/div/div[1]/div/div/a[1]/i")
    private WebElement JohnTwitterButton;

    @FindBy(xpath = "/html/body/section[7]/div/div/div[1]/div/div/img")
    private WebElement JohnDoeButton;

    @FindBy(xpath = "/html/body/section[7]/div/div/div[1]/div/div/a[2]/i")
    private WebElement JohnFacebookButton;

    @FindBy(xpath = "/html/body/section[7]/div/div/div[1]/div/div/a[3]/i")
    private WebElement JohnLinkedinButton;

    @FindBy(xpath = "/html/body/section[7]/div/div/div[1]/div/div/a[4]/i")
    private WebElement JohnInstagramButton;
    @FindBy(xpath = "/html/body/nav/div/div/ul/li[1]/a")
    private WebElement WhatYouLearnbutton;

    @FindBy(xpath = "/html/body/section[4]/div/div/div[1]/img")
    private WebElement CSSbutton;



    public MainPage(WebDriver driver){
     PageFactory.initElements(driver,this);
    }
    public void clickOnSubmitButton(){
        this.submitButton.click();
}
    public void writeEmailtoEmailField(String email){
        this.emaiField.sendKeys(email);
}
    public void the_confirmation_pop_up_appears() {
        this.the_confirmation_pop_up_appears();
    }
    public void clickOnReadMoreButton(){
        this.virtualReadMoreButton.click();
    }
    public void clickOnLearnSeleniumReadMoreButton(){
        this.ReadMoreLearnSeleniumButton.click();
    }

    public WebElement getEmaiField() {
        return this.emaiField;
    }
    public WebElement getSeleniumButton(){
        return this.SeleniumButton;
    }

    public WebElement getReadMoreLearnSeleniumButton(){
        return this.ReadMoreLearnSeleniumButton;
    }
    public WebElement getStarttheEnrollmentButton(){
        return this.getStarttheEnrollmentButton();
    }
    public WebElement getJohnDoeButton() {
        return this.getJohnDoeButton();
    }

    public void clickOnStartEnrollmentButton(){
        this.StartEnrollmentButton.click();
    }
    public String getFaqheaderText(){
        return this.Faqheader.getText();
    }
    public void clickonQuestionbutton(){
        this.Questionbutton.click();
    }
    public void clickonInstructorsButton(){
        this.InstructorsButton.click();
    }
    public void clickonEachSocialMediaButton(){
        this.JohnTwitterButton.click();
    }
    public void IclickonWhatYouLearnbutton(){
        this.WhatYouLearnbutton.click();
    }
    public WebElement getCSSbutton(){
        return this.CSSbutton;
    }

    }




