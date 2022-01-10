#D8-299,D8-297,D8-292,D8-294,D8-298,D8-300,D8-2413,D8-836,D8-892,D8-897,D8-355

@JobSolrSearch
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
    Then I verify "Show More" on jobsearch page
    And I click on "Show More Link" button on jobsearch page
    Then I verify "Show More URL" on jobsearch page
    Then I verify "Searched JobDetails List" on jobsearch page
    Then I verify "Create Alert Link" on jobsearch page
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
    Then I verify "Show More" on jobsearch page
    And I click on "Show More Link" button on jobsearch page
    Then I verify "Show More URL" on jobsearch page
    Then I verify "Searched JobDetails List" on jobsearch page
    Then I verify "Create Alert Link" on jobsearch page
    #Then I navigate to Home Page
    #Then I verify "JobSearch Value" on jobsearch page
    And I logout the Application
    
Scenario: 
    Anonymous user Verify Location in Job search Page and navigating to job details page then go back to joblisting

    Given I am on Michelpage for Location search as Anonymous user
    Then I navigate to Home Page
    When I enter "Job Title TextBox" on jobsearch page
    When I enter "Location TextBox" on jobsearch page
    And I click on "Search Button" button on jobsearch page
    Then I verify "Search Job Count" on jobsearch page
    Then I verify "Searched JobDetails List" on jobsearch page
    Then I navigate to Home Page
    Then I verify "JobSearch Value" on jobsearch page

  Scenario: 
    Authenticated user Verify job title in Job search Page and navigating to job details page then go back to joblisting

    Given I am on Michelpage for Location search as Authenticate user
    Then I Enter "Username" field on LoginPage
    Then I Enter "Password" field on LoginPage
    And I click on "Login" button on LoginPage
    Then I navigate to Home Page
    When I enter "Job Title TextBox" on jobsearch page
    When I enter "Location TextBox" on jobsearch page
    And I click on "Search Button" button on jobsearch page
    Then I verify "Search Job Count" on jobsearch page
    Then I verify "Searched JobDetails List" on jobsearch page
    Then I navigate to Home Page
    Then I verify "JobSearch Value" on jobsearch page
    And I logout the Application 