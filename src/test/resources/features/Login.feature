Feature: Login
  @Login
  Scenario: Login valid
    Given user already on landing page "Login APS"
    When user input username "candidat"
    And user input password "password123"
    And user click button Masuk
    Then user redirect on homepage and see "Selamat Datang,"
