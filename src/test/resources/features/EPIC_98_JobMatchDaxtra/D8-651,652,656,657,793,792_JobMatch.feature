#Story:D8-651,D8-652,D8-656,D8-657,D8-793,D8-792
@JobMatchPage
Feature: User need to access Job Match from Home page so that it can have alternative way to find jobs.

  Scenario: Anonymous User navigates to Home page and upload the CV from Job Match block
    Given I am on Michelpage for uploading CV from Job Match as an Anonymous user
    Then I navigate to Home Page
    And I click on "Upload your CV" button on HomePage screen
    Then I verify "Upload your CV" label on Job Match screen
    And I click on "Upload CV" button on Job Match screen
    And I click on "Browse" button on Job Match screen
    And I upload the CV with "docx" format on Job Match screen
    And I click on "Show Option" button on Job Match screen
    And I click on "Remove" button on Job Match screen
    And I click on "Upload CV" button on Job Match screen
    And I click on "Browse" button on Job Match screen
    And I upload the CV with "docx" format on Job Match screen
    Then I click on "Next" button on Job Match screen
    And I verify "Where do you want to work" label on Job Match screen
    And I verify "Add your experience" label on Job Match screen
    And I verify "Add your skills" label on Job Match screen
    And I verify "Save your Profile" label on Job Match screen
    And I verify "Your Job Match Profile" label on Job Match screen
    And I verify "Location field Max Length" on Job Match screen
    Then I enter "Location" on Job Match screen
    And I click on "Addlocation" button on Job Match screen
    Then I enter "Location1" on Job Match screen
    And I click on "Addlocation" button on Job Match screen
    Then I enter "Location2" on Job Match screen
    And I click on "Addlocation" button on Job Match screen
    And I click on "Removelocation" button on Job Match screen
    Then I click on "Add Experience" button on Job Match screen
    And I verify "Job title" label on Job Match screen
    And I verify "Company name" label on Job Match screen
    And I verify "Start date" label on Job Match screen
    And I verify "End date" label on Job Match screen
    And I select "End date" field on Job Match screen
    And I click on "Save" button on Job Match screen
    And I verify "Job Title Error" message on Job Match screen
    And I verify "Company Name Error" message on Job Match screen
    And I verify "Date Error" message on Job Match screen
    And I click on "Cancel" button on Job Match screen
    Then I click on "Add Experience" button on Job Match screen
    Then I enter "Job title" on Job Match screen
    And I enter "Company name" on Job Match screen
    And I click on "currently work here checkbox" button on Job Match screen
    And I click on "Save" button on Job Match screen
    And I verify "View Saved Experience" message on Job Match screen
    #	And I click on "More option" button on Job Match screen
    #	And I click on "Edit experience" button on Job Match screen
    #	And I enter "Edit Job Title" on Job Match screen
    #	And I enter "Edit Company name" on Job Match screen
    #	And I click on "Update" button on Job Match screen
    And I click on "More option" button on Job Match screen
    And I click on "Delete" button on Job Match screen
    #	And I verify "Skill field Max Length" on Job Match screen
    #	Then I enter "Skill" on Job Match screen
    #	And I click on "Addskill" button on Job Match screen
    #	And I click on "Removeskill" button on Job Match screen
    Then I navigate to Home Page
    And I verify "Upload CV" label on HomePage screen
    And I verify "Get your results" label on HomePage screen

  Scenario: Authenticated User navigates to Home page and upload the CV from Job Match block
    Given I am on Michelpage for uploading CV from Job Match as an Authenticated user
    Then I Enter "Username" field on LoginPage
    Then I Enter "Password" field on LoginPage
    And I click on "Login" button on LoginPage
    Then I navigate to Home Page
    And I click on "Upload your CV" button on HomePage screen
    Then I verify "Upload your CV" label on Job Match screen
    And I click on "Upload CV" button on Job Match screen
    And I click on "Browse" button on Job Match screen
    And I upload the CV with "docx" format on Job Match screen
    And I click on "Show Option" button on Job Match screen
    And I click on "Remove" button on Job Match screen
    And I click on "Upload CV" button on Job Match screen
    And I click on "Browse" button on Job Match screen
    And I upload the CV with "docx" format on Job Match screen
    Then I click on "Next" button on Job Match screen
    And I verify "Where do you want to work" label on Job Match screen
    And I verify "Add your experience" label on Job Match screen
    And I verify "Add your skills" label on Job Match screen
    And I verify "Save your Profile" label on Job Match screen
    And I verify "Your Job Match Profile" label on Job Match screen
    And I verify "Location field Max Length" on Job Match screen
    Then I enter "Location" on Job Match screen
    And I click on "Addlocation" button on Job Match screen
    Then I enter "Location1" on Job Match screen
    And I click on "Addlocation" button on Job Match screen
    Then I enter "Location2" on Job Match screen
    And I click on "Addlocation" button on Job Match screen
    And I click on "Removelocation" button on Job Match screen
    Then I click on "Add Experience" button on Job Match screen
    And I verify "Job title" label on Job Match screen
    And I verify "Company name" label on Job Match screen
    And I verify "Start date" label on Job Match screen
    And I verify "End date" label on Job Match screen
    And I select "End date" field on Job Match screen
    And I click on "Save" button on Job Match screen
    And I verify "Job Title Error" message on Job Match screen
    And I verify "Company Name Error" message on Job Match screen
    And I verify "Date Error" message on Job Match screen
    And I click on "Cancel" button on Job Match screen
    Then I click on "Add Experience" button on Job Match screen
    Then I enter "Job title" on Job Match screen
    And I enter "Company name" on Job Match screen
    And I click on "currently work here checkbox" button on Job Match screen
    And I click on "Save" button on Job Match screen
    And I verify "View Saved Experience" message on Job Match screen
    #	And I click on "More option" button on Job Match screen
    #	And I click on "Edit experience" button on Job Match screen
    #	And I enter "Edit Job Title" on Job Match screen
    #	And I enter "Edit Company name" on Job Match screen
    #	And I click on "Update" button on Job Match screen
    And I click on "More option" button on Job Match screen
    And I click on "Delete" button on Job Match screen
    #	And I verify "Skill field Max Length" on Job Match screen
    #	Then I enter "Skill" on Job Match screen
    #	And I click on "Addskill" button on Job Match screen
    #	And I click on "Removeskill" button on Job Match screen
    Then I navigate to Home Page
    And I verify "Upload CV" label on HomePage screen
    And I verify "Get Your Result" label on HomePage screen
    And I logout the Application
