#Story:D-1689
@JobApplyWithPRSGeneralCVformWithFrenchJob 
Feature: Proceeding from the job detail page to PRS general CV form page with Frech Language 

Scenario: 
	Anonymous user navigating from Job Details Page to PRS general CV form Page with valid data 
	Given I am on Michelpage and uploading CV on PRS general CV form page with valide data as an Anonymous user for French language 
	Then I navigate to PRS general CV Form page for French Job 
	Then I verify "Submit Your CV as Header" on PRS generalCVForm screen 
	Then I verify "Progress Bar Line" on PRS generalCVForm screen 
	And I Enter "Email Address" field on ApplywithyourCV screen 
	And I Enter "First Name" field on ApplywithyourCV screen 
	And I Enter "Last Name" field on ApplywithyourCV screen 
	And I Click on "Upload CV" button on ApplywithyourCV screen 
	And I Click on "Browse" button on ApplywithyourCV screen 
	And I upload the CV with "docx" format on ApplywithyourCV screen 
	And I verify "Uploaded File Name" Message on ApplywithyourCV screen 
	And I verify "Terms and Conditions" link on ApplywithyourCV screen 
	And I Click on "CCJOBNEXT" button on ApplywithyourCV screen 
	Then I verify "Submit Your CV as Header" on PRS generalCVForm screen 
	Then I verify "About You" is displayed on CC_Form 
	And I select "Sector" from dropdown on PRS generalCVForm screen 
	And I select "Contract Type" from dropdown on PRS generalCVForm screen 
	And I verify "Terms and Conditions" link on ApplywithyourCV screen 
	And I click on "Submit CV" button on PRS generalCVForm screen 
	Then I verify "Successfully Message" Message on thankyoumessage screen 
	Then I verify "CV Recu" Message on thankyoumessage screen 
	
Scenario: 
	Authenticated user navigating from Job Details Page to PRS general CV form Page with valid data 
	Given I am on Michelpage and uploading CV on PRS general CV form page with valide data as an Authenticated user for French language 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login" button on LoginPage 
	Then I navigate to PRS general CV Form page for French Job 
	Then I verify "Submit Your CV as Header" on PRS generalCVForm screen 
	Then I verify "Progress Bar Line" on PRS generalCVForm screen 
	And I Click on "Upload CV" button on ApplywithyourCV screen 
	And I Click on "Browse" button on ApplywithyourCV screen 
	And I upload the CV with "docx" format on ApplywithyourCV screen 
	And I verify "Uploaded File Name" Message on ApplywithyourCV screen 
	And I verify "Terms and Conditions" link on ApplywithyourCV screen 
	And I Click on "CCJOBNEXT" button on ApplywithyourCV screen 
	Then I verify "Submit Your CV as Header" on PRS generalCVForm screen 
	Then I verify "About You" is displayed on CC_Form 
	And I select "Sector" from dropdown on PRS generalCVForm screen 
	And I select "Contract Type" from dropdown on PRS generalCVForm screen 
	And I verify "Terms and Conditions" link on ApplywithyourCV screen 
	And I click on "Submit CV" button on PRS generalCVForm screen 
	Then I verify "Successfully Message" Message on thankyoumessage screen 
	Then I verify "CV Received" Message on thankyoumessage screen 
	And I logout the Application 
	
	
Scenario: 
	Anonymous user navigating from Job Details Page to PRS general CV form Page with Invalid data
	Given I am on Michelpage and uploading CV on PRS general CV form page with Invalide data as an Anonymous user for French language 
	Then I navigate to PRS general CV Form page for French Job 
	Then I verify "Submit Your CV as Header" on PRS generalCVForm screen 
	Then I verify "Progress Bar Line" on PRS generalCVForm screen 
	And I Enter "Invalid email address" field with invalid data on ApplywithyourCV screen 
	And I Enter "Invalid First Name" field with invalid data on ApplywithyourCV screen 
	And I Enter "Invalid Last Name" field with invalid data on ApplywithyourCV screen 
	And I verify "Email Error" Message on ApplywithyourCV screen 
	And I verify "First Name Error" Message on ApplywithyourCV screen 
	And I verify "Last name Error" Message on ApplywithyourCV screen 
	And I Click on "Upload CV" button on ApplywithyourCV screen 
	And I Click on "Browse" button on ApplywithyourCV screen 
	And I upload the CV with "xlsx" format on ApplywithyourCV screen 
	And I verify "Invalid FileExtension Error" Message on ApplywithyourCV screen 
	
Scenario: 
	Authenticated user navigating from Job Details Page to PRS general CV form Page with Invalid data 
	Given I am on Michelpage and uploading CV on PRS general CV form page with Invalide data as an Authenticated user for French language 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login" button on LoginPage 
	Then I navigate to PRS general CV Form page for French Job 
	Then I verify "Submit Your CV as Header" on PRS generalCVForm screen 
	Then I verify "Progress Bar Line" on PRS generalCVForm screen 
	And I Enter "Invalid email address" field with invalid data on ApplywithyourCV screen 
	And I Enter "Invalid First Name" field with invalid data on ApplywithyourCV screen 
	And I Enter "Invalid Last Name" field with invalid data on ApplywithyourCV screen 
	And I verify "Email Error" Message on ApplywithyourCV screen 
	And I verify "First Name Error" Message on ApplywithyourCV screen 
	And I verify "Last name Error" Message on ApplywithyourCV screen 
	And I Click on "Upload CV" button on ApplywithyourCV screen 
	And I Click on "Browse" button on ApplywithyourCV screen 
	And I upload the CV with "xlsx" format on ApplywithyourCV screen 
	And I verify "Invalid FileExtension Error" Message on ApplywithyourCV screen 
	And I logout the Application 