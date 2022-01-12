#Story:D8-874,859,857,854
@JobsearchFilters 
Feature: User should be able to search job with different filters on job listing page 

Scenario: 
	Anonymous user navigates to Job Search Page and view the breadcrumb 
	Given I navigate to Job Search Page and apply filters on job listing page for anonymous user 
	Then I navigate to Home Page 
	When I enter "Job Title TextBox" on jobsearch page 
	And I click on "Search Button" button on jobsearch page 
	And I Click on "Sector" button on Job Search page 
	And I select "HealthCare" on Job Search page 
	And I Click on "Industry" button on Job Search page 
	And I select "HealthCare Pharma" on Job Search page 
	And I Click on "Location" button on Job Search page 
	And I select "Location Name" on Job Search page 
	And I Click on "Sales" button on Job Search page 
	Then I verify "Job Url" on Job Search page 
	And I Click on "Company Type" button on Job Search page 
	And I select "Company Type Name" on Job Search page 
	Then I verify "Verify Count" on Job Search page 
	And I Click on "Home" button on Job Search page 
	And I Click on "Job Title" button on Job Search page 
	And I Click on "Language" button on Job Search page 
	And I select "English Job" on Job Search page 
	Then I verify "English Job Count" on Job Search page 
	#	And I select "French Job" on Job Search page 
	#	Then I verify "French Job Count" on Job Search page
	And I Click on "Home" button on Job Search page 
	When I enter "Job Title TextBox" on jobsearch page 
	And I click on "Search Button" button on jobsearch page 
	And I Click on "Industry" button on Job Search page 
	And I select "HealthCare Pharma" on Job Search page 
	Then I verify "HealthCare Count" on Job Search page 
	And I select "Business Services" on Job Search page 
	Then I verify "Total Job Count" on Job Search page 
	
Scenario: 
	Authenticate user navigates to Job Search Page and view the breadcrumb   
	Given I navigate to Job Search Page and apply filters on job listing page for authenticate user 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login" button on LoginPage 
	Then I navigate to Home Page 
	When I enter "Job Title TextBox" on jobsearch page 
	And I click on "Search Button" button on jobsearch page 
	And I Click on "Sector" button on Job Search page 
	And I select "HealthCare" on Job Search page 
	And I Click on "Industry" button on Job Search page 
	And I select "HealthCare Pharma" on Job Search page 
	And I Click on "Location" button on Job Search page 
	And I select "Location Name" on Job Search page 
	And I Click on "Sales" button on Job Search page 
	Then I verify "Job Url" on Job Search page 
	Then I verify "Job Url" on Job Search page 
	And I Click on "Company Type" button on Job Search page 
	And I select "Company Type Name" on Job Search page 
	Then I verify "VERIFY COUNT" on Job Search page 
	And I Click on "Home" button on Job Search page 
	And I Click on "Job Title" button on Job Search page 
	And I Click on "Language" button on Job Search page 
	And I select "English Job" on Job Search page 
	Then I verify "English Job Count" on Job Search page 
	#	And I select "French Job" on Job Search page 
	#	Then I verify "French Job Count" on Job Search page
	And I Click on "Home" button on Job Search page 
	When I enter "Job Title TextBox" on jobsearch page 
	And I click on "Search Button" button on jobsearch page 
	And I Click on "Industry" button on Job Search page 
	And I select "HealthCare Pharma" on Job Search page 
	Then I verify "HealthCare Count" on Job Search page 
	And I select "Business Services" on Job Search page 
	Then I verify "Total Job Count" on Job Search page 
#	And I logout the Application 	