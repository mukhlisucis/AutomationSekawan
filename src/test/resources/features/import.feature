Feature: import file excel
  @Import
  Scenario: input with valid data
    Given user already on landing page "Login APS"
    When user input username "candidat"
    And user input password "password123"
    And user click button Masuk
    Then user redirect on homepage and see "Selamat Datang,"
    When user click menu pemilihan tetap
    And user click arrow down
    And user click Import excel
    Then user upload "DataValid.xlsx"
    And user click upload button
    And user click button yes
    And user click button OK

  @Import
  Scenario: input with invalid value data
    Given user already on landing page "Login APS"
    When user input username "candidat"
    And user input password "password123"
    And user click button Masuk
    Then user redirect on homepage and see "Selamat Datang,"
    When user click menu pemilihan tetap
    And user click arrow down
    And user click Import excel
    Then user upload "DataInvalid.xlsx"
    And user click upload button
    And user click button yes
    Then user get message "Error" for upload data
    And user click button OK

  @Import
  Scenario: input with null
    Given user already on landing page "Login APS"
    When user input username "candidat"
    And user input password "password123"
    And user click button Masuk
    Then user redirect on homepage and see "Selamat Datang,"
    When user click menu pemilihan tetap
    And user click arrow down
    And user click Import excel
    And user click upload button
    And user click button yes
    Then user get message "Error" for upload data
    And user click button OK


  @Import
  Scenario Outline: import invalid data
    Given user already on landing page "Login APS"
    When user input username "candidat"
    And user input password "password123"
    And user click button Masuk
    Then user redirect on homepage and see "Selamat Datang,"
    When user click menu pemilihan tetap
    And user click arrow down
    And user click Import excel
    Then user upload "<file>"
    And user click upload button
    And user click button yes
    Then user get message "Error" for upload data
    And user click button OK
    Examples:
      | file         |  |
      | inipdf.pdf   |  |
      | iniword.docx |  |
