package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentInformation {

    public PaymentInformation (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/h3")
    private WebElement PaymentInformationHeader;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement Cardholdername;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement Cardnumber;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement CVC;
    @FindBy(xpath = "//*[@id=\"month\"]")
    private WebElement MonthList;
    @FindBy(xpath = "//*[@id=\"year\"]")
    private WebElement YearList;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement NextPaymentbutton;
    @FindBy(xpath ="/html/body/div/div/section/div/form/div[5]/h3")
    private WebElement SuccesHeaderText;


    public String getPaymentInformationHeader(){
        return this.PaymentInformationHeader.getText();
    }
    public void writeCardholderName(String cardholdername){
        this.Cardholdername.sendKeys(cardholdername);
    }
    public void writeCardnumber(String cardnumber){
        this.Cardnumber.sendKeys(cardnumber);
    }
    public void writeCVC(String cvc){
        this.CVC.sendKeys(cvc);
    }
    public void selectMonthList(){
        this.MonthList.click();
    }
    public void selectYearList(){
        this.YearList.click();
    }
    public void IclickonNextpaymentbutton(){
        this.NextPaymentbutton.click();
    }
    public String getSuccesHeader(){
        return this.SuccesHeaderText.getText();
    }
    public void fillPaymentInformationdetails(){
        writeCardholderName("Sava Eduard");
        writeCardnumber("1855201120144550");
        writeCVC("012");
        selectMonthList();
        selectYearList();
    }
}