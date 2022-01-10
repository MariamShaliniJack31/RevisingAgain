#Story:D8-549,:D8-552
@ApplywithLinkedin
Feature: User can apply job in LinkedIn for English and French Language 

Scenario: 
	Anonymous user navigates to Job Details Page and verify Linkedin Option 	
	Given I navigate to job details page to verify Linkedin Option an Anonymous user 
	Then I navigate to job details page 
	Then I click on "Apply Job" button on Job details page 
	And I Click on "Apply with LinkedIn" button on ApplywithyourCV screen 
	And I Click on "Next" button on ApplywithyourCV screen 
	Then I verify "Apply with Linkedin text" Message on SigninWithLinkedin screen 
	Then I verify "Apply Job in LinkedIn Profile" Message on SigninWithLinkedin screen 
	Then I verify "Apply With CV Instead" Message on SigninWithLinkedin screen 
	And I Click on "Apply CV Instead" Link on SigninWithLinkedin screen 
	Then I verify "Apply With CV Instead LiNK" Message on SigninWithLinkedin screen 
	Then I verify "Apply With CV Form" Message on SigninWithLinkedin screen 
	
Scenario: Authenticate user navigates to Job Details Page and Linkedin Option 
	Given I verify Linkedin Option and apply Job as an Authenticated user 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login" button on LoginPage 
	Then I navigate to job details page 
	Then I click on "Apply Job" button on Job details page 
	And I Click on "Apply with LinkedIn" button on ApplywithyourCV screen 
	And I Click on "Next" button on ApplywithyourCV screen 
	Then I verify "Apply with Linkedin text" Message on SigninWithLinkedin screen 
	Then I verify "Apply Job in LinkedIn Profile" Message on SigninWithLinkedin screen 
	Then I verify "Apply With CV Instead" Message on SigninWithLinkedin screen 
	And I Click on "Apply CV Instead" Link on SigninWithLinkedin screen 
	Then I verify "Apply With CV Instead LiNK" Message on SigninWithLinkedin screen 
	Then I verify "Apply With CV Form" Message on SigninWithLinkedin screen 
	And I logout the Application 

Scenario: 
	Anonymous user navigates to Job Details Page and verify Linkedin Option  for French Job	
	Given I navigate to job details page to verify Linkedin Option an Anonymous user for French Job 
	Then I navigate to job details page for French Job 
	Then I click on "Apply Job" button on Job details page 
	And I Click on "Apply with LinkedIn" button on ApplywithyourCV screen 
	And I Click on "Next" button on ApplywithyourCV screen 
	Then I verify "Apply with Linkedin text" Message on SigninWithLinkedin screen 
	Then I verify "Apply Job in LinkedIn Profile" Message on SigninWithLinkedin screen 
	Then I verify "Apply With CV Instead" Message on SigninWithLinkedin screen 
	And I Click on "Apply CV Instead" Link on SigninWithLinkedin screen 
	Then I verify "Apply With CV Instead LiNK" Message on SigninWithLinkedin screen 
	Then I verify "Apply With CV Form" Message on SigninWithLinkedin screen 
	
Scenario: Authenticate user navigates to Job Details Page and Linkedin Option 
	Given I navigate to job details page to verify Linkedin Option an Authenticated user for French Job 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login" button on LoginPage 
	Then I navigate to job details page for French Job 
	Then I click on "Apply Job" button on Job details page 
	And I Click on "Apply with LinkedIn" button on ApplywithyourCV screen 
	And I Click on "Next" button on ApplywithyourCV screen 
	Then I verify "Apply with Linkedin text" Message on SigninWithLinkedin screen 
	Then I verify "Apply Job in LinkedIn Profile" Message on SigninWithLinkedin screen 
	Then I verify "Apply With CV Instead" Message on SigninWithLinkedin screen 
	And I Click on "Apply CV Instead" Link on SigninWithLinkedin screen 
	Then I verify "Apply With CV Instead LiNK" Message on SigninWithLinkedin screen 
	Then I verify "Apply With CV Form" Message on SigninWithLinkedin screen 
	And I logout the Application 
	
	
