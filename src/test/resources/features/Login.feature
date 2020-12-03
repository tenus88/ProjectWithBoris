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

@role
  Scenario Outline: Paramentrized login as <role>
    When user logs in as a "<role>"
    Then user should see "<page_title>" page

    Examples:
      | role          | page_title      |
      | sales manager | Dashboard       |
     # | store manager | Dashboard1      |
      | driver        | Dashboard |