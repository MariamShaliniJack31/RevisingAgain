#Story:D8-2411
@ApplyCCjobwithLinkedin
Feature: User will apply CC enabled job via LinkedIn profile 
Scenario: 
	Anonymous user navigates to Job Details Page and Process the CC enabled job application with LinkedIn profile
	Given I navigate to job details page and verify CC Enabled form as Anonymous user 
	Then I navigate to CC Enabled job details page 
	Then I click on "Apply Job" button on Job details page 
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
	And I Click on "Next" button on ApplyWithLinkedIn Page 
	Then I verify "About you" is displayed on CC_Form 
	And I Click on "Visa Option" button on CC_Form 
	And I select "Home Country" field on CC_Form 
	And I Enter "City" field on CC_Form 
	And I select "Nationality" field on CC_Form 
	And I Enter "Available Date" field on CC_Form 
	And I Click on "CCJobNext" button on ApplywithyourCV screen 
	And I select "Industry" field on CC_Form 
	And I select "Sector" field on CC_Form 
	And I select "SubIndustry" field on CC_Form 
	And I select "Salary Frequency" field on CC_Form 
	And I select "SubSector" field on CC_Form 
	And I Enter "Amount" field on CC_Form 
	And I select "Currency" field on CC_Form 
	And I Click on "Apply Now" button on CC_Form 
	Then I verify "Successfully Message" Message on thankyoumessage screen 
	Then I verify "Application Received" Message on thankyoumessage screen 
	
Scenario: 
	Authenticate user navigates to Job Details Page and Process the CC enabled job application with LinkedIn profile
	Given I navigate to job details page and Process the CC enabled job application form as Authenticated user 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login" button on LoginPage 
	Then I navigate to CC Enabled job details page 
	Then I click on "Apply Job" button on Job details page 
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
	And I Click on "Next" button on ApplyWithLinkedIn Page 
	Then I verify "About you" is displayed on CC_Form 
	And I Click on "Visa Option" button on CC_Form 
	And I select "Home Country" field on CC_Form 
	And I Enter "City" field on CC_Form 
	And I select "Nationality" field on CC_Form 
	And I Enter "Available Date" field on CC_Form 
	And I Click on "CCJobNext" button on ApplywithyourCV screen 
	And I select "Industry" field on CC_Form 
	And I select "Sector" field on CC_Form 
	And I select "SubIndustry" field on CC_Form 
	And I select "Salary Frequency" field on CC_Form 
	And I select "SubSector" field on CC_Form 
	And I Enter "Amount" field on CC_Form 
	And I select "Currency" field on CC_Form 
	And I Click on "Apply Now" button on CC_Form 
	Then I verify "Successfully Message" Message on thankyoumessage screen 
	Then I verify "Application Received" Message on thankyoumessage screen 
	And I logout the Application 
	
	