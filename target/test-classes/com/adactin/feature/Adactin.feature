Feature: Testing Adactin Application from start to end proces

@LoginTest
Scenario Outline:: Verify that the user able to login to the application

Given user launch the application and navigate to login page
When user enters the valid username "<username>" in the username field
And user enters the valid password "<password>" in the password field
And user is able to click the login button
Then Verify that  user goes to homepage and lands on to search hotel

Examples:
|username|password|
|AAA|111|
|BBB|222|
|Venkat16|Mahendran16|

@SearchTest
Scenario: Verify that user able to search hotel

When user able to selects the location
And user able to selects the hotel
And user able to selects the room type
And user able to selects the no of room required
And user enters the check in date
And user enters the check out date
And user able to selects the adults per room
And user able to selects the children per room
And user able to click the search button
Then user verify the search hotel page navigate to select hotel page

@SelectTest
Scenario: verify that user able to select the hotel
When user select the hotel
And  verify user able to click continue button
Then user verify  select hotel page navigate to book a hotel page

Scenario: verify user able to book the hotel

When user verify the hotel name
And user verify the location
And user verify the room type
And user verify the no of rooms
And user verify the total days
And user verify the price per night
And user verify the total price
And user verify the GST
And user verify the final billed price
And user enters firstname in firstname field
And user enters lastname in lastname field
And user enters billing adress in adress field
And user enters valid credit card no in credit card field
And user selects credit card type
And user selects expiry month
And user selects expiry year
And user enters valid cvv number in cvv number field
And verify user able to click book now button
Then user verify book a hotel page navigate to booking confirmation page

Scenario: verify user able to view hotel booking confirmation

When user verify the hotel name
And user verify the location
And user verify the room type
And user verify the arrival date
And user verify the departure date
And user verify the total room
And user verify the adults per room
And user verify the children per room 
And user verify the price per night
And user verify the total price
And user verify the GST
And user verify the final billed price
And user verify the firstname
And user verify the lastname
And user verify the billing adress
And verify user able to click my ltinerary button
Then user verify booking confirmation page navigate to booked ltinerary page

Scenario: verify user able to logout

When verify user has booked hotel
And verify user able to click logout button
Then verify user successfully logout of the application