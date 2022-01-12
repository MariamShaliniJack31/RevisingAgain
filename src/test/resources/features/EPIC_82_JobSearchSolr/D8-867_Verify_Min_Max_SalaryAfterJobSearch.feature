#D8-867
@VerifyMinMaxValueAftersearchingJob 
Feature:  User navigating from job search page to job results page then verify detail after sorting 
Scenario: 
	Anonymous user navigates from job search page to job results page then verify detail after sorting by clciking Low to high and High to low   
	Given I am on Michelpage then enter jobtitle then navigating to job results page as an Anonymous user 
	Then I navigate to Home Page 
	Then I enter "Job Title TextBox" on jobsearch page 
	#Then I select "Salary Minimum" on jobsearch page 
	#Then I select "Salary Maximum" on jobsearch page 
	And I click on "Search Button" on jobsearch page 
	Then I verify "First Job Title" on jobsearch page 
	Then I verify "Job Count After Searching" on jobsearch page 
	Then I select "Most Recent" on jobsearch page 
	Then I verify "First Job Title" on jobsearch page 
	Then I select "Salary HighToLow" on jobsearch page 
	Then I verify "First Job Title" on jobsearch page 
	Then I select "Salary LowToHigh" on jobsearch page 
	Then I verify "First Job Title" on jobsearch page 
	
Scenario: 
	Authenticated user navigates from job search page to job results page then verify detail after sorting by clciking Low to high and High to low
	Given I am on Michelpage then enter jobtitle then navigating to job results page as an Authenticated user 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login" button on LoginPage 
	And I click on "Michael Page Logo" on jobsearch page 
	When I enter "Job Title TextBox" on jobsearch page 
	#Then I select "Salary Minimum" on jobsearch page 
	#Then I select "Salary Maximum" on jobsearch page 
	And I click on "Search Button" on jobsearch page 
	Then I verify "First Job Title" on jobsearch page 
	Then I verify "Job Count After Searching" on jobsearch page 
	Then I select "Most Recent" on jobsearch page 
	Then I verify "First Job Title" on jobsearch page 
	Then I select "Salary HighToLow" on jobsearch page 
	Then I verify "First Job Title" on jobsearch page 
	Then I select "Salary LowToHigh" on jobsearch page 
	Then I verify "First Job Title" on jobsearch page 
	#And I logout the Application 