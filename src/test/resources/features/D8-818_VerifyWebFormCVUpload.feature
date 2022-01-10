#Story-D8-818
@CVUploadWebForm 
Feature: Verify CV upload validation on WebForm Page 

Scenario: Anonymous user Verify CV upload validation on WebForm Page 
	Given I am on Michelpage to Verify CV upload validation on WebForm Page as an Anonymous user
	When I navigate to WebForm page 
	And I Click on "Browse" button on WebForm Page 
	And I upload the CV with "docx" format on WebForm Page 
	And I verify "invalid fileextension error" Message on WebForm Page 
	And I Click on "Browse" button on WebForm Page 
	And I upload the CV with "xlsx" format on WebForm Page 
	And I verify "invalid fileextension error" Message on WebForm Page 
	And I Click on "Browse" button on WebForm Page 
	And I upload the CV with "txt" format on WebForm Page 
	And I verify "invalid fileextension error" Message on WebForm Page 
	And I Click on "Browse" button on WebForm Page 
	And I upload the CV with "doc" format on WebForm Page 
	And I verify "invalid fileextension error" Message on WebForm Page 
	And I Click on "Browse" button on WebForm Page 
	And I upload the CV with "pdf With Max Size" format on WebForm Page 
	And I verify "invalid fileextension error" Message on WebForm Page 
	And I Click on "Browse" button on WebForm Page 
	And I upload the CV with "pdf" format on WebForm Page 
	And I verify "uploaded file name" Message on WebForm Page 
	And I Click on "Submit" button on WebForm Page 
	Then I accept alert
	And I verify "success" Message on WebForm Page 
	
Scenario: Authenticated user Verify CV upload validation on WebForm Page 
	Given I am on Michelpage to Verify CV upload validation on WebForm Page as an Authenticated user 
	When I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login" button on LoginPage 
	When I navigate to WebForm page 
	And I Click on "Browse" button on WebForm Page 
	And I upload the CV with "docx" format on WebForm Page 
	And I verify "invalid fileextension error" Message on WebForm Page 
	And I Click on "Browse" button on WebForm Page 
	And I upload the CV with "xlsx" format on WebForm Page 
	And I verify "invalid fileextension error" Message on WebForm Page 
	And I Click on "Browse" button on WebForm Page 
	And I upload the CV with "txt" format on WebForm Page 
	And I verify "invalid fileextension error" Message on WebForm Page 
	And I Click on "Browse" button on WebForm Page 
	And I upload the CV with "doc" format on WebForm Page 
	And I verify "invalid fileextension error" Message on WebForm Page 
	And I Click on "Browse" button on WebForm Page 
	And I upload the CV with "pdf With Max Size" format on WebForm Page 
	And I verify "invalid fileextension error" Message on WebForm Page 
	And I Click on "Browse" button on WebForm Page 
	And I upload the CV with "pdf" format on WebForm Page 
	And I verify "uploaded file name" Message on WebForm Page 
	And I Click on "Submit" button on WebForm Page 
	Then I accept alert
	And I verify "success" Message on WebForm Page 
	
	
	
