Feature: Proiect

  Scenario:  Valid email address EN
    Given I am on the main page
    When I write the email address of "test@tester.com"
    And I click the submit button
    Then the confirmation pop up appears

  Scenario: Valid email address RO
    Given I am on the main page
    When I write the email address of "test@tester.ro"
    And I click the submit button
    Then the confirmation pop up appears

  Scenario: Invalid email adress
    Given I am on the main page
    When I write the email address of "testsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestssss"
    And I click the submit button


  Scenario: Read More Virtual Button
    Given I am on the main page
    When I click on Virtual Read More button
    Then a Virtual Page Opens

  Scenario: Negative-Uncorrespondent description page
    Given I am on the main page
    When I click on Learn Selenium Read More Button
    Then an Fundamentals page opens

  Scenario: Start the Enrollment
    Given I am on the main page
    And I click on Start the Enrollment button
    Then Enrollement Page Opens

  Scenario: What You'll Learn button
    Given I am on the main page
    And I click on What You'll Learn button
    Then I will be scrolled down on What You'll Learn details


  Scenario: Personal Information details
    Given I am on the main page
    And I click on Start the Enrollment button
    When I write on First Name  of "Sava"
    And I write on Last Name  of "Eduard"
    And I write on username of "eduard192"
    And I write on password of "xxxxx"
    And I write on confirmed password of "xxxxx"
    And I click on Next Button
    Then a Contact Information page opens

  Scenario: Contact Information Detail
    Given I am on the Contact Information page
    When I write on Email Field of "eduard@gmail.com"
    And Write on Phone Field of "0738523580"
    And I write on Country Field of "brasov"
    And I write on City Field of "brasov"
    And I write on PostCode Field of "e139au"
    And I click on the Next button
    Then I am taken to the course options page

  Scenario: Course options choice
    Given I am on the course options page
    And I select Third option button
    And I click on Next button
    Then I am taken to the Payment Information Details

  Scenario: Payment Information details
    Given  I am on the Payment Information Details
    And I write Cardholder Name of "Sava Eduard"
    And I write Cardnumber field of "1855201120144550"
    And I write CVC field of "012"
    And I select from the monthlist option
    And I select from the yearlist option
    And I click on the Next payment button
    Then I complete the registration with succes



   Scenario: Frequently asked question
    Given I am on the main page
    When I click on Question button
    Then I will be scrolled down on Frequently asked question scenario pass











