Feature: Test login functionality and logout functionality

  Background: user is logged in 
    Given browser is open
    When entered credentials <username> and <password> and click on login button
    Then user is navigated to home page 

  Scenario Outline: validate login functionality with various credentials
    When user is on home page
    Then verify the title of the page

    Examples: 
      | username | password |
      #|abcd|admin123|
      | Admin    | admin123 |

  Scenario: validate logout functionality
  When user clicks on welcome link user gets logout link
  When user clicks on logout link and clicks logout
  Then user will be logged out
  
  
     
  
