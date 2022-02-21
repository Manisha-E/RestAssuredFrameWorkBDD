Feature: feature  login
API Url = https://reqres.in/api/login

  Scenario: Login to the url
    Given user is on login page
    When user enters username and password
    Then successful login
    