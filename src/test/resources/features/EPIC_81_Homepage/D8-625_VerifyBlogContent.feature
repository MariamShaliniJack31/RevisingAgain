#Story:D8-625
@VerifyBlogContent
Feature: Candidate should be able to view Articles and Blocks

Scenario: 
    Anonymous User navigates to Home page and view the latest Articles
    Given I am on Michaelpage for viewing articles as an Anonymous user
    Then I navigate to Home Page
    And I verify "Latest Articles" label on HomePage screen
    And I click on "Blog Article" button on HomePage screen
    And I verify "Blog Title" label on HomePage screen
    And I verify "Blog Author" label on HomePage screen
    
Scenario:
    Authenticated User navigates to Home page and view the latest Articles
    Given I am on Michaelpage for viewing articles as an Authenticated user
    Then I Enter "Username" field on LoginPage
    Then I Enter "Password" field on LoginPage
    And I click on "Login" button on LoginPage
    Then I navigate to Home Page
    And I verify "Latest Articles" label on HomePage screen
    And I click on "Blog Article" button on HomePage screen
    And I verify "Blog Title" label on HomePage screen
    And I verify "Blog Author" label on HomePage screen
    And I logout the Application