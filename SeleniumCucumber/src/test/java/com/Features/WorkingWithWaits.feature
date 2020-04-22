Feature: Working with WebDriver Synchronization and waits

Background:
#Given I have launched the chrome browser by accepting the invalid cert---this is taken care by DriverService
And I navigate to the website "https://www.yahoomail.com"

@FixedWait
Scenario: Fixed wait - using Thread.sleep
#implies only wherever specified
When I provide the username as "mustaqsqash@yahoo.co.in" and click Next button
When I wait for 12000 milliseconds
#waits for 12 secs and then performs next action
And provide the password as "2340Allahu" and click SignIn button
Then I land in the homepage of "mustaqsqash@yahoo.co.in"
#And I close the browser---this is taken care by @After hook

@ImplicitWait
Scenario: Implicit wait - using timeouts().implicitlyWait()
#implies to every driver instance
When I provide the username as "mustaqsqash@yahoo.co.in" and click Next button
When I set the implicit wait to 12 seconds
#waits for 12 secs before throwing exception for every element search
And provide the password as "2340Allahu" and click SignIn button
Then I land in the homepage of "mustaqsqash@yahoo.co.in"
#And I close the browser---this is taken care by @After hook

@ExplicitWait
Scenario: Explicit wait - using WebDriverWait class
#implies only wherever specified
#dynamic in nature and is configurable accordingly
When I provide the username as "mustaqsqash@yahoo.co.in" and click Next button
And I capture the screenshot
When I set the explicit wait to 12 seconds
#checks for element based on specified condition until maximum duration specified
And provide the password as "2340Allahu" and click SignIn button
And I capture the screenshot
Then I land in the homepage of "mustaqsqash@yahoo.co.in"
And I capture the screenshot
#And I close the browser---this is taken care by @After hook
