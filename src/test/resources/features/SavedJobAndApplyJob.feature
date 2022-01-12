Feature: Verify Job is saved And Applied successfully

  Background: 
    Given I am on Michelpage

  @JobSaved
  Scenario: Saved Job
    When I navigate to job details page as an Anonymous user
    Then I click on "Save Job" button on Job details page
    Then I verify job is saved and button name is "Saved Job"
    Then I Navigate to MichelPage
    Then I Enter "Username" field on LoginPage
    Then I Enter "Password" field on LoginPage
    And I click on "Login" button on LoginPage
    And I verify "Home Page Title" Message on HomePage
    Then I navigate to Job details page of the same job saved by Anonymous user
    Then I verify job is "Saved"

  @JobApply
  Scenario: Apply Job
    Then I Enter "Username" field on LoginPage
    Then I Enter "Password" field on LoginPage
    And I click on "Login" button on LoginPage
    And I verify "Home Page Title" Message on HomePage
    Then I navigate to Job details page of the same job saved by Anonymous user
    Then I click on "Apply Job" button on Job details page
    And I verify "Apply with your CV" Message on ApplywithyourCV screen
    And I Enter "Enter your email address" field on ApplywithyourCV screen
    And I Enter "First Name" field on ApplywithyourCV screen
    And I Enter "Last Name" field on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    Then I upload the file with extensions which is not allowed
    And I verify "File Cannot be uploaded" Message on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    Then I upload the file with extensions which is allowed
