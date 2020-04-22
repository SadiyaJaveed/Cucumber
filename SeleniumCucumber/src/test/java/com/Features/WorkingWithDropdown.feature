Feature: Working with dropdown functionality

@Dropdown
Scenario: Dropdown functionality - using selectByValue
#Given I have launched the firefox browser---this is taken care by DriverService
When I navigate to "https://www.facebook.com"
And I click on the "day" dropdown and select "22"
And I click on the "month" dropdown and select "2"
And I click on the "year" dropdown and select "1989"
Then I print the values selected
#And I close the browser---this is taken care by the @After hook