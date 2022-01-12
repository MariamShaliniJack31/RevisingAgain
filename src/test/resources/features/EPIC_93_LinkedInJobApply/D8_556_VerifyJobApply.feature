#Story:D8-556
@ApplyjobwithLinkedin
Feature: User should able to edit the details which are fetched from LinkedIn profile 

Scenario: 
	Anonymous user navigates to Job Details Page and edit the details for Linked in profile
	Given I navigate to job details page to edit the details of Linkedin profile for anonymous user 
	Then I navigate to job details page 
	Then I click on "Apply Job" button on Job details page 
	And I verify "Apply with your CV" Message on ApplywithyourCV screen 
	And I verify "Apply with LinkedIn" Message on ApplywithyourCV screen 
	And I Click on "Apply with LinkedIn" button on ApplywithyourCV screen 
	And I Click on "Next" button on ApplywithyourCV screen 
	And I Click on "SignIn with LinkedIn" button on ApplyWithLinkedIn screen 
	And I Enter on "Username" field on ApplyWithLinkedIn Page 
	Then I Enter "Password" field on ApplyWithLinkedIn Page 
	And I Click on "SignIn" button on ApplyWithLinkedIn Page 
	And I Click on "Apply With LinkedIn" button on ApplyWithLinkedIn Page 
	And I verify "Account Name" Message on ApplyWithLinkedIn Page 
	And I verify "Account Name Editable" on ApplyWithLinkedIn Page 
	And I verify "Job Role" Message on ApplyWithLinkedIn Page 
	And I verify "Job Role Editable" on ApplyWithLinkedIn Page 
	And I verify "Email Address" Message on ApplyWithLinkedIn Page 
	And I verify "Email Address Editable" on ApplyWithLinkedIn Page 
	And I Click on "Education" button on ApplyWithLinkedIn Page 
	And I verify "Education" Message on ApplyWithLinkedIn Page 
	And I Click on "Experience" button on ApplyWithLinkedIn Page 
	And I verify "Job Experience" Message on ApplyWithLinkedIn Page 
	And I verify "Account Unlock Featutre" Message on ApplyWithLinkedIn Page 
	And I Click on "Account Unlock" button on ApplyWithLinkedIn Page 

	
	
Scenario: 
	Authenticate user navigates to Job Details Page and edit the details for Linked in profile 
	Given I navigate to job details page to edit the details of Linkedin profile for Authenticated user 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login" button on LoginPage 
	Then I navigate to job details page 
	Then I click on "Apply Job" button on Job details page 
	And I verify "Apply with your CV" Message on ApplywithyourCV screen 
	And I verify "Apply with LinkedIn" Message on ApplywithyourCV screen 
	And I Click on "Apply with LinkedIn" button on ApplywithyourCV screen 
	And I Click on "Next" button on ApplywithyourCV screen 
	And I Click on "Apply With LinkedIn" button on ApplyWithLinkedIn Page 
	And I verify "Account Name" Message on ApplyWithLinkedIn Page 
	And I verify "Account Name Editable" on ApplyWithLinkedIn Page 
	And I verify "Job Role" Message on ApplyWithLinkedIn Page 
	And I verify "Job Role Editable" on ApplyWithLinkedIn Page 
	And I verify "Email Address" Message on ApplyWithLinkedIn Page 
	And I verify "Email Address Editable" on ApplyWithLinkedIn Page 
	And I Click on "Education" button on ApplyWithLinkedIn Page 
	And I verify "Education" Message on ApplyWithLinkedIn Page 
	And I Click on "Experience" button on ApplyWithLinkedIn Page 
	And I verify "Job Experience" Message on ApplyWithLinkedIn Page 
	And I verify "Account Unlock Featutre" Message on ApplyWithLinkedIn Page 
	And I Click on "Account Unlock" button on ApplyWithLinkedIn Page 
	And I logout the Application 
	
Scenario: 
	Anonymous user navigates to Job Details Page and edit the details for Linked in profile
	Given I navigate to job details page to edit the details of Linkedin profile as anonymous user for French Job 
	Then I navigate to job details page for French Job 
	Then I click on "Apply Job" button on Job details page 
	And I verify "Apply with your CV" Message on ApplywithyourCV screen 
	And I verify "Apply with LinkedIn" Message on ApplywithyourCV screen 
	And I Click on "Apply with LinkedIn" button on ApplywithyourCV screen 
	And I Click on "Next" button on ApplywithyourCV screen 
	And I Click on "Apply With LinkedIn" button on ApplyWithLinkedIn Page 
	And I verify "Account Name" Message on ApplyWithLinkedIn Page 
	And I verify "Account Name Editable" on ApplyWithLinkedIn Page 
	And I verify "Job Role" Message on ApplyWithLinkedIn Page 
	And I verify "Job Role Editable" on ApplyWithLinkedIn Page 
	And I verify "Email Address" Message on ApplyWithLinkedIn Page 
	And I verify "Email Address Editable" on ApplyWithLinkedIn Page 
	And I Click on "Education" button on ApplyWithLinkedIn Page 
	And I verify "Education" Message on ApplyWithLinkedIn Page 
	And I Click on "Experience" button on ApplyWithLinkedIn Page 
	And I verify "Job Experience" Message on ApplyWithLinkedIn Page 
	And I verify "Account Unlock Featutre" Message on ApplyWithLinkedIn Page 
	And I Click on "Account Unlock" button on ApplyWithLinkedIn Page 
	
	
Scenario: 
	Anonymous user navigates to Job Details Page and edit the details for Linked in profile
	Given I navigate to job details page to edit the details of Linkedin profile as authenticate user for French Job 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login" button on LoginPage 
	Then I navigate to job details page 
	Then I click on "Apply Job" button on Job details page 
	And I verify "Apply with your CV" Message on ApplywithyourCV screen 
	And I verify "Apply with LinkedIn" Message on ApplywithyourCV screen 
	And I Click on "Apply with LinkedIn" button on ApplywithyourCV screen 
	And I Click on "Next" button on ApplywithyourCV screen 
	And I Click on "Apply With LinkedIn" button on ApplyWithLinkedIn Page 
	And I verify "Account Name" Message on ApplyWithLinkedIn Page 
	And I verify "Account Name Editable" on ApplyWithLinkedIn Page 
	And I verify "Job Role" Message on ApplyWithLinkedIn Page 
	And I verify "Job Role Editable" on ApplyWithLinkedIn Page 
	And I verify "Email Address" Message on ApplyWithLinkedIn Page 
	And I verify "Email Address Editable" on ApplyWithLinkedIn Page 
	And I Click on "Education" button on ApplyWithLinkedIn Page 
	And I verify "Education" Message on ApplyWithLinkedIn Page 
	And I Click on "Experience" button on ApplyWithLinkedIn Page 
	And I verify "Job Experience" Message on ApplyWithLinkedIn Page 
	And I verify "Account Unlock Featutre" Message on ApplyWithLinkedIn Page 
	And I Click on "Account Unlock" button on ApplyWithLinkedIn Page 
	And I logout the Application  