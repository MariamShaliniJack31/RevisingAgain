@CVFrencJObUpload
Feature: Verify CV is uploaded formats and size.Upload max 3 files for French job and Delete, Verify Spinner

  #D8-203,D8-204,D8-205,D8-206,D8-654,D8-1989
  Scenario: Upload CVs in different Formats and Delete the Uploaded CV for French Lang for Anonymous user
    Given I am on Michelpage for uploading CVs and delete for French as an Anonymous user
    Then I navigate to job details page for French Job
    Then I click on "Apply Job" button on Job details page
    And I verify "Apply with your CV" Message on ApplywithyourCV screen
    And I Click on "Next" button on ApplywithyourCV screen
    And I Click on "Upload CV" button on ApplywithyourCV screen
    #****************************************************#
    # 1.Local Machine(laptop/desktop) source
    #Scenario 1: CV is not in proper format
    # *****************************************************#
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "xlsx" format on ApplywithyourCV screen
    And I verify "INVALID FILEEXTENSION ERROR" Message on ApplywithyourCV screen
    #*****************************************************#
    #Scenario 2: CV is in proper format('txt pdf doc docx')(MULTIPLE CV AT A TIME)
    #*****************************************************#
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "pdf" format on ApplywithyourCV screen
    And I verify "Uploaded File Name" Message on ApplywithyourCV screen
    And I Click on "View CV" button on ApplywithyourCV screen
    And I download CV on ApplywithyourCV screen
    And I verify "Spinner" Message on ApplywithyourCV screen
    And I Click on "Upload CV Again" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "doc" format on ApplywithyourCV screen
    And I Click on "Upload CV Again" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "docx" format on ApplywithyourCV screen
    And I verify "Uploaded File Names" Message on ApplywithyourCV screen
    And I Click on "Delete" button on ApplywithyourCV screen
    And I Click on "Delete" button on ApplywithyourCV screen
    And I Click on "Delete" button on ApplywithyourCV screen
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "txt" format on ApplywithyourCV screen
    And I verify "Uploaded File Name" Message on ApplywithyourCV screen
    And I Click on "Delete" button on ApplywithyourCV screen
    # *****************************************************#
    # The file is exceeding the maximum file size of 5 MB.
    # *****************************************************#
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "resume with max size" format on ApplywithyourCV screen
    And I verify "French job MAX SIZE ERROR" Message on ApplywithyourCV screen

  Scenario: Upload CVs in different Formats and Delete the Uploaded CV for French Lang for Authenticated user
    Given I am on Michelpage for uploading CVs and delete for French as an Authenticated user
    When I Enter "Username" field on LoginPage
    Then I Enter "Password" field on LoginPage
    And I click on "Login" button on LoginPage
    Then I navigate to job details page for French Job
    Then I click on "Apply Job" button on Job details page
    And I verify "Apply with your CV" Message on ApplywithyourCV screen
    And I Click on "Next" button on ApplywithyourCV screen
    And I Click on "Upload CV" button on ApplywithyourCV screen
    # *****************************************************#
    #  1.Local Machine(laptop/desktop) source
    # Scenario 1: CV is not in proper format
    #  *****************************************************#
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "xlsx" format on ApplywithyourCV screen
    And I verify "INVALID FILEEXTENSION ERROR" Message on ApplywithyourCV screen
    # *****************************************************#
    # Scenario 2: CV is in proper format('TXT PDF DOC DOCX')(MUlTIPLE CV AT A TIME)
    # *****************************************************#
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "DOCX" format on ApplywithyourCV screen
    And I verify "Spinner" Message on ApplywithyourCV screen
    And I Click on "Upload CV Again" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "DOC" format on ApplywithyourCV screen
    And I Click on "Upload CV Again" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "PDF" format on ApplywithyourCV screen
    And I verify "Uploaded File Names" Message on ApplywithyourCV screen
    And I Click on "Delete" button on ApplywithyourCV screen
    And I Click on "Delete" button on ApplywithyourCV screen
    And I Click on "Delete" button on ApplywithyourCV screen
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "TXT" format on ApplywithyourCV screen
    And I Click on "Delete" button on ApplywithyourCV screen
    #  *****************************************************#
    #  The file is exceeding the maximum file size of 5 MB.
    #  *****************************************************#
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "resume with max size" format on ApplywithyourCV screen
    And I verify "FRENCH JOB MAX SIZE ERROR" Message on ApplywithyourCV screen
    #And I logout the Application
