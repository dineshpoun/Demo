Feature:  homepage function

Background: user is on logged in
Given user is on hrmhotel page
When enters the username and password
Then navigate to homrpage

Scenario: click admin button
When user clicks admin button
Then admin button gets open

Scenario: click username
When user clicks on user
Then logout page get displayed