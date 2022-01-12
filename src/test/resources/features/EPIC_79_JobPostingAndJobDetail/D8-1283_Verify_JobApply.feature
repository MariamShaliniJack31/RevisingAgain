#Story-D8-1283
@ReApplyTheAppliedJob 
Feature: Candidate ReApply the same job and verify the Message 

Scenario: Anonymous user ReApply the same job and verify the Message 
	Given I am on Michelpage to validate the ReApply of same job functionality as an Anonymous user 
	Then I navigate to job details page 
	When I click on "Apply Job" button on Job details page 
	Then I verify "How would you like to apply" Message on ApplywithyourCV screen 
	And I verify "Apply with your CV" Message on ApplywithyourCV screen 
	When I check "Apply with your CV" whether selected in ApplywithyourCV screen 
	And I Click on "Next" button on ApplywithyourCV screen 
	Then I verify "Apply with your CV as Header" Message on ApplywithyourCV screen 
	And I Enter "Email Address" field on ApplywithyourCV screen 
	And I Enter "First Name" field on ApplywithyourCV screen 
	And I Enter "Last Name" field on ApplywithyourCV screen 
	And I Click on "Upload CV" button on ApplywithyourCV screen 
	And I Click on "Browse" button on ApplywithyourCV screen 
	And I upload the CV with "docx" format on ApplywithyourCV screen 
	And I verify "Uploaded File Name" Message on ApplywithyourCV screen 
	And I Click on "Apply Now" button on ApplywithyourCV screen 
	Then I verify "Successfully Message" Message on thankyoumessage screen 
	Then I verify "Application Received" Message on thankyoumessage screen 
	Then I navigate to job details page 
	When I click on "Apply Job" button on Job details page 
	Then I verify "How would you like to apply?" Message on ApplywithyourCV screen 
	Then I verify "You had already applied for the job, do you want to reapply?" Message on ApplywithyourCV screen 
	
Scenario: Authenticate user ReApply the same job and verify the Message 
	Given I am on Michelpage to validate the ReApply of same job functionality as an Authenticate user 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login" button on LoginPage 
	Then I navigate to job details page 
	When I click on "Apply Job" button on Job details page 
	Then I verify "How would you like to apply" Message on ApplywithyourCV screen 
	Then I verify "You had already applied for the job, do you want to reapply?" Message on ApplywithyourCV screen 
	And I logout the Application 