Feature: demoblaze sign up and login

Background:
Given launch demoblaze website
@smoke
  Scenario: verify user can create account
    When user click on sign up button on navbar
    And user enter username
    And user enter password
    And click on sign up button
    Then demoblaze sign up successfull and should display alert message
@regression
  Scenario: verify demoblaze login using registered username and password
    When user click on login button on navbar
    And enter registred username and password
    And Click on login button
    Then demoblaze login successfull and should display alert message
