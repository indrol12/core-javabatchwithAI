Feature: negative tc for fb login

  Scenario: verify login failed with invalid credential
    Given chrome browser should be invoked
    And fb login page should be visible
    When user enter email "fct@gmail.com" and password "fct123"
    And click on login button of fb
    Then login should be failed when user enter invalid credentials
