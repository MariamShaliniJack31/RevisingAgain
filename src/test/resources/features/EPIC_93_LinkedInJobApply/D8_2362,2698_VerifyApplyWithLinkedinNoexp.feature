#Story:D8-2362,2698
@FetchDetailsFromLinkedinNoexp
Feature: User has no experience and education to apply job through LinkedIn profile 

Scenario: 
	Anonymous user navigates to Job Details Page and fetch the details through LinkedIn profile 
	Given I navigate to job details page and with no experience and education in LinkedIn profile as an anonymous user 
	Then I navigate to job details page 
	Then I click on "Apply Job" button on Job details page 
	And I Click on "Apply with LinkedIn" button on ApplywithyourCV screen 
	And I Click on "Next" button on ApplywithyourCV screen 
	And I Click on "SignIn with LinkedIn" button on ApplyWithLinkedIn screen 
	And I Enter on "Username1" field on ApplyWithLinkedIn Page 
	Then I Enter "Password1" field on ApplyWithLinkedIn Page 
	And I Click on "SignIn" button on ApplyWithLinkedIn Page 
	And I Click on "Apply With LinkedIn" button on ApplyWithLinkedIn Page 
	And I verify "Instruction Note" Message on ApplyWithLinkedIn Page 
	And I verify "Job RoleExp" Message on ApplyWithLinkedIn Page 
	And I verify "Experience" Field is not present on ApplyWithLinkedIn Page 
	And I verify "Education" Field is not present on ApplyWithLinkedIn Page 
	And I verify "Standard Conditions for Recruitment Services" link on ApplywithyourCV screen 
	And I verify "Terms and Conditions" link on ApplywithyourCV screen 
	And I verify "Job Url" Message on ApplyWithLinkedIn Page 
	
Scenario: 
	Authenticate user navigates to Job Details Page and edit the details for Linked in profile 
	Given I navigate to job details page with no experience and education in LinkedIn profile as for Authenticated user 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login" button on LoginPage 
	Then I navigate to job details page 
	Then I click on "Apply Job" button on Job details page 
	And I Click on "Apply with LinkedIn" button on ApplywithyourCV screen 
	And I Click on "Next" button on ApplywithyourCV screen 
	And I Click on "Apply With LinkedIn" button on ApplyWithLinkedIn Page 
	And I verify "Instruction Note" Message on ApplyWithLinkedIn Page
	And I verify "Job Role1" Message on ApplyWithLinkedIn Page 
	And I verify "Education" Field is not present on ApplyWithLinkedIn Page 
	And I verify "Experience" Field is not present on ApplyWithLinkedIn Page 
	And I verify "Standard Conditions for Recruitment Services" link on ApplywithyourCV screen 
	And I verify "Terms and Conditions" link on ApplywithyourCV screen 
	And I verify "Job Url" Message on ApplyWithLinkedIn Page 
	And I logout the Application 
	
	