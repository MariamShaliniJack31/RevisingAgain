@VerifyEmailIDAlreadyExists 
Feature: verifying signup functionality with new and existing email address 
#D8-684

Scenario: 
	User navigates to my account home page then enter details for signUP and check error on email already exists 
	Given I am on Michelpage to verifying signup functionality with new and existing email address 
	Then I click on "LoginOrSignUP" link on HomePage screen 
	Then I click on "Create New Account" link on HomePage screen 
	Then I enter "First Name" on SignUP page 
	Then I enter "Last Name" on SignUP page 
	Then I enter "Email Address" on SignUP page 
	Then I enter "Confirm Email Address" on SignUP page 
	Then I enter "Password TextBox" on SignUP page 
	And I click on "SignUp" button on SignUp page 
	Then I verify "Email Already Exists" on SignUP page 
	Then I enter "New Email Address" on SignUP page 
	Then I enter "New Confirm Email Address" on SignUP page
	 Then I enter "Password TextBox" on SignUP page
	And I click on "SignUp" button on SignUp page 
	Then I verify "Account Created Successfully" on SignUP page 
	Then I verify "My Account Page Header" on SignUP page 