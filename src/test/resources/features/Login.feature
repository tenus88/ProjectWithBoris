Feature:
  As a user I should be able to login to the Vy_Truck main page

  Background:
    Given valid url


  @login
    Scenario:
  When I user enters valid credentials
  Then user should be able to get main page



  @wrong_login
  Scenario: Invalid password
    When user logs in with wrong password
    Then user verifies that he used wrong credentials and get message is displayed



