@JobSavedAndUnSaved 
Feature: Verify Job is saved and unsaved successfully 
#D8-86 #D8-110

Scenario: Anonymous user saves job and re-visits saved job 
	Given I am on Michelpage to validate saved and unsaved job as an Anonymous user 
	Then I navigate to job details page 
	When I click on "Save Job" button on Job details page 
	Then I verify job is saved and button name is "Saved Job" 
	And I verify the Star icon colour as an Anonymous user 
	Then I navigate to Job details page of the same job saved by Anonymous user 
	And I verify job is saved and button name is "Saved Job" 
	Then I click on "Saved Job" button on Job details page 
	And I verify job is unSaved and button name is "SAVE JOB" 
	And I verify the Star icon colour as an Anonymous user 
	When I click on "Save Job" button on Job details page 
	Then I verify job is saved and button name is "Saved Job" 
	
Scenario: Authenticated  user saves job and re-visits saved job 
	Given I am on Michelpage 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login" button on LoginPage 
	#And I verify "Home Page Title" Message on HomePage
	Then I navigate to Job details page of the same job saved by Anonymous user 
	Then I verify job is "Saved" 
	Then I click on "Saved Job AuthUser" button on Job details page 
	And I verify job is "unSaved" 
	And I verify the Star icon colour as an Authenticated user 
	When I click on "Save Job AuthUser" button on Job details page 
	Then I verify job is "Saved" 
	And I verify the Star icon colour as an Authenticated user 
	And I logout the Application 
	
