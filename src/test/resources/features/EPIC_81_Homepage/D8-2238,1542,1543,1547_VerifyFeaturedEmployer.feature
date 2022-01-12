#Story:D8-2238,1542,1543,1547
@VerifyFeaturedEmployer
Feature: Verify that candidate should be able to view Featured Employers and Clients

Scenario: 
    Anonymous User navigates to Home page and view Featured Employers and Clients
    Given I am on Michaelpage for viewing Featured Employers and Clients as an Anonymous user
    Then I navigate to Home Page
    And I verify "Featured Employer" label on HomePage screen
    And I verify "All Featured Employers" image on HomePage screen
    And I click on "View All" button on HomePage screen
    Then I navigate to Home Page
    And I verify "Employer Image" image on HomePage screen
    And I click on "Featured Employer Image" button on HomePage screen
    And I verify "Breadcrumb" label on HomePage screen
    And I verify "Featured Client" label on HomePage screen
    
Scenario:
     Authenticated User navigates to Home page and view Featured Employers and Clients
    Given I am on Michaelpage for viewing Featured Employers and Clients as an Authenticated user
    Then I Enter "Username" field on LoginPage
    Then I Enter "Password" field on LoginPage
    And I click on "Login" button on LoginPage
    Then I navigate to Home Page
    And I verify "Featured Employer" label on HomePage screen
    And I verify "All Featured Employers" image on HomePage screen
    And I click on "View All" button on HomePage screen
    Then I navigate to Home Page
    And I verify "Employer Image" image on HomePage screen
    And I click on "Featured Employer Image" button on HomePage screen
    And I verify "Auth Breadcrumb" label on HomePage screen
    And I verify "Featured Client" label on HomePage screen
    And I logout the Application