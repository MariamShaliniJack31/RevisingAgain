#D8-708
@UploadCVThenRemoveCVOnMyAccountPage 
Feature: Verify status after upload CV then Remove CV on my account page 

Scenario: 
	Authenticated User navigates from michael page to my Account page then uploading cv and removing cv
	Given I am on Michelpage then navigating to my Account page then login with valid creadentials 
	Then I click on "LoginOrSignUP" link on HomePage screen 
	Then I verify "Login Title My Account Page" Message on HomePage 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login Button" button on LoginPage 
	Then I verify "My Account Page Header" Message on HomePage 
	Then I click on "Your CV" link on HomePage screen 
	#Then I click on "Delete CV" link on HomePage screen
	Then I verify "Your CV Header" Message on yourCV page 
	And I Click on "Upload CV" button on ApplywithyourCV screen 
	And I Click on "Browse" button on ApplywithyourCV screen 
	And I upload the CV with "docx" format on ApplywithyourCV screen 
	And I verify "Uploaded File Name" Message on ApplywithyourCV screen
	Then I click on "View CV" link on HomePage screen
	Then I click on "Remove CV" link on HomePage screen
	Then I verify "Your CV Header" Message on yourCV page 
	And I Click on "Upload CV" button on ApplywithyourCV screen 
	And I Click on "Browse" button on ApplywithyourCV screen 
	And I upload the CV with "docx" format on ApplywithyourCV screen 
	And I verify "Uploaded File Name" Message on ApplywithyourCV screen
	And I Click on "Add CV" button on yourCV page 
	And I verify "Uploaded File Name" Message on ApplywithyourCV screen
	And I Click on "Upload CV" button on ApplywithyourCV screen 
	And I Click on "Browse" button on ApplywithyourCV screen 
	And I upload the CV with "docx" format on ApplywithyourCV screen 
	And I Click on "Add CV" button on yourCV page 
	And I Click on "Upload CV" button on ApplywithyourCV screen 
	And I Click on "Browse" button on ApplywithyourCV screen 
	And I upload the CV with "docx" format on ApplywithyourCV screen
	And I Click on "Add CV" button on yourCV page 
	Then I verify "To Add CV First Delete CV" Message on HomePage
	Then I click on "Delete CV" link on HomePage screen