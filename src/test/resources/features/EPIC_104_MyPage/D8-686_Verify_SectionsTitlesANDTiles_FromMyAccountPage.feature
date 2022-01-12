#D8-686
@VerifyAllTitlesFromSectionNSubSection 
Feature: Verify all the titles from sections and sub sections on my account dashboard page 

Scenario: 
	Authenticated User navigates from michael page to my Account dashboard page then verify all the titles from sections and sub sections 
	Given I am on Michelpage then navigating to my Account dashboard page then verify all the titles 
	Then I click on "LoginOrSignUP" link on HomePage screen 
	Then I verify "Login Title My Account Page" Message on HomePage 
	Then I Enter "Username" field on LoginPage 
	Then I Enter "Password" field on LoginPage 
	And I click on "Login Button" button on LoginPage 
	Then I verify "My Account Page Header" Message on HomePage 
	Then I verify "Section Titles Of MyAccount Dashboard" Message on HomePage 
	Then I verify "Sub Section Titles Of MyAccount Dashboard" Message on HomePage