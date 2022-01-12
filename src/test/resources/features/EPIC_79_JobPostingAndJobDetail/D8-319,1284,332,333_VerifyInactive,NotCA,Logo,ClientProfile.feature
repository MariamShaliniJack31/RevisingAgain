@InactiveAndNotCientAuth
Feature: Verify Inactive and not Client authorized Jobs

  #D8-319,D8-1284,D8-332,D8-333
  Scenario: Anonymous user verifies Inactive job in Job details Page
    Given I navigate to job details page as an Anonymous user to verify the inactive job
    Then I navigate to inactive job details page
    Then I verify "This position is now filled" is displyed in job details page

  Scenario: Authenticated user verifies Inactive job in Job details Page
    Given I am on Michelpage to verify the inactive job as an Authenticated user
    When I Enter "Username" field on LoginPage
    Then I Enter "Password" field on LoginPage
    And I click on "Login" button on LoginPage
    Then I navigate to inactive job details page
    Then I verify "This position is now filled" is displyed in job details page
    And I logout the Application

  # D8-320
  Scenario: Anonymous user verifies not client authorized Jobs in Job details Page
    Given I navigate to job details page as an Anonymous user to verify the not client authorized Jobs
    Then I navigate to not client authorized job details page
    Then I verify "Client Authorisation Required" is displyed in job details page

  Scenario: Authenticated user verifies not client authorized Jobs in Job details Page
    Given I am on Michelpage to verify not client authorized Jobs as an Authenticated user
    When I Enter "Username" field on LoginPage
    Then I Enter "Password" field on LoginPage
    And I click on "Login" button on LoginPage
    Then I navigate to not client authorized job details page
    Then I verify "Client Authorisation Required" is displyed in job details page
    And I logout the Application

  #D8-332
  Scenario: Anonymous user verifies employer creation logic for jobs created via /jobs/api REST
    Given I navigate Application to verify the employer created via API as an Anonymous user
    Then I navigate to clientprofile page
    Then I verify "client profile name" is displyed in job details page

  Scenario: Authenticated user verifies employer creation logic for jobs created via /jobs/api REST
    Given I navigate Application to verify the employer created via API as an Authenticated user
    When I Enter "Username" field on LoginPage
    Then I Enter "Password" field on LoginPage
    And I click on "Login" button on LoginPage
    Then I navigate to clientprofile page
    Then I verify "client profile name" is displyed in job details page
    And I logout the Application

  #D8-333
  Scenario: Anonymous user verifies LOGO creation logic for jobs created via /jobs/api REST
    Given I navigate Application to verify the LOGO created via API as an Anonymous user
    Then I navigate to LOGO job details page
    And I verify "Job Title" is displyed in job details page

  # And I verify "Logo" is displyed in job details page
  Scenario: Authenticated user verifies employer creation logic for jobs created via /jobs/api REST
    Given I navigate Application to verify the LOGO created via API as an Authenticated user
    When I Enter "Username" field on LoginPage
    Then I Enter "Password" field on LoginPage
    And I click on "Login" button on LoginPage
    Then I navigate to LOGO job details page
    And I verify "Job Title" is displyed in job details page
    #  And I verify "Logo" is displyed in job details page
    And I logout the Application
