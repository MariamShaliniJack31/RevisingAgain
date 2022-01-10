@EmailJobFrenchLanguage 
Feature: User email French language jobs to others from job-detail page 

#D8-353
Scenario: Anonymous user emailing job 
	Given I am on Michelpage to validate emailing for French language job as an Anonymous user 
	Then I navigate to job details page for French Job 
	When I click on "Email Job" button on Job details page 
	And I click on "Send Email" button on Email pop up 
	Then I verify "Email Field Error" Message on Email pop up 
	And I Enter "From Email" field on Email pop up 
	Then I Enter "To Email" field on Email pop up 
	And I click on "Send Email" button on Email pop up 
	Then I verify "Email has been sent successfully" Message on Email pop up 
	And I click on "Close" button on Email pop up 
	
Scenario: Authenticated user emailing job 
	Given I am on Michelpage to validate emailing for French language job as an Authenticated user 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login" button on LoginPage 
	Then I navigate to job details page for French Job 
	And I click on "Email Job" button on Job details page 
	And I click on "Send Email" button on Email pop up 
	Then I verify "Email Fields Error" Message on Email pop up 
	Then I Enter "To Email" field on Email pop up 
	And I click on "Send Email" button on Email pop up 
	Then I verify "Email has been sent successfully" Message on Email pop up 
	And I click on "Close" button on Email pop up 
	And I logout the Application 
