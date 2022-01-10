#Story:D8-1119,D8-288,D8-290,D8-291,D8-312,D8-313
@VerifyJobSearch
Feature: Verify that candidate searching for Jobs from job result page.

Scenario: 
    Anonymous User navigates to Home page and Search for jobs from the job result page
    Given I am on Michelpage for search Jobs from Job result page as an Anonymous user
    Then I navigate to Home Page
#    And I verify "Browse by industry" on jobsearch page
#    And I verify "Browse by job function" on jobsearch page
#    And I verify "Browse by location" on jobsearch page
#    And I verify "Browse by job title" on jobsearch page
    When I enter "Job Title TextBox" on jobsearch page
#    And I enter "Location" on jobsearch page
    And I select "Salary Min" on jobsearch page
    And I select "Salary Max" on jobsearch page
    And I click on "Search Button" button on jobsearch page
    And I click on "Search field bar" button on jobsearch page
    And I click on "Cancel" button on jobsearch page
    Then I verify "First Job Title" on jobsearch page
    Then I navigate to job details page
    And I click on "Job Search" button on jobsearch page
#    And I click on "Search Button" button on jobsearch page
#    And I click on "Search field bar" button on jobsearch page
#    And I verify "Job Title Error" on jobsearch page
    When I enter "Job Title TextBox" on jobsearch page
#    And I enter "Location" on jobsearch page
    And I click on "Search Button" button on jobsearch page
    Then I verify "First Job Title" on jobsearch page
    
Scenario:
    Authenticated User navigates to Home page and Search for jobs from the job result page
    Given I am on Michelpage for search Jobs from Job result page as an Authenticated user
    Then I Enter "Username" field on LoginPage
    Then I Enter "Password" field on LoginPage
    And I click on "Login" button on LoginPage
    Then I navigate to Home Page
#    And I verify "Browse by industry" on jobsearch page
#    And I verify "Browse by job function" on jobsearch page
#    And I verify "Browse by location" on jobsearch page
#    And I verify "Browse by job title" on jobsearch page
    When I enter "Job Title TextBox" on jobsearch page
#    And I enter "Location" on jobsearch page
    And I select "Salary Min" on jobsearch page
    And I select "Salary Max" on jobsearch page
    And I click on "Search Button" button on jobsearch page
    And I click on "Search field bar" button on jobsearch page
    And I click on "Cancel" button on jobsearch page
    Then I verify "First Job Title" on jobsearch page
    Then I navigate to job details page
    And I click on "Job Search" button on jobsearch page
#    And I click on "Search Button" button on jobsearch page
#    And I click on "Search field bar" button on jobsearch page
#    And I verify "Job Title Error" on jobsearch page
    When I enter "Job Title TextBox" on jobsearch page
#    And I enter "Location" on jobsearch page
    And I click on "Search Button" button on jobsearch page
    Then I verify "First Job Title" on jobsearch page
    And I logout the Application