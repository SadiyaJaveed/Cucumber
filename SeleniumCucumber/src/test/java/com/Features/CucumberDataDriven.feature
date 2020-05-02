Feature: Practice cucumber concepts using PHP Travels website 

Background:
	Given I have launched the PHP travels website "https://phptravels.org/"

@Parameters
Scenario: Parameterisation 
	When I enter the emailAddress as "firstname1.lastname1@test.com"
	And enter the password as "test@1"
	When I click on Login button after entering the details 
	Then I capture the screenshot of the page

@Parameters	
Scenario: Parameterisation 
	When I enter the emailAddress as "firstname2.lastname2@test.com"
	And enter the password as "test@2"
	When I click on Login button after entering the details 
	Then I capture the screenshot of the page

@Parameters
Scenario: Parameterisation  
	When I enter the emailAddress as "firstname3.lastname3@test.com"
	And enter the password as "test@3"
	When I click on Login button after entering the details 
	Then I capture the screenshot of the page

@ExampleTable
Scenario Outline: ExampleTable
	When I click on Register button in login page 
	And enter the "<FirstName>" "<LastName>" "<EmailAddress>" "<PhoneNumber>" "<HouseNumber>" "<StreetAddress>" "<City>" "<State>" "<Postcode>" "<Country>" "<FindUs>" "<Mobile>" "<Password>" "<ConfirmPassword>" in the register page 
	When I click on Register button after entering the details 
	Then I successfully land in the dashboard page 
	
	Examples: 
		|FirstName  |LastName  |EmailAddress                  |PhoneNumber |HouseNumber |StreetAddress  |City  |State     |Postcode |Country |FindUs |Mobile     |Password |ConfirmPassword| 
		|firstname2 |lastname2 |firstname2.lastname2@test.com |9876545678  |2           |streetaddress2 |city2 |Karnataka |987654   |India   |Google |9876545678 |test@2   |test@2         |
		|firstname3 |lastname3 |firstname3.lastname3@test.com |9876545678  |2           |streetaddress2 |city2 |Karnataka |987654   |India   |Google |9876545678 |test@3   |test@3         |
		|firstname4 |lastname4 |firstname4.lastname4@test.com |9876545678  |2           |streetaddress2 |city2 |Karnataka |987654   |India   |Google |9876545678 |test@4   |test@4         |
		|firstname5 |lastname5 |firstname5.lastname5@test.com |9876545678  |2           |streetaddress2 |city2 |Karnataka |987654   |India   |Google |9876545678 |test@5   |test@5         |

@DataTable	
Scenario: DataTable
	When I click on Register button in login page 
	And enter the following details in the register page 
	|FirstName    |LastName     |
	|firstnameSad |lastnameJav  |
	When I click on Register button after entering the details 
	Then I successfully land in the dashboard page 