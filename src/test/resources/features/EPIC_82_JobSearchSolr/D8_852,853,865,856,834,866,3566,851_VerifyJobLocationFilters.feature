#Story:D8-852,853,834,865,856,866,3566,851
@JobLocationFilters 
Feature: User should be able to search job with different Filters on job listing page 

Scenario: 
	Anonymous user navigates to Job Search Page and view jobs as per location
	Given I navigate to Job Search Page and apply filters on Location for anonymous user 
	Then I navigate to Home Page 
	When I enter "Job Title TextBox" on jobsearch page 
	And I click on "Search Button" button on jobsearch page 
	And I Click on "Location" button on Job Search page 
	And I select "Location Name" on Job Search page 
	And I select "Location Southeast" on Job Search page 
	Then I verify "Location Name" on Job Search page 
	And I deselect "Location Southeast London" on Job Search page 
	Then I verify "Location Southeast" on Job Search page 
	And I Click on "Sector" button on Job Search page 
	And I select "HealthCare" on Job Search page 
	Then I verify "Job Match Sector" on Job Search page
	And I select "HealthCare Pharmacy" on Job Search page 
	And I deselect "Pharmacy" on Job Search page 
	Then I verify "Sector Pharmacy" on Job Search page 
	And I Click on "Reset" button on Job Search page 
	Then I verify "Job Match Url" on Job Search page 
	And I select "Salary Minimum" on Job Search page 
	And I select "Salary Maximum" on Job Search page 
	Then I verify "Total Job Count" on Job Search page 
	Then I verify "Location Names" on Job Search page 
	Then I verify "Job Type" on Job Search page 
	Then I verify "Salary" on Job Search page 
	Then I verify "Title of Job" on Job Search page 
	Then I verify "Save Job" on Job Search page 
	Then I verify "View Job" on Job Search page
	And I Click on "Type Of Contract" button on Job Search page 
	Then I verify "First Job Title" on jobsearch page 
	And I Click on "Save Job" button on Job Search page 
#	And I Click on "View Job" button on Job Search page 
#	Then I verify "Job Title" on Job Search page 
#	And I Click on "Back To Home" button on Job Search page 
	And I Click on "Home" button on Job Search page 
	Then I verify "Job Title" on Job Search page 
	Then I verify "Location Names" on Job Search page 
	Then I verify "Job Type" on Job Search page 
	Then I verify "Save Job" on Job Search page 
	Then I verify "View Job" on Job Search page
	And I Click on "View Job Featured" button on Job Search page
	Then I verify "Job Title" on Job Search page 
	
	
Scenario: 
	Authenticate user navigates to Job Search Page and view the breadcrumb   
	Given I navigate to Job Search Page and apply filters on job listing page for authenticate user 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login" button on LoginPage 
	Then I navigate to Home Page 
	When I enter "Job Title TextBox" on jobsearch page 
	And I click on "Search Button" button on jobsearch page 
	And I Click on "Location" button on Job Search page 
	And I select "Location Name" on Job Search page 
	And I select "Location Southeast" on Job Search page 
	Then I verify "Location Name" on Job Search page 
	And I deselect "Location Southeast London" on Job Search page 
	Then I verify "Location Southeast" on Job Search page 
	And I Click on "Sector" button on Job Search page 
	And I select "HealthCare" on Job Search page 
	Then I verify "Job Match Sector" on Job Search page
	And I select "HealthCare Pharmacy" on Job Search page 
	And I deselect "Pharmacy" on Job Search page 
	Then I verify "Sector Pharmacy" on Job Search page 
	And I Click on "Reset" button on Job Search page 
	Then I verify "Job Match Url" on Job Search page 
	And I select "Salary Minimum" on Job Search page 
	And I select "Salary Maximum" on Job Search page 
	Then I verify "Total Job Count" on Job Search page 
	Then I verify "Location Names" on Job Search page 
	Then I verify "Job Type" on Job Search page 
	Then I verify "Salary" on Job Search page 
	Then I verify "Title of Job" on Job Search page 
	Then I verify "View Job" on Job Search page
	And I Click on "Type Of Contract" button on Job Search page 
	Then I verify "First Job Title" on jobsearch page 
#	And I Click on "View Job" button on Job Search page 
#	Then I verify "Job Title" on Job Search page 
#	And I Click on "Back To Home" button on Job Search page 
	And I Click on "Home" button on Job Search page
	Then I verify "Job Title" on Job Search page 
	Then I verify "Location Names" on Job Search page 
	Then I verify "Job Type" on Job Search page 
	Then I verify "View Job" on Job Search page
	And I Click on "View Job Featured" button on Job Search page
	Then I verify "Job Title" on Job Search page 
#	And I logout the Application 	