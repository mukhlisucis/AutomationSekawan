Feature: Filter
  @Filter
  Scenario: filter by TPS 8 Jangkung
    Given user already on landing page "Login APS"
    When user input username "candidat"
    And user input password "password123"
    And user click button Masuk
    Then user redirect on homepage and see "Selamat Datang,"
    When user click menu pemilihan tetap
    And user click filter button
    Then user choose provinsi "Maluku"
    And user choose kota "Ambon"
    And user choose kecamatan "Manggarai"
    And user choose kelurahan "Jangkung"
    And user choose tps "TPS 8 Jangkung"
    Then user click apply
    And data filtering by "TPS 8 Jangkung"

  @Filter
  Scenario: input onli provinsi
    Given user already on landing page "Login APS"
    When user input username "candidat"
    And user input password "password123"
    And user click button Masuk
    Then user redirect on homepage and see "Selamat Datang,"
    When user click menu pemilihan tetap
    And user click filter button
    Then user choose provinsi "Maluku"
    Then user click apply
    And data filtering by "TPS 8 Jangkung"
