#D8-877
@VerifyJobTitleThenGoBackJobListingPage 
Feature: User navigating from job search page to job details page then go back to job listing page 
Scenario: 
	Anonymous user Verify job title in Job search Page and navigating to job details page then go back to joblisting 
	Given I am on Michelpage then verify jobtitle and navigating to job details page as an Anonymous user 
	When I enter "Job Title TextBox" on jobsearch page 
	And I click on "Search Button" button on jobsearch page 
	Then I verify "First Job Title" on jobsearch page 
	And I click on "View Job Button" button on jobsearch page 
	#Then I navigate to job details page 
	And I verify "Job Title" is displyed in job details page 
	Then I click "Go Back" link on thankyoumessage screen 
	Then I verify "First Job Title" on jobsearch page 
	
Scenario: 
	Authenticated user Verify job title in Job search Page and navigating to job details page then go back to joblisting 
	Given I am on Michelpage then verify jobtitle and navigating to job details page as an Authenticated user 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login" button on LoginPage 
	And I click on "Job Search Icon" button on jobsearch page 
	When I enter "Job Title TextBox" on jobsearch page 
	And I click on "Search Button" button on jobsearch page 
	Then I verify "First Job Title" on jobsearch page 
	And I click on "View Job Button" button on jobsearch page 
	And I verify "Job Title" is displyed in job details page 
	Then I click "Go Back" link on thankyoumessage screen 
	Then I verify "First Job Title" on jobsearch page 
	And I logout the Application 