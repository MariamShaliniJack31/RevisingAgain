#Story:D8-257,D8-258,D8-259,D8-264,D8-265,D8-266,D8-265,D8-266,D8-464,D8-550,D8-1145,D8-1146
@PRSJobApply
Feature: Candidate is able to upload the CV file as per selection and verifies the Application Received Message 
Scenario: Anonymous user is able to upload the CV file 
	Given I navigate upload CV and verifies Application Received Message as Anonymous user 
	Then I navigate to job details page 
	When I click on "Apply Job" button on Job details page 
	Then I verify "How would you like to apply" Message on ApplywithyourCV screen 
	And I verify "Apply with your CV" Message on ApplywithyourCV screen 
	When I check "Apply with your CV Radio Button" whether selected in ApplywithyourCV screen 
	And I Click on "Next" button on ApplywithyourCV screen 
	Then I verify "Apply with your CV as Header" Message on ApplywithyourCV screen 
	And I Enter "Email Address" field on ApplywithyourCV screen 
	And I Enter "First Name" field on ApplywithyourCV screen 
	And I Enter "Last Name" field on ApplywithyourCV screen 
	And I Click on "Upload CV" button on ApplywithyourCV screen 
	And I Click on "Browse" button on ApplywithyourCV screen 
	And I upload the CV with "docx" format on ApplywithyourCV screen 
	And I verify "Uploaded File Name" Message on ApplywithyourCV screen 
	And I verify "Standard Conditions for Recruitment Services" link on ApplywithyourCV screen 
	And I verify "Terms and Conditions" link on ApplywithyourCV screen 
	And I verify "Privacy Policy" link on ApplywithyourCV screen 
	And I Click on "Apply Now" button on ApplywithyourCV screen 	 
	Then I verify "Successfully Message" Message on thankyoumessage screen 
	Then I verify "Application Received" Message on thankyoumessage screen
	Then I verify "Back to Search" Message on thankyoumessage screen 
	Then I verify "Thank You Message URL" on ThankYoumessage Page 
Scenario: 
	Authenticate user navigates to Job Details Page and Uploads CV then verify application received message 
	Given I navigate upload CV and verifies Application Received Message as Authenticate user 
	#Then I accept alert 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login" button on LoginPage 
	Then I navigate to job details page 
	When I click on "Apply Job" button on Job details page 
	Then I verify "How would you like to apply" Message on ApplywithyourCV screen 
	And I verify "Apply with your CV" Message on ApplywithyourCV screen 
	When I check "Apply with your CV Radio button" whether selected in ApplywithyourCV screen 
	And I Click on "Next" button on ApplywithyourCV screen 
	When I verify "Apply with your CV as Header" Message on ApplywithyourCV screen 
	And I Enter "Last Name" field on ApplywithyourCV screen 
	And I Click on "Upload CV" button on ApplywithyourCV screen 
	And I Click on "Browse" button on ApplywithyourCV screen 
	And I upload the CV with "docx" format on ApplywithyourCV screen 
	And I verify "Uploaded File Name" Message on ApplywithyourCV screen 
	And I verify "Standard Conditions for Recruitment Services" link on ApplywithyourCV screen 
	And I verify "Terms and Conditions" link on ApplywithyourCV screen 
	And I verify "Privacy Policy" link on ApplywithyourCV screen 
	And I Click on "Apply Now" button on ApplywithyourCV screen 
	Then I verify "Successfully Message" Message on thankyoumessage screen 
	Then I verify "Application Received" Message on thankyoumessage screen
	Then I verify "Back to Search" Message on thankyoumessage screen 
	Then I verify "Thank You Message URL" on ThankYoumessage Page 
	And I logout the Application 