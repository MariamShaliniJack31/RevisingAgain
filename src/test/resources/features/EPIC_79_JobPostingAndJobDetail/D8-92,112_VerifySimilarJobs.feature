@ViewAndsaveSimilarJobs
Feature: View more jobs, save and view similar jobs in job-detail pages

  #D8-92,#D8-112
  Scenario: Anonymous user View more jobs, save similar job, view similar job in job-detail pages
    Given I am on Michelpage for View more jobs, save and view similar jobs as an Anonymous user
    Then I navigate to similar job details page
    # Acceptance Criteria: SCENARIO 1: See similar jobs
    Then I verify "Similar Jobs" block displayed in job-detail pages
    Then I verify "Only 3 Similar Jobs" are displayed at a time in job-detail pages
    And I verify "Similar Jobs title" in job-detail pages
    And I verify "Similar Jobs contract type" in job-detail pages
    And I verify "Similar Jobs salary" in job-detail pages
    #Acceptance Criteria: SCENARIO 2: Save similar job
    Then I click on "Similar Jobs Save Job Icon for AnonUser" in job-detail pages
    # Acceptance Criteria:Scenario 4: Pagenation
    Then I click on "Next page Arrow Button" in job-detail pages
    Then I verify "Only 3 Similar Jobs" are displayed at a time in job-detail pages
    And I verify "Similar Jobs title" in job-detail pages
    #Acceptance Criteria: Scenario 3: Click on the Job and View similar jobs
    Then I click on "Similar Jobs title" in job-detail pages
    And I verify "Job Title in Header" in job-detail pages
    Then I verify "Only 3 Similar Jobs" are displayed at a time in job-detail pages
    And I verify "Similar Jobs title" in job-detail pages
    # Acceptance Criteria:Scenario 4: Pagenation
    Then I click on "Page 2 Button" in job-detail pages
    Then I verify "Only 3 Similar Jobs" are displayed at a time in job-detail pages
    And I verify "Similar Jobs title" in job-detail pages
    Then I click on "Previous page Arrow Button" in job-detail pages
    Then I verify "Only 3 Similar Jobs" are displayed at a time in job-detail pages
    And I verify "Similar Jobs title" in job-detail pages
    Then I click on "Page 3 Button" in job-detail pages
    Then I verify "Only 3 Similar Jobs" are displayed at a time in job-detail pages
    And I verify "Similar Jobs title" in job-detail pages
    Then I click on "Page 1 Button" in job-detail pages
    Then I verify "Only 1 Similar Jobs" are displayed at a time in job-detail pages
    And I verify "Similar Jobs title" in job-detail pages

  Scenario: Authenticated user saves View more jobs, save similar job, view similar job in job-detail pages
    Given I am on Michelpage for View more jobs, save and view similar jobs as an Authenticated user
    Then I Enter "Username" field on LoginPage
    Then I Enter "Password" field on LoginPage
    And I click on "Login" button on LoginPage
    Then I navigate to similar job details page
    #Acceptance Criteria: SCENARIO 1: See similar jobs
    Then I verify "Similar Jobs" block displayed in job-detail pages
    Then I verify "Only 3 Similar Jobs" are displayed at a time in job-detail pages
    And I verify "Similar Jobs title" in job-detail pages
    And I verify "Similar Jobs contract type" in job-detail pages
    And I verify "Similar Jobs salary" in job-detail pages
    #Acceptance Criteria: SCENARIO 2: Save similar job
    Then I click on "Similar Jobs Save Job Icon for AuthUser" in job-detail pages
    # Acceptance Criteria:Scenario 4: Pagenation
    Then I click on "Next page Arrow Button" in job-detail pages
    Then I verify "Only 3 Similar Jobs" are displayed at a time in job-detail pages
    And I verify "Similar Jobs title" in job-detail pages
    #Acceptance Criteria: Scenario 3: Click on the Job and View similar jobs
    Then I click on "Similar Jobs title" in job-detail pages
    And I verify "Job Title in Header" in job-detail pages
    Then I verify "Only 3 Similar Jobs" are displayed at a time in job-detail pages
    And I verify "Similar Jobs title" in job-detail pages
    # Acceptance Criteria:Scenario 4: Pagenation
    Then I click on "Page 2 Button" in job-detail pages
    Then I verify "Only 3 Similar Jobs" are displayed at a time in job-detail pages
    And I verify "Similar Jobs title" in job-detail pages
    Then I click on "Previous page Arrow Button" in job-detail pages
    Then I verify "Only 3 Similar Jobs" are displayed at a time in job-detail pages
    And I verify "Similar Jobs title" in job-detail pages
    Then I click on "Page 3 Button" in job-detail pages
    Then I verify "Only 3 Similar Jobs" are displayed at a time in job-detail pages
    And I verify "Similar Jobs title" in job-detail pages
    Then I click on "Page 1 Button" in job-detail pages
    Then I verify "Only 1 Similar Jobs" are displayed at a time in job-detail pages
    And I verify "Similar Jobs title" in job-detail pages
    And I logout the Application
