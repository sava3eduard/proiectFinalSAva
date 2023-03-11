Feature: An example

  Scenario: The example
    Given I am on the main page
    When I write the email address of "test@tester.com"
    And I click the submit button
    Then the confirmation pop up appears

  Scenario: Negative #1
    Given I am on the main page
    When I write the email address of "test@tester.ro"
    And I click the submit button
    Then the confirmation pop up appears

  Scenario: Negative #2
    Given I am on the main page
    When I write the email address of "testsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestssss"
    And I click the submit button

  Scenario: Read More Virtual Button
    Given I am on the main page
    When I click on Virtual Read More button
    Then a new page opens

    Scenario: Negative #3
      Given I am on the main page
      When I click on Learn Selenium Read More Button
      Then an appropriate page opens

    Scenario: Start the Enrollment
      Given I am on the main page
      And I click on Start the Enrollment button
      Then Enrollement Page Opens

    Scenario: Personal Information details
      Given I am on the main page
      And I click on Start the Enrollment button
      Then Enrollement Page Opens
      When I write on First Name  of ""
      And I write on Last Name  of ""
      And I write on username of ""
      And I write on password of ""
      And I write on confirmed password of ""
      And I click on Next Button
      Then a new Personal information Page opens

      Scenario: Contact Information Detail
        Given I am on the Contact Information page
        When I write on Email Field of {string}
        And Write on Phone Field of {int}
        And I write

     Scenario: Frequently asked question
       Given I am on the main page
       When I click on Question button
       Then I will be scrolled down on Frequently asked question scenario pass


     Scenario Outline: Our instructors
       Given I am on the main page
       And I click on Instructor button
       Then I will be scrolled down to Our instructors
       And If click on each instructor social media icon <Name>, <Twiter>, <Facebook>, <Linkedin>, <Instagram>
       Then for each intructor I will be redirected to social media page
       Examples:

       |Name| |Twiter|  |Facebook|  |Linkedin|  |Instagram|
       |John Doe| |https://twitter.com/| |https://www.facebook.com/| |https://www.linkedin.com| |https://www.instagram.com/|
       |Jane Doe| |https://twitter.com/| |https://www.facebook.com/| |https://www.linkedin.com| |https://www.instagram.com/|
       |Steve Smith| |https://twitter.com/| |https://www.facebook.com/| |https://www.linkedin.com| |https://www.instagram.com/|
       |Sara Smith | |https://twitter.com/| |https://www.facebook.com/| |https://www.linkedin.com| |https://www.instagram.com/|








