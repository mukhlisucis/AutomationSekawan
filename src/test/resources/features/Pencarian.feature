Feature: Pencarian
  @Pencarian
  Scenario: search for key Muk
    Given user already on landing page "Login APS"
    When user input username "candidat"
    And user input password "password123"
    And user click button Masuk
    Then user redirect on homepage and see "Selamat Datang,"
    When user click menu pemilihan tetap
    And user display for "100"
    And user search "Muk"
    Then user print all table