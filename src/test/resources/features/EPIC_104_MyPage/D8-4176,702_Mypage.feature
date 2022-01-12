#D8-4176,D8-702
@MyPage
Feature: 

Scenario: 
	Authenticated User navigates from michael page to navigate to MyPage
	Given I am on Michelpage then navigating to my Account page to verify menus
	Then I click on "LoginOrSignUP" link on HomePage screen 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login Button" button on LoginPage
	Then I click on "Saved Jobs" button on MyPage
	Then I verify the Title "Saved Jobs" on MyPage
	Then I click on "My Account" button on MyPage
	Then I click on "Search and Alerts" button on MyPage
	Then I verify the Title "Search and Alerts" on MyPage
	Then I click on "My Account" button on MyPage
#	Then I click on "Personal Details" button on MyPage
#	Then I verify the Title "Personal Details" on MyPage
#	Then I click on "My Account" button on MyPage
	Then I click on "YOUR CV" button on MyPage
	Then I verify the Title "YOUR CV" on MyPage
	Then I click on "My Account" button on MyPage
	Then I click on "LOGIN AND SECURITY" button on MyPage
	Then I verify the Title "ACCOUNT SETTINGS" on MyPage
	Then I click on "My Account" button on MyPage
	Then I click on "Applied Jobs" button on MyPage
	Then I verify the Title "Applied Jobs" on MyPage
	And I verify the count of the Applied Jobs
	Then I click on "View Job" button on MyPage
	And I verify "Job Title" in job-detail pages
	And I navigate to MyPage dashboard
	Then I click on "Applied Jobs" button on MyPage
	Then I click on "View Similar Jobs" button on MyPage
	And I logout the Application