#Story:D8-467
@PrepopulatedDatainApplyCVPage
Feature: If the candidate is authenticated, then the details listed in the AC, 
	need to be pre-populated with the information they have stored against their account. 

Scenario: 
	Authenticate user navigates to Apply with your CV Page and verify the pre-populated data. 
	Given I am on Michelpage to verify the pre-populated data as an Authenticated user
	When  I Enter "Username" field on LoginPage 
	Then  I Enter "Password" field on LoginPage 
	And  I click on "Login" button on LoginPage 
	Then I navigate to job details page 
	Then I click on "Apply Job" button on Job details page 
	Then I verify "How would you like to apply?" Message on ApplywithyourCV screen 
	And I verify "Apply with your CV" Message on ApplywithyourCV screen 
	And I Click on "Next" button on ApplywithyourCV screen 	
    Then I verify "Check Email Address" field pre-pouplated on ApplywithyourCV screen
    Then I verify "Check First Name" field pre-pouplated on ApplywithyourCV screen
    Then I verify "Check Last Name" field pre-pouplated on ApplywithyourCV screen
	And I logout the Application
	
	