#D8-299,D8-297,D8-292

@JobSolrSearchh
Feature: User navigating from job search page to job details page then go back to job listing page

  Scenario: 
    Anonymous user Verify job title in Job search Page and navigating to job details page then go back to joblisting

    Given I am on Michelpage for valid and Invalid search as Anonymous user
    Then I navigate to Home Page
    When I enter "Invalid job Title" on jobsearch page
    Then I verify that dropdown is visible or not
    When I enter "Valid job Title" on jobsearch page
    Then I verify that dropdown is visible or not
    When I enter "Job Title TextBox" on jobsearch page
    And I click on "Search Button" button on jobsearch page
    Then I verify "Search Job Count" on jobsearch page
    #Then I navigate to Home Page
    #Then I verify "JobSearch Value" on jobsearch page

  Scenario: 
    Authenticated user Verify job title in Job search Page and navigating to job details page then go back to joblisting

    Given I am on Michelpage for valid and Invalid search as Authenticate user
    Then I Enter "Username" field on LoginPage
    Then I Enter "Password" field on LoginPage
    And I click on "Login" button on LoginPage
    Then I navigate to Home Page
    When I enter "Invalid job Title" on jobsearch page
    Then I verify that dropdown is visible or not
    When I enter "Valid job Title" on jobsearch page
    Then I verify that dropdown is visible or not
    When I enter "Job Title TextBox" on jobsearch page
    And I click on "Search Button" button on jobsearch page
    Then I verify "Search Job Count" on jobsearch page
    #Then I navigate to Home Page
    #Then I verify "JobSearch Value" on jobsearch page
