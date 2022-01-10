@VerifyAllErrorsOnSignUPpage 
Feature:  User navigates to my account home page then verify errors by entering invalid details on signUP page 
#D8-683

Scenario: 
	User navigates to my account home page then verify errors by entering invalid details on signUP page 
	Given I am on michael page then navigates to signUP page 
	Then I click on "LoginOrSignUP" link on HomePage screen 
	Then I click on "Create New Account" link on HomePage screen 
	Then I enter "Invalid First Name" on SignUP page 
	Then I enter "Invalid Last Name" on SignUP page 
	Then I enter "Invalid Email Address" on SignUP page 
	Then I enter "Invalid Confirm Email Address" on SignUP page 
	Then I enter "Invalid Password" on SignUP page 
	Then I verify "Errors SignUP Fields" Message on HomePage 
	Then I verify "Error Password Field" Message on HomePage