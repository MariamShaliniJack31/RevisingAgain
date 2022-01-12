@VerifyPasswordTextValue 
Feature: User navigates to my account home page then unhide password text by clicking on EyeEncyrpt option 
#D8-685

Scenario: 
	User navigates to my account home page then unhide password text by clicking on EyeEncyrpt option  
	Given I am on Michelpage then unhide password text by clicking on EyeEncyrpt option 
	Then I click on "LoginOrSignUP" link on HomePage screen 
	Then I Enter "Password" field on LoginPage 
	And I click on "Eye Encrypt Option" button on HomePage screen 
	And I verify "Password Text Value" on HomePage screen 