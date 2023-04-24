package org.example;

import PageObject.*;
import com.beust.ah.A;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StepDefinitions {

   WebDriver driver;
   private final MainPage mainPage;

   private final EnrollmentPage enrollmentPage;
   private final ContactInformation contactInformation;
   private final CourseOptions courseOptions;

   private final PaymentInformation paymentInformation;


   public StepDefinitions() {
      System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
      FirefoxOptions options = new FirefoxOptions();
      options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

      driver = new FirefoxDriver(options);

      driver.manage().window().maximize();
      mainPage = new MainPage(driver);
      enrollmentPage = new EnrollmentPage(driver);
      contactInformation = new ContactInformation((driver));
      courseOptions = new CourseOptions(driver);
      paymentInformation= new PaymentInformation(driver);

   }

   @When("I write the email address of {string}")
   public void i_write_the_email_address_of(String string) {
      mainPage.writeEmailtoEmailField(string);
   }

   @When("I click the submit button")
   public void i_click_the_submit_button() {
      mainPage.clickOnSubmitButton();
   }

   @Then("the confirmation pop up appears")
   public void confirmationButtonAppears(){
      driver.switchTo().alert().accept();
   }
   @Given("I am on the main page")
   public void iAmTheMainPage() {
      driver.get("file:///C:/Users/eduar/OneDrive/Desktop/TestareSoftware/Testing-Env/index.html");
   }
   @When("I click on Virtual Read More button")
   public void I_clickOnVirtualReadMoreButton(){
      Utils.scrollToElement(driver, mainPage.getEmaiField());
      mainPage.clickOnReadMoreButton();
   }
   @Then("a Virtual Page Opens")
   public void aNewPageOpens(){
      driver.get("file:///C:/Users/eduar/OneDrive/Desktop/TestareSoftware/Testing-Env/routes/virtual.html");
      Assert.assertEquals(driver.getTitle(),"Virtual");
   }
   @When("I click on Learn Selenium Read More Button")
   public void I_clickOnLearnSeleniumReadMoreButton(){
      Utils.scrollToElement(driver,mainPage.getSeleniumButton());
      mainPage.clickOnLearnSeleniumReadMoreButton();

   }
   @Then("an Fundamentals page opens")
   public void aFundamentalsPageOpens(){
      driver.get("file:///C:/Users/eduar/OneDrive/Desktop/TestareSoftware/Testing-Env/routes/fundamentals.html");
      Assert.assertEquals(driver.getTitle(), "Selenium page");
   }
   @And("I click on Start the Enrollment button")
   public void IclickOnStartEnrollmentButton(){
      mainPage.clickOnStartEnrollmentButton();
   }
   @Then("Enrollement Page Opens")
   public void EnrollmentPageOpens(){
      Assert.assertEquals(enrollmentPage.getPersonalInformationText(),"Personal information");
   }
   @When("I write on First Name  of {string}")
   public  void I_writeFirstName(String string){
      enrollmentPage.writeFirstName(string);
   }
   @And("I write on Last Name  of {string}")
   public  void I_writeLastName(String string){
      enrollmentPage.writeLastName(string);
   }
   @And("I write on username of {string}")
   public  void I_writeUserName(String string){
      enrollmentPage.writeUserName(string);
   }
   @And("I write on password of {string}")
   public  void I_writePassword(String string){
      enrollmentPage.writePassword(string);
   }
   @And("I write on confirmed password of {string}")
   public  void I_confirmedPassword(String string){
     enrollmentPage.confirmPassword(string);
   }
   @And("I click on Next Button")
   public void I_clickonNextButton(){
      enrollmentPage.fillInPersonalInformation();
      enrollmentPage.clickOnNextButton();
   }


   @Then("a Contact Information page opens")
   public void anewPersonalInformationPageOpens(){
      driver.get("file:///C:/Users/eduar/OneDrive/Desktop/TestareSoftware/Testing-Env/routes/enrollment.html");
      enrollmentPage.fillInPersonalInformation();
      enrollmentPage.clickOnNextButton();
   }
   @When("I click on Question button")
   public void I_clickonQuestionbutton() {
      mainPage.clickonQuestionbutton();
   }
   @Then("I will be scrolled down on Frequently asked question scenario pass")
   public void IwillbescrolleddownonFAQ(){
      Assert.assertEquals(mainPage.getFaqheaderText(),"Frequently Asked Questions");

   }
   @And("I click on Instructor button")
   public void IclickonInstructorsButton(){
      mainPage.clickonInstructorsButton();;
   }
   @Then("I will be scrolled down to Our instructors")
   public void I_willbescrolleddowuntoOurInstructors(){
      Utils.scrollToElement(driver, mainPage.getJohnDoeButton());

   }
   @Given("I am on the Contact Information page")
   public void I_am_onContactInformationPage(){
      driver.get("file:///C:/Users/eduar/OneDrive/Desktop/TestareSoftware/Testing-Env/routes/enrollment.html");
      Utils.waitForElementToLoad(2);
      enrollmentPage.fillInPersonalInformation();
      enrollmentPage.clickOnNextButton();
   }
   @When("I write on Email Field of {string}")
   public void WriteEmail(String string){
      contactInformation.WriteEmail(string);
   }

   @When("Write on Phone Field of {string}")
   public void write_on_phone_field_of(String string) {
      contactInformation.WritePhoneField(string);
   }
   @When("I write on Country Field of {string}")
   public void i_write_on_country_field_of(String string) {
      contactInformation.WriteCountryField(string);
   }
   @When("I write on City Field of {string}")
   public void i_write_on_city_field_of(String string) {
      contactInformation.WriteCityField(string);

   }
   @When("I write on PostCode Field of {string}")
   public void i_write_on_post_code_field_of(String string) {
      contactInformation.WritePostcodeField(string);

   }
   @When("I click on the Next button")
   public void i_click_on_the_next_button() {
      contactInformation.fillContactInformation();
      contactInformation.clickonNextButton();

   }
   @Then("I am taken to the course options page")
   public void i_am_taken_to_the_course_options_page() {
      Assert.assertEquals(courseOptions.getCourseOptionsHeaderText(),"Course options");
   }
   @And("I click on What You'll Learn button")
   public void IclickonWhatYoulearnButton(){
      mainPage.IclickonWhatYouLearnbutton();
   }
   @Then("I will be scrolled down on What You'll Learn details")
   public void I_willbescrolleddown(){
      Utils.scrollToElement(driver,mainPage.getCSSbutton());
   }
   @Given("I am on the course options page")
   public void IamontheCourseoptionPage(){
      driver.get("file:///C:/Users/eduar/OneDrive/Desktop/TestareSoftware/Testing-Env/routes/enrollment.html");
      Utils.waitForElementToLoad(2);
      enrollmentPage.fillInPersonalInformation();
      enrollmentPage.clickOnNextButton();
      contactInformation.fillContactInformation();
      contactInformation.clickonNextButton();
   }
   @And("I select Third option button")
   public void IselectThirdoptionButton(){
      courseOptions.IselectThirdOptionButton();
   }
   @And("I click on Next button")
   public void IclickonNextoptionButton(){
      courseOptions.IclickonNextcourseOptionButton();
   }
   @Then("I am taken to the Payment Information Details")
   public void IamTakenToPaymentDetailsPage(){
      Assert.assertEquals(paymentInformation.getPaymentInformationHeader(),"Payment information");
   }
   @Given("I am on the Payment Information Details")
   public void IamonthePaymentdetailspage() {
      driver.get("file:///C:/Users/eduar/OneDrive/Desktop/TestareSoftware/Testing-Env/routes/enrollment.html");
      Utils.waitForElementToLoad(2);
      enrollmentPage.fillInPersonalInformation();
      enrollmentPage.clickOnNextButton();
      contactInformation.fillContactInformation();
      contactInformation.clickonNextButton();
      courseOptions.IselectThirdOptionButton();
      courseOptions.IclickonNextcourseOptionButton();
   }
   @And("I write Cardholder Name of {string}")
   public void Iwritecardholdername(String string){
      paymentInformation.writeCardholderName(string);
   }
   @And("I write Cardnumber field of {string}")
   public void Iwritecardnumber(String string) {
      paymentInformation.writeCardnumber(string);
   }
   @And("I write CVC field of {string}")
   public void IwriteCVCnumber(String string){
      paymentInformation.writeCVC(string);

   }
   @And("I select from the monthlist option")
   public void selectMonth(){
      Select dropdown = new Select(driver.findElement(By.id("month")));
      dropdown.selectByVisibleText("July");

   }
   @And("I select from the yearlist option")
   public void selectYear(){
      Select dropdown1 = new Select(driver.findElement(By.id("year")));
      dropdown1.selectByVisibleText("2023");
   }
   @And("I click on the Next payment button")
   public void IclickonnextPaymentbutton(){
      paymentInformation.fillPaymentInformationdetails();
      paymentInformation.IclickonNextpaymentbutton();
   }
   @Then("I complete the registration with succes")
   public void Icompletetheregistrationprocess(){
      Assert.assertEquals(paymentInformation.getSuccesHeader(),"Success!");
   }












   @After
   public void cleanUp() {
      driver.quit();
   }
}


