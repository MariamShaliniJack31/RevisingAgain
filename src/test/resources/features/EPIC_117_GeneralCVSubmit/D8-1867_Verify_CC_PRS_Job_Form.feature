#Story: D8-1867
@CCandPRSEnableJobWithCountryOfAfrica 
Feature: Proceeding from the job detail page to the CC_PRS form page 

Scenario: 
	Anonymous user navigates to the CC and PRS form page based on their country as CC form is enabled
	Given I navigate upload CV page and verifies CC and PRS Enabled form for Anonymous user 
	Then I navigate to job details page 
	Then I click on "Apply Job" button on Job details page 
	When I check "Apply with your CV Radio Button" whether selected in ApplywithyourCV screen 
	And I Click on "Next" button on ApplywithyourCV screen 
	Then I navigate to PRS general CV Form page 
	Then I verify "Submit Your CV as Header" on PRS generalCVForm screen 
	Then I verify "Progress Bar Line" on PRS generalCVForm screen 
	And I verify "Steps" Message on ApplywithyourCV screen 
	And I Enter "Email Address" field on ApplywithyourCV screen 
	And I Enter "First Name" field on ApplywithyourCV screen 
	And I Enter "Last Name" field on ApplywithyourCV screen 
	And I Click on "Upload CV" button on ApplywithyourCV screen 
	And I Click on "Browse" button on ApplywithyourCV screen 
	And I upload the CV with "docx" format on ApplywithyourCV screen 
	And I verify "Uploaded File Name" Message on ApplywithyourCV screen 
	And I verify "Terms and Conditions" link on ApplywithyourCV screen 
	And I select "Country" on PRS generalCVForm screen 
	And I Click on "CCJOBNEXT" button on ApplywithyourCV screen 
	Then I verify "Submit Your CV as Header" on PRS generalCVForm screen 
	Then I verify "About You" is displayed on CC_Form 
	And I verify "Steps" Message on ApplywithyourCV screen 
	And I select "Home Country" field on CC_Form 
	And I Enter "City" field on CC_Form 
	And I select "Nationality" field on CC_Form 
	And I Enter "Available Date" field on CC_Form 
	And I Click on "Visa Option" button on CC_Form 
	And I Click on "CCJobNext" button on ApplywithyourCV screen 
	Then I verify "Your Role" is displayed on CC_Form 
	And I select "Industry" field on CC_Form 
	And I select "SubIndustry" field on CC_Form 
	And I select "Sector" field on CC_Form 
	And I select "SubSector" field on CC_Form 
	And I select "Salary Frequency" field on CC_Form 
	And I Enter "Amount" field on CC_Form 
	And I select "Currency" field on CC_Form 
	And I Click on "Apply Now" button on CC_Form 
	#Then I verify "Submit Your CV as Header" on PRS generalCVForm screen 
	#Then I verify "Progress Bar Line" on PRS generalCVForm screen 
	#And I verify "Steps" Message on ApplywithyourCV screen 
	
	
Scenario: 
	Authenticated user navigates to the CC and PRS form page based on their country as CC form is enabled
	Given I navigate upload CV page and verifies CC Enabled form as Authenticate user 
	Then I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login" button on LoginPage 
	Then I navigate to job details page 
	Then I click on "Apply Job" button on Job details page 
	When I check "Apply with your CV Radio Button" whether selected in ApplywithyourCV screen 
	And I Click on "Next" button on ApplywithyourCV screen 
	Then I navigate to PRS general CV Form page 
	Then I verify "Submit Your CV as Header" on PRS generalCVForm screen 
	Then I verify "Progress Bar Line" on PRS generalCVForm screen 
	And I verify "Steps" Message on ApplywithyourCV screen 
	And I Enter "Email Address" field on ApplywithyourCV screen 
	And I Enter "First Name" field on ApplywithyourCV screen 
	And I Enter "Last Name" field on ApplywithyourCV screen 
	And I Click on "Upload CV" button on ApplywithyourCV screen 
	And I Click on "Browse" button on ApplywithyourCV screen 
	And I upload the CV with "docx" format on ApplywithyourCV screen 
	And I verify "Uploaded File Name" Message on ApplywithyourCV screen 
	And I verify "Terms and Conditions" link on ApplywithyourCV screen 
	And I select "Country" on PRS generalCVForm screen 
	And I Click on "CCJOBNEXT" button on ApplywithyourCV screen 
	Then I verify "Submit Your CV as Header" on PRS generalCVForm screen 
	Then I verify "About you" is displayed on CC_Form 
	And I verify "Steps" Message on ApplywithyourCV screen 
	And I select "Home Country" field on CC_Form 
	And I Enter "City" field on CC_Form 
	And I select "Nationality" field on CC_Form 
	And I Enter "Available Date" field on CC_Form 
	And I Click on "Visa Option" button on CC_Form 
	And I Click on "CCJobNext" button on ApplywithyourCV screen 
	Then I verify "Your Role" is displayed on CC_Form 
	And I select "Industry" field on CC_Form 
	And I select "Sector" field on CC_Form 
	And I select "SubIndustry" field on CC_Form
	And I select "Salary Frequency" field on CC_Form 
	And I select "SubSector" field on CC_Form
	And I Enter "Amount" field on CC_Form 
	And I select "Currency" field on CC_Form 
	And I Click on "Apply Now" button on CC_Form 
	#Then I verify "Submit Your CV as Header" on PRS generalCVForm screen 
	#Then I verify "Progress Bar Line" on PRS generalCVForm screen 
	#And I verify "Steps" Message on ApplywithyourCV screen 
