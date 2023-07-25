Feature:  Book hotel

Background: adacitin hetol
Given user is on adacitin hotel page
When enters the username and password
Then navigate to home page

Scenario: selecting location
When select location 
Then validate location

Scenario: Select hotel
When select hotel 
Then validate hotel

Scenario: select room type
When select room
Then  user select room 

Scenario: select no_of_rooms
When select room nos
Then room nos select

Scenario: user select date
When checkin date
Then checkout date

Scenario: user given person detail
When given adults detail
Then given children detail

Scenario: user submit the detail
When user submit the button 
Then navigate the given detail

