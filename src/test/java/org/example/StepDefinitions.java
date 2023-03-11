package org.example;

import PageObject.EnrollmentPage;
import PageObject.MainPage;
import com.beust.ah.A;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;

public class StepDefinitions {

   WebDriver driver;
   private final MainPage mainPage;

   private final EnrollmentPage enrollmentPage;

   public StepDefinitions() {
      System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
      FirefoxOptions options = new FirefoxOptions();
      options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

      driver = new FirefoxDriver(options);

      driver.manage().window().maximize();
      mainPage = new MainPage(driver);
      enrollmentPage = new EnrollmentPage(driver);
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
   @Then("a new page opens")
   public void aNewPageOpens(){
      driver.get("file:///C:/Users/eduar/OneDrive/Desktop/TestareSoftware/Testing-Env/routes/virtual.html");
   }
   @When("I click on Learn Selenium Read More Button")
   public void I_clickOnLearnSeleniumReadMoreButton(){
      Utils.scrollToElement(driver,mainPage.getSeleniumButton());
      mainPage.clickOnLearnSeleniumReadMoreButton();

   }
   @Then("an appropriate page opens")
   public void aAppropiatePageOpens(){
      driver.get("file:///C:/Users/eduar/OneDrive/Desktop/TestareSoftware/Testing-Env/routes/fundamentals.html");
      Assert.assertEquals(driver.getTitle(), "Selenium page");
   }
   @And("I click on Start the Enrollment button")
   public void IclickOnStartEnrollmentButton(){
      mainPage.clickOnStartEnrollmentButton();
   }
   @Then("Enrollement Page Opens")
   public void EnrollmentPageOpens(){
      driver.get("file:///C:/Users/eduar/OneDrive/Desktop/TestareSoftware/Testing-Env/routes/enrollment.html");
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
     enrollmentPage.clickOnNextButton();
   }
   @Then("a new Personal information Page opens")
   public void anewPersonalInformationPageOpens(){
      driver.get("file:///C:/Users/eduar/OneDrive/Desktop/TestareSoftware/Testing-Env/routes/enrollment.html");
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
   @And("If click on each instructor social media icon <Name>, <Twiter>, <Facebook>, <Linkedin>, <Instagram>")
   public void IclickOnEachInstructorsocialMediaButton(){
      driver.findElement(By.xpath("//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[1]/i"));
      driver.findElement(By.xpath("//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[2]/i"));
      driver.findElement(By.xpath("//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[3]/i"));
      driver.findElement(By.xpath("//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[4]/i"));


   }

   @After
   public void cleanUp() {
      driver.quit();
   }
}


