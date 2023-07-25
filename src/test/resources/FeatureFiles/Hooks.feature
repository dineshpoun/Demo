Feature: To validate the loginn functionality of adacitin application

Scenario: To verify the login with valid username and valid password
Given user has to be in adacitin pages
When user has to fill the usernamee and password
|username|password|
|Sunflower1|lotus1234|
And user needs to click the login buttonn
Then user has to navigate to homepagee

Scenario:
Given To verify the login with invalid username and invalid password
When user has to be in adacitin pageeee
|username|password|
|HDeepika|Mine#143|
And user should to click the login buttonnn
Then user has to navigate to the homepagee