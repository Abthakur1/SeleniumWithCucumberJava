Feature: SauceDemo App Test Feature


  Scenario: Login Test
    Given I launch the app with url as "https://www.saucedemo.com/v1/"
    When I enter username in username field
    And I enter password in password field
    And I click on login button
    Then I verify the successful login

  Scenario Outline: Test with Multiple test data

      Given I test with username as <username> and password as <password>

      Examples:
        | username | password |
        | u01      | p01      |
        | u02      | p02      |
        | u03      | p03      |