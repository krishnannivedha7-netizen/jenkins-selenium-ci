Feature: Automated Login Testing

Scenario: Valid Login
  Given the user navigates to the login page
  When the user enters valid username and password
  Then the user should be redirected to the secure area page

Scenario: Invalid Login
  Given the user navigates to the login page
  When the user enters invalid username and password
  Then an error message "Your username is invalid!" should be displayed

Scenario: Empty Fields Login
  Given the user navigates to the login page
  When the user clicks login without entering credentials
  Then an error message should be displayed

  
Scenario: Invalid Login with multiple data
  Given the user navigates to the login page
  When the user enters username "<username>" and password "<password>"
  Then an error message "<message>" should be displayed

Examples:
  | username       | password        | message                      |
  | wrongusername  | wrongpassword   | Your username is invalid!    |
  | tomsmith       | wrongpassword   | Your password is invalid!    |
  