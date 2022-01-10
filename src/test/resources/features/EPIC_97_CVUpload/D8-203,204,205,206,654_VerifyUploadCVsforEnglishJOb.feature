@CVUploadForEnglishJOb
Feature: Verify CV is uploaded from diffrent sources,formats and size.Upload max 2 files for Eng and Delete, Verify Spinner

  #D8-203,D8-204,D8-205,D8-206,D8-654,D8-1989,D8-239
  Scenario: Upload CVs in different Formats and Delete the Uploaded CV for English Lang for Anonymous user
    Given I am on Michelpage for uploading CVs and delete as an Anonymous user
    Then I navigate to job details page
    Then I click on "Apply Job" button on Job details page
    And I verify "Apply with your CV" Message on ApplywithyourCV screen
    And I Click on "Next" button on ApplywithyourCV screen
    And I Click on "Upload CV" button on ApplywithyourCV screen
    #*****************************************************#
    # 1.Local Machine(laptop/desktop) source
    #Scenario 1: CV is not in proper format
    #*****************************************************#
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "xlsx" format on ApplywithyourCV screen
    And I verify "INVALID FILEEXTENSION ERROR" Message on ApplywithyourCV screen
    #*****************************************************#
    #Scenario 2: CV is in proper format('pdf, doc, TXT')
    #*****************************************************#
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "pdf" format on ApplywithyourCV screen
    And I verify "Spinner" Message on ApplywithyourCV screen
    And I verify "Uploaded File Name" Message on ApplywithyourCV screen
    And I Click on "View CV" button on ApplywithyourCV screen
    And I download CV on ApplywithyourCV screen
    And I Click on "Upload CV Again" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "doc" format on ApplywithyourCV screen
    And I verify "Uploaded File Names" Message on ApplywithyourCV screen
    And I verify "Upload CV" button is not visible on ApplywithyourCV screen
    And I verify "Maximum number of CVs reached" Message on ApplywithyourCV screen
    And I Click on "Delete" button on ApplywithyourCV screen
    And I Click on "Delete" button on ApplywithyourCV screen
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "TXT" format on ApplywithyourCV screen
    And I verify "Uploaded File Name" Message on ApplywithyourCV screen
    And I Click on "Delete" button on ApplywithyourCV screen
    # *****************************************************#
    # The file is exceeding the maximum file size of 5 MB.
    # *****************************************************#
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "resume with max size" format on ApplywithyourCV screen
    And I verify "MAX SIZE ERROR" Message on ApplywithyourCV screen
    #  *****************************************************#
    # 3.Dropbox source
    #Scenario 2: CV is in proper format( 'docx')
    #*****************************************************#
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Dropbox" button on ApplywithyourCV screen
    And I navigate to "Dropbox" Page
    And I Click on "SIGN IN WITH GOOGLE" button on dropbox screen
    And I Enter "email address" field on googleDrive screen
    And I Click on "Email ID Next" button on googleDrive screen
    And I Enter "password" field on googleDrive screen
    And I Click on "password Next" button on googleDrive screen
    And I upload the CV with "docx" format on dropbox screen
    And I verify "Uploaded File Name" Message on ApplywithyourCV screen
    And I Click on "Delete" button on ApplywithyourCV screen
    #*****************************************************#
    # 1.Google Drive source
    #Scenario 1: CV is not in proper format(DOC)
    #*****************************************************#
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Google Drive" button on ApplywithyourCV screen
    And I navigate to "Google Drive" Page
    And I upload the CV with "DOC" format on googleDrive screen
    And I verify "Uploaded File Name" Message on ApplywithyourCV screen
    And I Click on "Delete" button on ApplywithyourCV screen

  Scenario: Upload CVs in different Formats and Delete the Uploaded CV for English Lang for Authenticated user
    Given I am on Michelpage for uploading CVs and delete as an Authenticated user
    When I Enter "Username" field on LoginPage
    Then I Enter "Password" field on LoginPage
    And I click on "Login" button on LoginPage
    Then I navigate to job details page
    Then I click on "Apply Job" button on Job details page
    And I verify "Apply with your CV" Message on ApplywithyourCV screen
    And I Click on "Next" button on ApplywithyourCV screen
    And I Click on "Upload CV" button on ApplywithyourCV screen
    #  *****************************************************#
    #1.Local Machine(laptop/desktop) source
    # Scenario 1: CV is not in proper format
    #*****************************************************#
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "xlsx" format on ApplywithyourCV screen
    And I verify "INVALID FILEEXTENSION ERROR" Message on ApplywithyourCV screen
    # *****************************************************#
    #Scenario 2: CV is in proper format('PDF, txt')
    #*****************************************************#
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "PDF" format on ApplywithyourCV screen
    And I verify "Spinner" Message on ApplywithyourCV screen
    And I verify "Uploaded File Name" Message on ApplywithyourCV screen
    And I Click on "View CV" button on ApplywithyourCV screen
    And I download CV on ApplywithyourCV screen
    And I Click on "Upload CV Again" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "TXT" format on ApplywithyourCV screen
    And I verify "Uploaded File Names" Message on ApplywithyourCV screen
    And I verify "Upload CV" button is not visible on ApplywithyourCV screen
    And I verify "Maximum number of CVs reached" Message on ApplywithyourCV screen
    And I Click on "Delete" button on ApplywithyourCV screen
    And I Click on "Delete" button on ApplywithyourCV screen
    # *****************************************************#
    # The file is exceeding the maximum file size of 5 MB.
    # *****************************************************#
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Browse" button on ApplywithyourCV screen
    And I upload the CV with "resume with max size" format on ApplywithyourCV screen
    And I verify "MAX SIZE ERROR" Message on ApplywithyourCV screen
    #*****************************************************#
    # 3.Dropbox source
    #Scenario 2: CV is in proper format( 'DOCX')
    #*****************************************************#
    And I Click on "Upload CV" button on ApplywithyourCV screen
    And I Click on "Dropbox" button on ApplywithyourCV screen
    And I navigate to "Dropbox" Page
    And I Click on "SIGN IN WITH GOOGLE" button on dropbox screen
    And I Enter "email address" field on googleDrive screen
    And I Click on "Email ID Next" button on googleDrive screen
    And I Enter "password" field on googleDrive screen
    And I Click on "password Next" button on googleDrive screen
    And I upload the CV with "DOCX" format on dropbox screen
    And I verify "Uploaded File Name" Message on ApplywithyourCV screen
    And I Click on "Delete" button on ApplywithyourCV screen
    And I logout the Application
