@EmailJob 
Feature: User email jobs to others from job-detail page. 
#D8-87,D8-128

Scenario: Anonymous user emailing job 
	Given I am on Michelpage as an Anonymous user to validate emailing job 
	Then I navigate to job details page 
	When I click on "Email Job" button on Job details page 
	And I click on "Send Email" button on Email pop up 
	Then I verify "Email Field Error" Message on Email pop up 
	And I Enter "From Email" field on Email pop up 
	Then I Enter "To Email" field on Email pop up 
	And I click on "Send Email" button on Email pop up 
	Then I verify "Email has been sent successfully" Message on Email pop up 
	And I click on "Close" button on Email pop up 
	
Scenario: Authenticated user emailing job 
	Given I am on Michelpage to validate emailing job 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login" button on LoginPage 
	# And I verify "Home Page Title" Message on HomePage
	Then I navigate to Job details page of the same job saved by Anonymous user 
	And I click on "Email Job" button on Job details page 
	And I click on "Send Email" button on Email pop up 
	Then I verify "Email Fields Error" Message on Email pop up 
	Then I Enter "To Email" field on Email pop up 
	And I click on "Send Email" button on Email pop up 
	Then I verify "Email has been sent successfully" Message on Email pop up 
	And I click on "Close" button on Email pop up 
	And I logout the Application 
