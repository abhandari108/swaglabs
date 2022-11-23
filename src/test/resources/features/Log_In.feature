Feature: Log into the website

  Scenario: User is able to login to the swaglabs website successfully
    Given I navigate to the url 'https://www.saucedemo.com/'
    And I enter a valid username 'standard_user'
    And I enter a valid password 'secret_sauce'
    When I click the login button
    Then I am successfully logged into the swag labs website