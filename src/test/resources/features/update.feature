Feature: Update pemilih
  @Update
  Scenario: update NIK
    When user input username "candidat"
    And user input password "password123"
    And user click button Masuk
    Then user redirect on homepage and see "Selamat Datang,"
    When user click menu pemilihan tetap
    And user search "Muk"
    Then user click edit button
    And user input NIK "1346795821349856"
    Then user click simpan button
    Then user get message success update

  @Update
  Scenario: update NIK with number less than 16 digits
    When user input username "candidat"
    And user input password "password123"
    And user click button Masuk
    Then user redirect on homepage and see "Selamat Datang,"
    When user click menu pemilihan tetap
    And user search "Muk"
    Then user click edit button
    And user input NIK "13467958856"
    Then user click simpan button
    Then user get message jumlah karakter tidak boleh kurang dari enam belas

  @Update
  Scenario: update data
    When user input username "candidat"
    And user input password "password123"
    And user click button Masuk
    Then user redirect on homepage and see "Selamat Datang,"
    When user click menu pemilihan tetap
    And user search "Muk"
    Then user click edit button
    When user edit no KK "7652134598745632"
    And user edit no ktp "9965135465213568"
    And user edit nama "Coba Edit"
    And user edit alamat "alamat edit"
    And user edit tempat lahir "bandung"
    And user edit jenis kelamin perempuan
    And user click simpan
    Then user get message success edit data





