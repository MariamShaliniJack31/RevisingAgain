@SmokeTestAuthenticate
Feature: Authenticate user Smoke scenario

  Scenario: 
    Authenticate user End to end flow

    Given I navigate SIT page as an Authenticate user
    When I Enter "Username" field on LoginPage
    Then I Enter "Password" field on LoginPage
    And I click on "Login" button on LoginPage
    Then I navigate to similar job details page
    #Save JOb
    When I click on "Save Job AuthUser" button on Job details page
    Then I verify job is "Saved"
    Then I click on "Saved Job AuthUser" button on Job details page
    And I verify job is "unSaved"
    #Email JOb
    When I click on "Email Job" button on Job details page
    And I click on "Send Email" button on Email pop up
    Then I verify "Email Fields Error" Message on Email pop up
    Then I Enter "To Email" field on Email pop up
    And I click on "Send Email" button on Email pop up
    Then I verify "Email has been sent successfully" Message on Email pop up
    And I click on "Close" button on Email pop up
    #Similar JOb
    Then I verify "Similar Jobs" block displayed in job-detail pages
    Then I verify "Only 3 Similar Jobs" are displayed at a time in job-detail pages
    And I verify "Similar Jobs title" in job-detail pages
    #CV page
    When I click on "Apply Job" button on Job details page
    Then I verify "How would you like to apply" Message on ApplywithyourCV screen
    And I verify "Apply with your CV" Message on ApplywithyourCV screen
    And I Click on "Next" button on ApplywithyourCV screen
    #Apply with your CV page
    When I verify "Apply with your CV as Header" Message on ApplywithyourCV screen
    Then I verify "Email Address" field pre-pouplated on ApplywithyourCV screen
    Then I verify "First Name" field pre-pouplated on ApplywithyourCV screen
    Then I verify "Last Name" field pre-pouplated on ApplywithyourCV screen
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "xlsx" format on ApplywithyourCV screen
    And I verify "INVALID FILEEXTENSION ERROR" Message on ApplywithyourCV screen
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "resume with max size" format on ApplywithyourCV screen
    And I verify "MAX SIZE ERROR" Message on ApplywithyourCV screen
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "docx" format on ApplywithyourCV screen
    And I verify "Uploaded File Name" Message on ApplywithyourCV screen
    And I verify "Standard Conditions for Recruitment Services" link on ApplywithyourCV screen
    And I verify "Terms and Conditions" link on ApplywithyourCV screen
    And I verify "Privacy Policy" link on ApplywithyourCV screen
    And I Click on "Apply Now" button on ApplywithyourCV screen
    #Sucess Page
    Then I verify "Successfully Message" Message on thankyoumessage screen
    Then I verify "Application Received" Message on thankyoumessage screen
    And I logout the Application
