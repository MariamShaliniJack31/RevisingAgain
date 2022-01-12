@CountOfSavedJob 
Feature: Verify Count Of Saved JObs
#D8-631
Scenario: Anonymous user Verify Count Of Saved JOb 
	Given I am on Michelpage to validate Count Of Saved job as an Anonymous user 
	Then I navigate to job details page 
	And I verify the count of saved jobs "Star Icon is not present" in Header 
	When I click on "Save Job" button on Job details page 
	And I verify the count of saved jobs "Star Icon is present" in Header 
	Then I click on "Saved Job" button on Job details page 
	And I verify the count of saved jobs "Star Icon is not present" in Header 
	
Scenario: Authenticated user Verify Count Of Saved JOb 
	Given I am on Michelpage to validate Count Of Saved job as an Authenticated user 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login" button on LoginPage 
	Then I navigate to job details page 
	And I verify the count of saved jobs "Star Icon is present" in Header 
	Then I click on "Saved Job AuthUser" button on Job details page 
	And I verify the count of saved jobs "Star Icon is not present" in Header 
	When I click on "Save Job AuthUser" button on Job details page 
	And I verify the count of saved jobs "Star Icon is present" in Header 
	And I logout the Application 
	
	
	
		