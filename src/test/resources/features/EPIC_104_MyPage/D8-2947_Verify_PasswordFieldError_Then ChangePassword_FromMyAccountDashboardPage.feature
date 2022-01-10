#D8-2947
@VerifyErrorPasswordMustNotMatchExistingThree 
Feature: Verify password error message then change password from my account dashboard page 

Scenario: 
	Authenticated User navigates from michael page to my Account dashboard page then changing password 
	Given I am on Michelpage then navigating to my Account dashboard page with valid creadentials then 
	Then I click on "LoginOrSignUP" link on HomePage screen 
	Then I verify "Login Title My Account Page" Message on HomePage 
	Then I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login Button" button on LoginPage 
	Then I verify "My Account Page Header" Message on HomePage 
	Then I click on "Login And Security" link on HomePage screen 
	#Then I verify "Login Title My Account Page" Message on HomePage 
	Then I verify "Account Setting" Message on HomePage 
	Then i entered "Current Password" on Account setting page 
	Then i entered "New Password" on Account setting page 
	Then I click on "Save Button" link on HomePage screen
	Then I verify "Password Must Not Match" Message on HomePage 