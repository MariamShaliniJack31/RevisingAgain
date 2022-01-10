#D8-706
@VerifyErrorPhoneFieldThenBackToMyDashboardPage 
Feature: Verify error Message After eddit phone number then back to My Account DashBoard Page 

Scenario: 
	Authenticated User navigates from michael page to my Account dashboard page then verify Error Message After eddit phone number then back to My Account DashBoard Page
	Given I am on Michelpage then navigating to my Account page then verify Error Message After eddit phone number 
	Then I click on "LoginOrSignUP" link on HomePage screen 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login Button" button on LoginPage 
	Then I verify "My Account Page Header" Message on HomePage 
	Then I click on "Personal Details" link on HomePage screen 
	Then I click on "Edit Button" link on HomePage screen 
	Then I entered "Phone Number" on Personal Details page of my account page 
	Then I click on "Save Button Personal Details" link on HomePage screen 
	Then I click on "Edit Button" link on HomePage screen 
	Then I entered "Clear All Personal Details" on Personal Details page of my account page 
	Then I click on "Save Button Personal Details" link on HomePage screen 
	Then I entered "ERROR All PERSONAL DETAILS" on Personal Details page of my account page