#D8-701
@VerifyJobMatchNProfileThenBackToMyDashboardPage 
Feature: Verify JobMatchNProfile then back to MyDashBoard Page then Login from My DashBoard Page 

Scenario: 
	Anonymous User navigates from michael page to my Account dashboard page then verify JobMatchNProfile then back to MyDashBoard Page then Login from My DashBoard Page 
	Given I am on Michelpage then navigating to my Account dashboard page then Login from My DashBoard Page 
	Then I click on "LoginOrSignUP" link on HomePage screen 
	Then I verify "Login Title My Account Page" Message on HomePage 
	Then I click on "Save Job" link on HomePage screen
	Then I click on "My Account" link on HomePage screen
	Then I verify "My Account Page Header" Message on HomePage 
	Then I verify "Section Titles Of MyAccount Dashboard" Message on HomePage 
	Then I verify "Sub Section Titles Of MyAccount Dashboard" Message on HomePage
	Then I click on "Login" link on HomePage screen
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login Button" button on LoginPage 
	Then I verify "My Account Page Header" Message on HomePage
	Then I click on "Sub Section Titles Job MatchAndMatched Profile" link on HomePage screen