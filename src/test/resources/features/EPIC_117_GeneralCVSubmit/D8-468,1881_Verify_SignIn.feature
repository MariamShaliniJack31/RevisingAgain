#Story:D-468,D-1881
@VerifySignIn
Feature: Proceeding from the job detail page to PRS general CV form page

  Scenario: 
    Anonymous user navigating from Submit CV form to verify SignIn

    Given I am on Michelpage to Register user on CV Submit as Anonymous User
    Then I navigate to PRS general CV Form page
    And I verify "Email address field" Message on ApplywithyourCV screen
    And I verify "First Name field" Message on ApplywithyourCV screen
    And I verify "Last Name field" Message on ApplywithyourCV screen
    And I verify "Your CV field" Message on ApplywithyourCV screen
    And I Click on "CCJOBNEXT" button on ApplywithyourCV screen
    Then I verify All Errors are displayed
    Then I Enter "Unique EmailID" field on ApplywithyourCV screen
    And I Enter "First Name" field on ApplywithyourCV screen
    And I Enter "Last Name" field on ApplywithyourCV screen
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "docx" format on ApplywithyourCV screen
    And I verify "Uploaded File Name" Message on ApplywithyourCV screen
    And I Click on "CCJOBNEXT" button on ApplywithyourCV screen
    Then I verify "About You" is displayed on CC_Form
    Then I verify "Sector Field" on PRS generalCVForm screen
    Then I verify "Contract Type Field" on PRS generalCVForm screen
    And I click on "Submit CV" button on PRS generalCVForm screen
    And I select "Sector" from dropdown on PRS generalCVForm screen
    And I select "Contract Type" from dropdown on PRS generalCVForm screen
    Then I verify "Sign UP" on PRS generalCVForm screen
    Then Enter "Individual Password" field on ApplywithyourCV screen
    And I click on "Submit CV" button on PRS generalCVForm screen
    Then I verify "Successfully Message" Message on thankyoumessage screen
    Then I navigate to PRS general CV Form page
    Then I verify "Submit Your CV as Header" on PRS generalCVForm screen
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "docx" format on ApplywithyourCV screen
    And I verify "Uploaded File Name" Message on ApplywithyourCV screen
    And I Click on "CCJOBNEXT" button on ApplywithyourCV screen
    Then I verify "About You" is displayed on CC_Form
    And I select "Sector" from dropdown on PRS generalCVForm screen
    And I select "Contract Type" from dropdown on PRS generalCVForm screen
    Then I verify "Sign UP" on PRS generalCVForm screen
    And I logout the Application

  Scenario: 
    Authenticate user navigating from Job Details Page to PRS general CV form Page with valid data

    Given I am on Michelpage to Register user on CV Submit as Authenticate User
    When I Enter "Username" field on LoginPage
    Then I Enter "Password" field on LoginPage
    And I click on "Login Button" button on LoginPage
    Then I navigate to PRS general CV Form page
    And I verify "Email address field" Message on ApplywithyourCV screen
    And I verify "First Name field" Message on ApplywithyourCV screen
    And I verify "Last Name field" Message on ApplywithyourCV screen
    And I verify "Your CV field" Message on ApplywithyourCV screen
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "docx" format on ApplywithyourCV screen
    And I verify "Uploaded File Name" Message on ApplywithyourCV screen
    And I Click on "CCJOBNEXT" button on ApplywithyourCV screen
    Then I verify "About You" is displayed on CC_Form
    Then I verify "Sector Field" on PRS generalCVForm screen
    Then I verify "Contract Type Field" on PRS generalCVForm screen
    And I select "Sector" from dropdown on PRS generalCVForm screen
    And I select "Contract Type" from dropdown on PRS generalCVForm screen
    Then I verify "Sign UP" on PRS generalCVForm screen
    And I logout the Application
