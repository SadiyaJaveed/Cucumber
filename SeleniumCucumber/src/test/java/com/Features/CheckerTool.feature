Feature: Test the functionality of NHS Costs Checker Tool with various postitive and negative scenarios 

Background: Common Steps for all scenarios 
	Given I have opened the NHS Cost Checker Tool 
	And click the Start button 

@Smoke 
Scenario: Start Functionality 
	To verify that I am able to initiate the process to check what help I could get to pay for NHS costs in the Checker Tool
	Then I successfully land in the Country page
		
@Positive 
Scenario: Result Under16 
	To verify that as an under sixteen I would receive help from NHS when I enter my date of birth
	When I select the Country as Wales and click Next button 
	When I provide the date as "22" month as "02" and year as "2018" 
	And click Next button
	Then I receive information regarding the help I would get with the NHS costs 
	
@Negative 
Scenario: Cannot Use The Service 
	To verify as a person from Northern Ireland I am not allowed to use the service
	When I select Country as Northern Ireland and click Next button
	Then I receive a message that I cannot use the service
	
@Negative 
Scenario: Country Not Selected 
	To verify that I receive an error when I dont select the Country
	When I click on Next button without selecting the country
	Then I receive an error  
	
@Negative 
Scenario: Accepts Only Past Date 
	To verify that the date of birth field accepts only past date
	When I select the Country as Wales and click Next button 
	When I provide the date as "22" month as "02" and year as "2021"
	And click on Next button 
	Then I receive an error message  
	
@Positive 
Scenario: Back Button Functionality 
	To verify that the back button takes me to the previous page
	When I select the Country as Wales and click Next button  
	When I click on Back button 
	Then I successfully land in the Country page 