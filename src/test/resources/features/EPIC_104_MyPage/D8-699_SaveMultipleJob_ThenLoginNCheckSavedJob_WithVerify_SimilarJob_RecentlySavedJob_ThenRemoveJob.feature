#D8-699
@SaveMultipleJobBeforeLoginThenVerifyAlltheSavedJobAfterlogin 
Feature: Save Multiple Job BeforeLogin Then Verify all the SavedJob Afterlogin and also similar job then remove save job 

Scenario: 
	Anonymous User navigates from michael page to my Account dashboard page then verify all the SavedJob Afterlogin and also similar job then remove save job 
	Given I am on Michelpage then navigating to my Account home page then verify all the saved job 
	Then I navigate to Home Page 
	When I enter "Job Title TextBox" on jobsearch page 
	And I click on "Search Button" button on jobsearch page 
	Then I click on "Save Multiple Job" link on HomePage screen 
	Then I click on "Save Job" link on HomePage screen 
	Then I click on "To View Saved Job ByClicking Title" link on HomePage screen 
	Then I verify "Job Title After Clicking On Saved Job Title" Message on HomePage 
	Then I click on "Job List Option" link on HomePage screen 
	Then I click on "Remove Saved Job" link on HomePage screen 
	Then I click on "Confirm Remove Save Job Anonymous" link on HomePage screen 
	Then I verify "Recently SavedJobs Header" Message on HomePage 
	Then I click on "Job List Option" link on HomePage screen 
	Then I click on "Remove Saved Job" link on HomePage screen 
	Then I click on "Cancel from Remove Save Job Window Anon" link on HomePage screen 
	Then I verify "Recently SavedJobs Header" Message on HomePage 
	Then I click on "Job List Option" link on HomePage screen 
	Then I click on "View Similar Job Option" link on HomePage screen 
	Then I verify "Job List Page Title" Message on HomePage 
	
Scenario: 
	Authenticated User save multiple Job beforeLogin Then verify all the savedJob afterlogin and also similar job then remove save job 
	Given I am on Michelpage then navigating to my Account home page then login as Authenticated User 
	Then I navigate to Home Page 
	Then I click on "LoginOrSignUP" link on HomePage screen 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login Button" button on LoginPage 
	Then I verify "My Account Page Header" Message on HomePage 
	And I click on "Michael Page Logo" on jobsearch page 
	When I enter "Job Title TextBox" on jobsearch page 
	And I click on "Search Button" button on jobsearch page 
	Then I click on "Save Option To SaveJob" link on HomePage screen 
	Then I click on "Save Job" link on HomePage screen 
	Then I click on "To View Saved Job ByClicking Title" link on HomePage screen 
	Then I verify "Job Title After Clicking On Saved Job Title" Message on HomePage 
	Then I click on "Job List Option" link on HomePage screen 
	Then I click on "Remove Saved Job" link on HomePage screen 
	Then I click on "Confirm Remove Save Job Authenticated" link on HomePage screen 
	Then I verify "Recently SavedJobs Header" Message on HomePage 
	Then I click on "Job List Option" link on HomePage screen 
	Then I click on "Remove Saved Job" link on HomePage screen 
	Then I click on "Cancel from Remove Save Job Window Auth" link on HomePage screen 
	Then I verify "Recently SavedJobs Header" Message on HomePage 
	Then I click on "Job List Option" link on HomePage screen 
	Then I click on "View Similar Job Option" link on HomePage screen 
	Then I verify "Job List Page Title" Message on HomePage 