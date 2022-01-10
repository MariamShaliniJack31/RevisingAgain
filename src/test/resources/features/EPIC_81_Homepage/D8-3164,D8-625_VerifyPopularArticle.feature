#Story:D8-3164,D8-625
@VerifyPopularArticle
Feature: Candidate should be able to view Articles and Blocks

Scenario: 
    Anonymous User navigates to Home page and view the latest Articles
    Given I am on Michaelpage for viewing articles as an Anonymous user
    Then I navigate to Home Page
    And I verify "Popular Articles" label on HomePage screen
#    And I click on "Blog Article" button on HomePage screen
#    And I verify "Blog Title" label on HomePage screen
#    And I verify "Blog Author" label on HomePage screen
#    Then I navigate to Home Page
    And I click on "View All link" button on HomePage screen
    And I verify "Explore All categories" label on HomePage screen
    And I verify "Topic" label on HomePage screen
    And I verify "Sub Topic" label on HomePage screen
#    And I verify "Related Articles" label on HomePage screen
    
Scenario:
    Authenticated User navigaltes to Home page and view the latest Articles
    Given I am on Michaelpage for viewing articles as an Authenticated user
    Then I Enter "Username" field on LoginPage
    Then I Enter "Password" field on LoginPage
    And I click on "Login" button on LoginPage
    Then I navigate to Home Page
    And I verify "Popular Articles" label on HomePage screen
#    And I click on "Blog Article" button on HomePage screen
#    And I verify "Blog Title" label on HomePage screen
#    And I verify "Blog Author" label on HomePage screen
#    Then I navigate to Home Page
    And I click on "View All link" button on HomePage screen
    And I verify "Explore All categories" label on HomePage screen
    And I verify "Topic" label on HomePage screen
    And I verify "Sub Topic" label on HomePage screen
#    And I verify "Related Articles" label on HomePage screen
    And I logout the Application