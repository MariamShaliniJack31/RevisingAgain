#D8-496
@VerifyErrorFieldWithInvalidCredentails 
Feature: Verify the errors by entering invalid credentials 

Scenario: 
	Anonymous User navigates from michael page to my Account page then verify the errors by entering invalid credentials
	Given I am on Michelpage then navigating to my Account page 
	Then I click on "LoginOrSignUP" link on HomePage screen 
	Then I verify "Login Title" on myAccount page 
	Then I verify "Email Address Label" Message on HomePage 
	Then I verify "Password Address Label" Message on HomePage 
	And I click on "Login Button" button on LoginPage 
	Then I enter "Email Address Error Field" on lgoin page 
	Then I enter "Password Error Field" on lgoin page 
	Then I verify "SignUP Title My Account Page" Message on HomePage 	
Scenario: 
		Authenticated user navigates from michael page to my Account page then verify the errors by entering valid credentials
		Given I am on Michelpage then navigating to my Account page then login 
		Then I click on "LoginOrSignUP" link on HomePage screen 
		Then I verify "Login Title My Account Page" Message on HomePage 
		When I Enter "Username" field on LoginPage 
		Then I Enter "Password" field on LoginPage 
		And I click on "Login Button" button on LoginPage 
		Then I verify "My Account Page Header" Message on HomePage 