Feature: open adacitin hotel page
Scenario Outline: login scenario
Given user navigate to adacitin hotel page
When i enter username as "<username>" and password as "<password>"
And clicks login button 
Then login should be unsuccessful

Examples:
			|username|password|
			|HDeepika|Mine#143|
			|Sunflower|Lotus123|
			