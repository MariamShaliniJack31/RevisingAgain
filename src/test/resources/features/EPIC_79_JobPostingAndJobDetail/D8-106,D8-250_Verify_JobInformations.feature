@JobInformation
Feature: Verify Full Job Information

  #D8-106,D8-250
  Scenario: Anonymous user Verify full job information in Job details Page
    Given I am on Michelpage as an Anonymous user to Verify full job information
    Then I navigate to LOGO job details page
    #Header Section
    Then I verify "Back to search link" is displyed in job details page
    And I verify "Job Title" is displyed in job details page
    And I verify "Location" is displyed in job details page
    And I verify "Job type" is displyed in job details page
    And I verify "Salary min and max" is displyed in job details page
    #About our Client
    And I verify "Bullet Points" is displyed in job details page
    And I verify "About our Client" is displyed in job details page
    And I verify "About our Client Value" is displyed in job details page
    And I verify "Job description" is displyed in job details page
    And I verify "Job description Value" is displyed in job details page
    And I verify "The successful Applicant" is displyed in job details page
    And I verify "The successful Applicant Value" is displyed in job details page
    And I verify "Whats on offer" is displyed in job details page
    And I verify "Whats on offer Value" is displyed in job details page
    And I verify "Contact" is displyed in job details page
    And I verify "Contact Value" is displyed in job details page
    And I verify "Quote job ref" is displyed in job details page
    And I verify "Quote job ref Value" is displyed in job details page
    And I verify "Phone" is displyed in job details page
    And I verify "Phone Value" is displyed in job details page
    #Summary section
    And I verify "Summary section" is displyed in job details page
    And I verify "Sector" is displyed in job details page
    And I verify "Sector Value" is displyed in job details page
    And I verify "Subsector" is displyed in job details page
    And I verify "Subsector Value" is displyed in job details page
    And I verify "Industry" is displyed in job details page
    And I verify "Industry Value" is displyed in job details page
    And I verify "Consultant name" is displyed in job details page
    And I verify "Consultant name Value" is displyed in job details page
    And I verify "Phone number" is displyed in job details page
    And I verify "Phone number Value" is displyed in job details page
    And I verify "Experience" is displyed in job details page
    And I verify "Experience value" is displyed in job details page
    And I verify "Job Reference" is displyed in job details page
    And I verify "Job Reference Value" is displyed in job details page
    And I verify "Contract Duration" is displyed in job details page
    And I verify "Contract Duration Value" is displyed in job details page
    And I verify "Company Type" is displyed in job details page
    And I verify "Company Type Value" is displyed in job details page
    #Buttons
    And I verify "Save Job" is displyed in job details page
    And I verify "Email Job button" is displyed in job details page
    And I verify "Apply job button" is displyed in job details page

  Scenario: Authenticated user Verify full job information in Job details Page
    Given I am on Michelpage to verify the job information
    When I Enter "Username" field on LoginPage
    Then I Enter "Password" field on LoginPage
    And I click on "Login" button on LoginPage
    Then I navigate to LOGO job details page
    #Header Section
    Then I verify "Back to search link" is displyed in job details page
    And I verify "Job Title" is displyed in job details page
    And I verify "Location" is displyed in job details page
    And I verify "Job type" is displyed in job details page
    And I verify "Salary min and max" is displyed in job details page
    #About our Client
    And I verify "Bullet Points" is displyed in job details page
    And I verify "About our Client" is displyed in job details page
    And I verify "About our Client Value" is displyed in job details page
    And I verify "Job description" is displyed in job details page
    And I verify "Job description Value" is displyed in job details page
    And I verify "The successful Applicant" is displyed in job details page
    And I verify "The successful Applicant Value" is displyed in job details page
    And I verify "Whats on offer" is displyed in job details page
    And I verify "Whats on offer Value" is displyed in job details page
    And I verify "Contact" is displyed in job details page
    And I verify "Contact Value" is displyed in job details page
    And I verify "Quote job ref" is displyed in job details page
    And I verify "Quote job ref Value" is displyed in job details page
    And I verify "Phone" is displyed in job details page
    And I verify "Phone Value" is displyed in job details page
    #Summary section
    And I verify "Summary section" is displyed in job details page
    And I verify "Sector" is displyed in job details page
    And I verify "Sector Value" is displyed in job details page
    And I verify "Subsector" is displyed in job details page
    And I verify "Subsector Value" is displyed in job details page
    And I verify "Industry" is displyed in job details page
    And I verify "Industry Value" is displyed in job details page
    And I verify "Consultant name" is displyed in job details page
    And I verify "Consultant name Value" is displyed in job details page
    And I verify "Phone number" is displyed in job details page
    And I verify "Phone number Value" is displyed in job details page
    And I verify "Experience" is displyed in job details page
    And I verify "Experience value" is displyed in job details page
    And I verify "Job Reference" is displyed in job details page
    And I verify "Job Reference Value" is displyed in job details page
    And I verify "Contract Duration" is displyed in job details page
    And I verify "Contract Duration Value" is displyed in job details page
    And I verify "Company Type" is displyed in job details page
    And I verify "Company Type Value" is displyed in job details page
    #Buttons
    And I verify "Save Job button" is displyed in job details page
    And I verify "Email Job button" is displyed in job details page
    And I verify "Apply job button" is displyed in job details page
    And I logout the Application
