Feature: orangehrm Login

  Scenario: verify orangehrm login successfull with valid credentials
    Given Launch orangehrm login page
    When enter username and password
    And Click on login button
    Then orangehrm login should be successfull
