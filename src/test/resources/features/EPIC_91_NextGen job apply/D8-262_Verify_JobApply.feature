#Story:D-262
@CreatenewaccountJobAppllywithCV
Feature: User should creat a account from upload cv page while applying job 


Scenario: 
	Anonymous user navigating from Job Details Page to Apply with your CV page then check create new account option with valid data 
	Given I am on Michelpage page then go to thank you message page as an Anonymous user 
	Then I navigate to job details page 
	Then I click on "Apply Job" button on Job details page 
	And I verify "Apply with your CV" Message on ApplywithyourCV screen 
	When I check "Apply with your CV Radio Button" whether selected in ApplywithyourCV screen
	And I Click on "Next" button on ApplywithyourCV screen 
	Then I Enter "Unique EmailID" field on ApplywithyourCV screen 
	And I Enter "First Name" field on ApplywithyourCV screen 
	And I Enter "Last Name" field on ApplywithyourCV screen 
	And I Click on "Upload CV" button on ApplywithyourCV screen 
	And I Click on "Browse" button on ApplywithyourCV screen 
	And I upload the CV with "docx" format on ApplywithyourCV screen 
	And I verify "Uploaded File Name" Message on ApplywithyourCV screen
	And I Click on "Agreeging Terms" button on ApplywithyourCV screen 
	Then I verify "Create New Account Check Box" on ApplywithyourCV screen 
	Then Enter "Individual Password" field on ApplywithyourCV screen 
	And I Click on "Apply Now" button on ApplywithyourCV screen 
	Then I verify "Successfully Message" Message on thankyoumessage screen 
	#Again i need to check whether create new account option is available or not 
	Then I navigate to job details page 
	Then I click on "Apply Job" button on Job details page 
	And I Click on "Next" button on ApplywithyourCV screen 
	Then I verify "Apply with your CV as Header" Message on ApplywithyourCV screen 
	Then I verify "Create New Account Check Box" on ApplywithyourCV screen 
	And I logout the Application 
	
	
Scenario: 
	Authenticate user navigating from Job Details Page to Apply with your CV page then check create new account option 
	Given I navigate upload CV and verifies whether create new account option is enable as Authenticate user 
	#Then I accept alert 
	Then I Enter "Unique EmailID" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login Button" button on LoginPage 
	Then I navigate to job details page 
	Then I click on "Apply Job" button on Job details page 
	And I verify "Apply with your CV" Message on ApplywithyourCV screen
	When I check "Apply with your CV Radio Button" whether selected in ApplywithyourCV screen 
	And I Click on "Next" button on ApplywithyourCV screen 
	Then I verify "Apply with your CV as Header" Message on ApplywithyourCV screen 
	Then I verify "Create New Account Check Box" on ApplywithyourCV screen 