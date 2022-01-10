#Story:D8-472
@UploadCVCheckExistingDetailsUseGoBacklink 
Feature:  Proceeding from the job detail page to the upload CV with valid data then check existing details 


Scenario: 
	Anonymous navigating from Job Details Page to thank you message page then back to previous page
	Given I am on Michelpage for uploading CV then check prepopulated details by clicking on go back link as an Anonymous user 
	Then I navigate to CC Enabled job details page 
	Then I click on "Apply Job" button on Job details page 
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
	And I Click on "CCJobNext" button on ApplywithyourCV screen 
	Then I verify "About You" is displayed on CC_Form 
	And I verify "Steps" Message on ApplywithyourCV screen 
	And I Click on "Visa Option" button on CC_Form 
	And I select "Home Country" field on CC_Form 
	And I Enter "City" field on CC_Form 
	And I select "Nationality" field on CC_Form 
	And I Enter "Available Date" field on CC_Form 
	And I Click on "CCJobNextNew" button on ApplywithyourCV screen 
	Then I verify "Your Role" is displayed on CC_Form 
	And I select "Industry" field on CC_Form 
	And I select "SubIndustry" field on CC_Form 
	And I select "Sector" field on CC_Form 
	And I select "SubSector" field on CC_Form 
	And I select "Salary Frequency" field on CC_Form 
	And I select "Currency" field on CC_Form 
	And I Enter "Amount" field on CC_Form 
	And I Click on "Apply Now" button on CC_Form 
	Then I verify "Successfully Message" Message on thankyoumessage screen 
	#From here going back by clicking on go back link to check pre autopopulated details
	Then I click "Go Back" link on thankyoumessage screen 
	Then I verify "Your Role" is displayed on CC_Form 
	Then I verify "Industry" is displayed on CC_Form 
	Then I verify "Sector" is displayed on CC_Form 
	Then I verify "SALARY FREQUENCY FIELD" is displayed on CC_Form 
	Then I verify "Currency" is displayed on CC_Form 
	Then I verify "Amount" is displayed on CC_Form 
	Then I click "Go Back" link on thankyoumessage screen 
	Then I verify "About You" is displayed on CC_Form 
	Then I verify "Visa Option" is displayed on CC_Form 
	Then I verify "Home Country" is displayed on CC_Form 
	Then I verify "City" is displayed on CC_Form 
	Then I verify "Nationality" is displayed on CC_Form 
	Then I verify "Available Date" is displayed on CC_Form 
	Then I click "Go Back" link on thankyoumessage screen 
	And I Click on "Next" button on ApplywithyourCV screen 
	And I verify "Email Address" Message on ApplywithyourCV screen 
	And I verify "First Name" Message on ApplywithyourCV screen 
	And I verify "Last Name" Message on ApplywithyourCV screen 