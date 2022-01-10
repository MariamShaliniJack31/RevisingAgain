#Story: D8-258,D8-261,D8-277,D8-356,D8-357,D8-466,D8-595,D8-646,D8-904,D8-1013,D8-1674
@VerifyCCEnableJob
Feature: Proceeding from the job detail page to the job apply page

  Scenario: Customer Connect Form is visible when CC is enabled for Anonymous User
    Given I navigate upload CV and verifies CC Enabled form as Anonymous user
    Then I navigate to CC Enabled job details page
    When I click on "Apply Job" button on Job details page
    And I Click on "Next" button on ApplywithyourCV screen
    # And I navigate to previous page
    # Then I accept alert
    And I Click on "Previous" button on ApplywithyourCV screen
    And I Click on "Next" button on ApplywithyourCV screen
    Then I verify "JobBanner" Message on ApplywithyourCV screen
    Then I verify "Apply with your CV as Header" Message on ApplywithyourCV screen
    And I verify "Steps" Message on ApplywithyourCV screen
    And I verify "Email address field" Message on ApplywithyourCV screen
    And I verify "First Name field" Message on ApplywithyourCV screen
    And I verify "Last Name field" Message on ApplywithyourCV screen
    # And I verify "Phone Number field" text in ApplywithyourCV screen
    And I Click on "CCJobNext" button on ApplywithyourCV screen
    Then I verify All Errors are displayed
    And I Enter "Email Address" field on ApplywithyourCV screen
    And I Enter "First Name" field on ApplywithyourCV screen
    And I Enter "Last Name" field on ApplywithyourCV screen
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "docx" format on ApplywithyourCV screen
    And I verify "Uploaded File Name" Message on ApplywithyourCV screen
    And I Click on "CCJobNext" button on ApplywithyourCV screen
    Then I verify "JobBanner" Message on ApplywithyourCV screen
    Then I verify "About you" is displayed on CC_Form
    And I verify "Steps" Message on ApplywithyourCV screen
    Then I verify "Do you currently have a working visa for the Middle East" is displayed on CC_Form
    Then I verify "What country do you live in" is displayed on CC_Form
    Then I verify "What city or town do you live in" is displayed on CC_Form
    Then I verify "For which country do you hold nationality" is displayed on CC_Form
    Then I verify "If known, please let us know when you are available to start" is displayed on CC_Form
    And I Click on "CCJobNext" button on ApplywithyourCV screen
    Then I verify All Errors are displayed
    And I select "Home Country" field on CC_Form
    And I Enter "City" field on CC_Form
    And I select "Nationality" field on CC_Form
    And I Enter "Available Date" field on CC_Form
    And I Click on "Visa Option" button on CC_Form
    And I Click on "CCJobNext" button on ApplywithyourCV screen
    Then I verify "JobBanner" Message on ApplywithyourCV screen
    And I verify "Steps" Message on ApplywithyourCV screen
    Then I verify "Your Role" is displayed on CC_Form
    Then I verify "Which industry best describes your current or most recent company" is displayed on CC_Form
    Then I verify "Which sector do you work in" is displayed on CC_Form
    Then I verify "Salary frequency?" is displayed on CC_Form
    Then I verify "What is your current salary including bonus and benefits?" is displayed on CC_Form
    And I Click on "Apply Now" button on CC_Form
    Then I verify All Errors are displayed
    And I select "Industry" field on CC_Form
    And I select "Sector" field on CC_Form
    And I select "SubIndustry" field on CC_Form
    And I select "Salary Frequency" field on CC_Form
    And I select "SubSector" field on CC_Form
    And I Enter "Amount" field on CC_Form
    And I select "Currency" field on CC_Form
    And I Click on "Agree all Terms" button on CC_Form
    And I Click on "Apply Now" button on CC_Form
    Then I verify "Successfully Message" Message on thankyoumessage screen
    Then I verify "Application Received" Message on thankyoumessage screen
    Then I verify "Back to Search" Message on thankyoumessage screen
    Then I verify "Thank You Message URL" on ThankYoumessage Page

  Scenario: Customer Connect Form is visible when CC is enabled for Authenticated User
    Given I navigate upload CV and verifies CC Enabled form as Authenticate user
    Then I Enter "Username" field on LoginPage
    Then I Enter "Password" field on LoginPage
    And I click on "Login" button on LoginPage
    Then I navigate to CC Enabled job details page
    When I click on "Apply Job" button on Job details page
    And I Click on "Next" button on ApplywithyourCV screen
    And I Click on "Previous" button on ApplywithyourCV screen
    And I Click on "Next" button on ApplywithyourCV screen
    Then I verify "JobBanner" Message on ApplywithyourCV screen
    Then I verify "Apply with your CV as Header" Message on ApplywithyourCV screen
    And I verify "Steps" Message on ApplywithyourCV screen
    And I verify "Email address field" Message on ApplywithyourCV screen
    And I verify "First Name field" Message on ApplywithyourCV screen
    And I verify "Last Name field" Message on ApplywithyourCV screen
     #And I verify "Phone Number field" text in ApplywithyourCV screen
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "docx" format on ApplywithyourCV screen
    And I verify "Uploaded File Name" Message on ApplywithyourCV screen
    And I Click on "CCJobNext" button on ApplywithyourCV screen
#    Then I verify "JobBanner" Message on ApplywithyourCV screen
#    And I verify "Steps" Message on ApplywithyourCV screen
#    Then I verify "About you" is displayed on CC_Form
#    Then I verify "Do you currently have a working visa for the Middle East" is displayed on CC_Form
#    Then I verify "What country do you live in" is displayed on CC_Form
#    Then I verify "What city or town do you live in" is displayed on CC_Form
#    Then I verify "For which country do you hold nationality" is displayed on CC_Form
#    Then I verify "If known, please let us know when you are available to start" is displayed on CC_Form
#    And I Click on "CCJobNext" button on ApplywithyourCV screen
#    Then I verify All Errors are displayed
#    And I select "Home Country" field on CC_Form
#    And I Enter "City" field on CC_Form
#    And I select "nationality" field on CC_Form
#    And I Enter "Available Date" field on CC_Form
#    And I Click on "Visa Option" button on CC_Form
#    And I Click on "CCJobNext" button on ApplywithyourCV screen
#    Then I verify "JobBanner" Message on ApplywithyourCV screen
#    And I verify "Steps" Message on ApplywithyourCV screen
#    Then I verify "Your Role" is displayed on CC_Form
#    Then I verify "Which industry best describes your current or most recent company" is displayed on CC_Form
#    Then I verify "Which sector do you work in" is displayed on CC_Form
#    Then I verify "Salary frequency?" is displayed on CC_Form
#    Then I verify "What is your current salary including bonus and benefits" is displayed on CC_Form
   # And I Click on "Apply Now" button on CC_Form
    #Then I verify All Errors are displayed
    #And I select "Industry" field on CC_Form
    #And I select "Sector" field on CC_Form
    #And I select "SubIndustry" field on CC_Form
    #And I select "Salary Frequency" field on CC_Form
    #And I select "SubSector" field on CC_Form
    #And I Enter "Amount" field on CC_Form
    #And I select "Currency" field on CC_Form
#    And I Click on "Apply Now" button on CC_Form
#    Then I verify "Successfully Message" Message on thankyoumessage screen
#    Then I verify "Application Received" Message on thankyoumessage screen
#    Then I verify "Back to Search" Message on thankyoumessage screen
#    Then I verify "Thank You Message URL" on ThankYoumessage Page
    And I logout the Application
