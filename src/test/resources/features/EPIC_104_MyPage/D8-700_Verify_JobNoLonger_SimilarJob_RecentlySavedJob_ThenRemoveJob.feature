#D8-700
@VerifyJobNoLongerSimilarJobRecentlySavedJobThenRemoveJob 
Feature: Verify JobnoLonger SimilarJob RecentlySavedJob Then removeJob from My DashBoard Page 

Scenario: 
	Anonymous User navigates from michael page to my Account dashboard page then verify JobMatchNProfile then back to MyDashBoard Page then Login from My DashBoard Page 
	Given I am on Michelpage then navigating to my Account home page then save job 
	Then I click on "LoginOrSignUP" link on HomePage screen 
	Then I verify "Login Title My Account Page" Message on HomePage 
	Then I click on "Save Job" link on HomePage screen 
	Then I verify "Saved Job Ttile" Message on HomePage 
	Then I verify "Press The Star Icon To Save Job" Message on HomePage 
	Then I click on "My Account" link on HomePage screen 
	And I click on "Michael Page Logo" on jobsearch page 
	When I enter "Job Title TextBox" on jobsearch page 
	And I click on "Search Button" button on jobsearch page 
	Then I click on "Save Option To SaveJob" link on HomePage screen 
	Then I click on "Save Job" link on HomePage screen 
	Then I verify "Recently SavedJobs Header" Message on HomePage 
	Then I click on "Job List Option" link on HomePage screen 
	Then I click on "View Similar Job Option" link on HomePage screen 
	Then I verify "Job List Page Title" Message on HomePage 
	Then I click on "Save Job" link on HomePage screen 
	Then I click on "Job List Option" link on HomePage screen 
	Then I click on "Remove Saved Job" link on HomePage screen 
	Then I click on "Confirm Remove Save Job" link on HomePage screen 
	Then I verify "Press The Star Icon To Save Job" Message on HomePage