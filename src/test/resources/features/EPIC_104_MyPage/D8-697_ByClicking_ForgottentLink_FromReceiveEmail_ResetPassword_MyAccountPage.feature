@ResetPasswordByUsingForgottenLink 
Feature:  User navigates to My Account page then check receive email from inbox as used password recovery link 
#D8-697

Scenario: 
	User navigates to my account page then click forgotten link and check receive email from inbox as used password recovery link  
	Given I am on Michelpage then navigates to forgotten password page 
	Then I click on "LoginOrSignUP" link on HomePage screen 
	Then I click on "Forgotten Link" on Forgotten Password screen 
	Then I verify "Forgotten Password Header" on Forgotten Password screen 
	And I enter "Recovery Email Address" on Forgotten Password screen 
	Then I click on "Send Recovery Link" on Forgotten Password screen 
	#Then I verify "Successfully Sent Email Message" on Forgotten Password screen 
	Then I click on "Return To Login Button" on Forgotten Password screen 
	Then I verify "Login Title" on myAccount page 
	
#Scenario: 
#	Anonymous user navigates on gmail signIn page the check new mail in mailInbox 
#	Given I am on Gmail signIn page then verify mail in mailInbox for new as an Anonymous user 
#	Then I Click on "SignIn Link" button on googleDrive screen 
#	Then I Enter "Gmail Address" field on googleDrive screen 
#	#And I Click on "Gmail Next" button on googleDrive screen
#	When I Enter "Gmail Password" field on googleDrive screen 
#	#And I Click on "Gmail Next" button on googleDrive screen
#	Then I verify "Gmail Title" on on googleDrive screen 
#	And I Click on "Inbox Tab" button on googleDrive screen 
#	And I Click on "Received MailInBox" button on googleDrive screen 
#	Then I verify "MAIL SUBJECT" on on googleDrive screen 
#	And I Click on "Reset Password" button on googleDrive screen 
#	Then I verify "Forgotten Password In Gmail" on on googleDrive screen 
#	Then I Enter "Gmail Address After ResetPassword" field on googleDrive screen 
#	Then I verify "Further Instructions Successfully Message In Gmail" on on googleDrive screen 
	