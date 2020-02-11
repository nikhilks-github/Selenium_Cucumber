Feature: Login Functionality testing 

	Scenario Outline: Login with multiple sets of test data
	Given User opens the application 
	When User clicks to signin link 
	When User enters "<username>" and "<password>"
	Then User clicks on login 
	Then Demo Web Shop home page should display

    Examples: 
      | username  | password |
      | aravind.guggilla57@gmail.com | aravind |
      | aravindkumarguggilla@gmail.com |Aravind@123|
