Feature: Working with alert functionality

@Alert
Scenario: Alert functionality
Given I have launched the chrome browser and navigate to "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver"
When I click on the Alert
Then I switch the control to alert and accept the alert

@ConfirmationBox
Scenario: Confirmation Box functionality
Given I have launched the chrome browser and navigate to "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver"
When I click on the Confirmation Box
Then I switch the control to alert and dismiss the alert

@Prompt
Scenario: Prompt functionality
Given I have launched the chrome browser and navigate to "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver"
When I click on the Prompt
Then I switch the control to alert and type in the alert and accept the alert