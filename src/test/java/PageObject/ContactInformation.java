package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformation {

    public ContactInformation (WebDriver driver){
    PageFactory.initElements(driver,this);
}
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/div[1]/input")
    private WebElement EmailField;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement PhoneField;

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement CountryField;

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement CityField;

    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement PostcodeField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement NextButton;


    public void WriteEmail(String email){
        this.EmailField.sendKeys(email);
    }
    public void WritePhoneField(int phone){
        this.PhoneField.sendKeys(phone);
    }
    public void WriteCountryField(String country){
        this.CountryField.sendKeys(country);
    }
    public void WriteCityField(String city){
        this.CityField.sendKeys(city);
    }
    public void WritePostcodeField(String postcode){
        this.PostcodeField.sendKeys(postcode);
    }
    public void clickonNextButton (){
        this.NextButton.click();
    }






}
