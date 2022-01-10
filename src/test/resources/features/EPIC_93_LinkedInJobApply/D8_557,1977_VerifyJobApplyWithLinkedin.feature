#Story:D8-557,1977
@FetchDetailsFromLinkedin
Feature: User should able to see the details which are fetched from LinkedIn profile 

Scenario: 
	Anonymous user navigates to Job Details Page and able to see the details which are fetched from LinkedIn profile 
	Given I navigate to job details page and able to see the details which are fetched from LinkedIn profile 
	Then I navigate to job details page 
	Then I click on "Apply Job" button on Job details page 
	And I Click on "Apply with LinkedIn" button on ApplywithyourCV screen 
	And I Click on "Next" button on ApplywithyourCV screen 
	And I Click on "SignIn with LinkedIn" button on ApplyWithLinkedIn screen 
	And I Enter on "Username" field on ApplyWithLinkedIn Page 
	Then I Enter "Password" field on ApplyWithLinkedIn Page 
	And I Click on "SignIn" button on ApplyWithLinkedIn Page 
	And I Click on "Apply With LinkedIn" button on ApplyWithLinkedIn Page 
	And I verify "Instruction" Message on ApplyWithLinkedIn Page 
	And I Click on "Apply Now" button on ApplyWithLinkedIn Page 
	And I verify "Role Error" Message on ApplyWithLinkedIn Page 
	And I verify "Account Name" Message on ApplyWithLinkedIn Page 
	And I verify "Account Name Editable" on ApplyWithLinkedIn Page 
	And I verify "Job Role" Message on ApplyWithLinkedIn Page 
	And I verify "Job Role Editable" on ApplyWithLinkedIn Page 
	And I verify "Email Address" Message on ApplyWithLinkedIn Page 
	And I verify "Email Address Editable" on ApplyWithLinkedIn Page 
#	And I verify "Phone Number" Message on ApplyWithLinkedIn Page 
#	And I verify "Phone Number Editable" on ApplyWithLinkedIn Page 
	And I Click on "Education" button on ApplyWithLinkedIn Page 
	And I verify "Education" Message on ApplyWithLinkedIn Page 
	And I Click on "Experience" button on ApplyWithLinkedIn Page 
	And I verify "Job Experience" Message on ApplyWithLinkedIn Page 
	And I verify "Name Error" Message on ApplyWithLinkedIn Page 
	And I verify "Email Error" Message on ApplyWithLinkedIn Page

	
Scenario: 
	Authenticate user navigates to Job Details Page and edit the details for Linked in profile 
	Given I navigate to job details page to fetch the details of Linkedin profile for Authenticated user 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login" button on LoginPage 
	Then I navigate to job details page 
	Then I click on "Apply Job" button on Job details page 
	And I Click on "Apply with LinkedIn" button on ApplywithyourCV screen 
	And I Click on "Next" button on ApplywithyourCV screen 
	And I Click on "Apply With LinkedIn" button on ApplyWithLinkedIn Page 
	And I verify "Instruction" Message on ApplyWithLinkedIn Page 
	And I Click on "Apply Now" button on ApplyWithLinkedIn Page 
	And I verify "Role Error" Message on ApplyWithLinkedIn Page 
	And I verify "Account Name" Message on ApplyWithLinkedIn Page 
	And I verify "Account Name Editable" on ApplyWithLinkedIn Page 
	And I verify "Job Role" Message on ApplyWithLinkedIn Page 
	And I verify "Job Role Editable" on ApplyWithLinkedIn Page 
	And I verify "Email Address" Message on ApplyWithLinkedIn Page 
	And I verify "Email Address Editable" on ApplyWithLinkedIn Page 
#	And I verify "Phone Number" Message on ApplyWithLinkedIn Page 
#	And I verify "Phone Number Editable" on ApplyWithLinkedIn Page 
	And I Click on "Education" button on ApplyWithLinkedIn Page 
	And I verify "Education" Message on ApplyWithLinkedIn Page 
	And I Click on "Experience" button on ApplyWithLinkedIn Page 
	And I verify "Job Experience" Message on ApplyWithLinkedIn Page 
	And I verify "Name Error" Message on ApplyWithLinkedIn Page 
	And I verify "Email Error" Message on ApplyWithLinkedIn Page 
#	And I verify "Phone Error" Message on ApplyWithLinkedIn Page 
	And I logout the Application 
	
	