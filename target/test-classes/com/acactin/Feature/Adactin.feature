Feature: Testing Adactin application end to end process




Scenario: User is already on login page


Given User is already on login page
When Title of login page is Adactin.com - Hotel Reservation System
Then User enters "mdcunha1" and "Canada2025"
Then user clicks on login button
And User is on home page

#Scenario Outline: User is already on login page
#
#
#Given User is already on login page
#
#When Title of login page is Adactin.com - Hotel Reservation System
#
#Then User enters "<username>" and "<password>"
#
#Then user clicks on login button
#
#And User is on home page
#
#Examples:
#
#|username|password|
#|AAA|111|
#|BBB|222|
#|mdcunha1|Canada2025|




Scenario: Searching the Hotel

When User  selects the hotel  location, hotel name and room type

Then : User selcts the number of rooms and other informtion

And :User clicks on search button


Scenario: Selection of the Hotel

When  User selects the Price and Type of Room

And  User clicks on Continue button 

Scenario: User is on Book A hotel page

When User Enters his first name , Last name and Address

Then User Enters Credit Card information

And User selects Click now button

Scenario: User is on Booking confirmation page 

When User takes a screenshot

Then User Logs out of the application

And User quits the browser



