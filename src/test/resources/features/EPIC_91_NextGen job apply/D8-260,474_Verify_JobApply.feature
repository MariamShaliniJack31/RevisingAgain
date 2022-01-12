#Story:D-260,D8-474
@JobAppllywithCVwithValidNinvalid
Feature: Proceeding from the job detail page to the upload CV with invalid data

  Scenario: 
    Anonymous user navigating from Job Details Page to upload cv page with invalid data

    Given I am on Michelpage for uploading CV with Invalid Data as an Anonymous user
    Then I navigate to job details page
    Then I click on "Apply Job" button on Job details page
    And I verify "Apply with your CV" Message on ApplywithyourCV screen
    When I check "Apply with your CV Radio Button" whether selected in ApplywithyourCV screen
    And I Click on "Next" button on ApplywithyourCV screen
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
    Authenticated navigating from Job Details Page to upload cv page with invalid data

    Given I am on Michelpage for uploading CV with Invalid Data as an Authenticated user
    When I Enter "Username" field on LoginPage
    Then I Enter "Password" field on LoginPage
    And I click on "Login" button on LoginPage
    Then I navigate to job details page
    Then I click on "Apply Job" button on Job details page
    And I verify "Apply with your CV" Message on ApplywithyourCV screen
    When I check "Apply with your CV Radio Button" whether selected in ApplywithyourCV screen
    And I Click on "Next" button on ApplywithyourCV screen
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

  Scenario: 
    Anonymous navigating from Job Details Page to upload cv page with valid data

    Given I am on Michelpage for uploading CV with valid Data as an Anonymous user
    Then I navigate to job details page
    Then I click on "Apply Job" button on Job details page
    And I verify "Apply with your CV" Message on ApplywithyourCV screen
    When I check "Apply with your CV Radio Button" whether selected in ApplywithyourCV screen
    And I Click on "Next" button on ApplywithyourCV screen
    Then I verify "Apply with your CV as Header" Message on ApplywithyourCV screen
    And I Enter "EMAIL ADDRESS" field on ApplywithyourCV screen
    And I Enter "First Name" field on ApplywithyourCV screen
    And I Enter "Last Name" field on ApplywithyourCV screen
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "docx" format on ApplywithyourCV screen
    And I verify "Uploaded File Name" Message on ApplywithyourCV screen
    And I Click on "Apply Now" button on ApplywithyourCV screen
    Then I verify "Thank You Message URL" on ThankYoumessage Page

  Scenario: 
    Authenticated navigating from Job Details Page to upload cv page with valid data

    Given I am on Michelpage for uploading CV with valid Data as an Authenticated user
    When I Enter "Username" field on LoginPage
    Then I Enter "Password" field on LoginPage
    And I click on "Login" button on LoginPage
    Then I navigate to job details page
    Then I click on "Apply Job" button on Job details page
    And I verify "Apply with your CV" Message on ApplywithyourCV screen
    When I check "Apply with your CV Radio Button" whether selected in ApplywithyourCV screen
    And I Click on "Next" button on ApplywithyourCV screen
    Then I verify "Apply with your CV as Header" Message on ApplywithyourCV screen
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "docx" format on ApplywithyourCV screen
    And I verify "Uploaded File Name" Message on ApplywithyourCV screen
    And I Click on "Apply Now" button on ApplywithyourCV screen
    Then I verify "Thank You Message URL" on ThankYoumessage Page
    And I logout the Application
