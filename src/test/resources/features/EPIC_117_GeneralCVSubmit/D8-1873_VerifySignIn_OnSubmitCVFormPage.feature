#Story: D8-1873
@VerifyandSignInOnSubmitCVFormPage 
Feature: Proceeding from the job detail page to genral cv submit form page then signIn 

Scenario: 
	Anonymous user navigates to genral cv submit form page then signIn for Anonymous user
	Given I navigates genral cv submit form page then signIn for Anonymous user 
	Then I navigate to PRS general CV Form page 
	Then I verify "Submit Your CV as Header" on PRS generalCVForm screen 
	Then I verify "Progress Bar Line" on PRS generalCVForm screen 
	And I verify "Steps" Message on ApplywithyourCV screen 
	Then I click "SignIn link" on PRS generalCVForm screen 
	Then I verify "Login As Header" on login window screen 
	Then I click "Forgotten Link" on login window of PRS generalCVForm screen 
	Then I verify "Forgotten Password Header" on login window screen 
	And I Enter "Email Address" on forgotten password window of PRS generalCVForm screen 
	Then I click "Submit Button" on forgotten password window of PRS generalCVForm screen 
	Then I verify "Further Instruction Header" on login window screen 
	Then I click "Continue WithOut SignIngIn" on forgotten password window of PRS generalCVForm screen 
	Then I verify "Submit Your CV as Header" on PRS generalCVForm screen 
	Then I click "SignIn link" on PRS generalCVForm screen 
	Then I verify "Login As Header" on login window screen 
	And I Enter "EmailID" on Login window of PRS generalCVForm screen 
	And I Enter "Password" on Login window of PRS generalCVForm screen 
	Then I click "Login Button" on login window of PRS generalCVForm screen 
	And I verify "Email Address" Message on ApplywithyourCV screen 
	And I verify "First Name" Message on ApplywithyourCV screen 
	And I verify "Last Name" Message on ApplywithyourCV screen 