Feature: Registrasi
  @Registrasi
  Scenario: field tambah is enabled
    Given user already on landing page "Login APS"
    When user input username "candidat"
    And user input password "password123"
    And user click button Masuk
    Then user redirect on homepage and see "Selamat Datang,"
    When user click menu pemilihan tetap
    And click button tambah
    Then user on "Form Input Pemilih" page

  @Registrasi
  Scenario: input with valid value
    Given user already on landing page "Login APS"
    When user input username "candidat"
    And user input password "password123"
    And user click button Masuk
    Then user redirect on homepage and see "Selamat Datang,"
    When user click menu pemilihan tetap
    And click button tambah
    Then user on "Form Input Pemilih" page
    Given user input no KK "1111112222333445"
    And user input no NIK "1111112222333445"
    And user input nama "Coba Nama"
    And user choose date of birth
    And user input alamat "jl malang"
    And user input RT "2"
    And user input RW "4"
    And user click kelurahan field
    Then user choose kelurahan name Tasik Malaya
    And user input tempat lahir "Malang"
    And user choose gender male
    And user click status kawin
    Then user choose P-Pernah Kawin
    And user click pilih tps
    Then user choose place Testing TPS
    And user choose status potensi
    And user click simpan button
    Then user success add pemilih and redirect to "Data Pemilih" page
    And data success saving check name "Coba Nama" in table data pemilih

    @Registrasi
    Scenario Outline: invalid no kk
      Given user already on landing page "Login APS"
      When user input username "candidat"
      And user input password "password123"
      And user click button Masuk
      Then user redirect on homepage and see "Selamat Datang,"
      When user click menu pemilihan tetap
      And click button tambah
      Then user on "Form Input Pemilih" page
      Given user input no KK "<nokk>"
      And user input no NIK "<noktp>"
      And user input nama "<nama>"
      And user choose date of birth
      And user input alamat "<alamat>"
      And user input RT "<rt>"
      And user input RW "<rw>"
      And user click kelurahan field
      Then user choose kelurahan name Tasik Malaya
      And user input tempat lahir "<tempatLahir>"
      And user choose gender male
      And user click status kawin
      Then user choose P-Pernah Kawin
      And user click pilih tps
      Then user choose place Testing TPS
      And user choose status potensi
      And user click simpan button
      Then Then user on "Form Input Pemilih" page
      Examples:
        | nokk             | noktp            | nama      | alamat    | rt | rw | tempatLahir |
        |                  | 1111112222333445 | Coba Nama | jl malang | 8  | 2  | malang      |
        | 1234             | 1111112222333445 | Coba Nama | jl malang | 8  | 2  | malang      |
        | 1111112222333asd | 1111112222333445 | Coba Nama | jl malang | 8  | 2  | malang      |
        | 12918!@#asdgsdgf | 1111112222333445 | Coba Nama | jl malang | 8  | 2  | malang      |
        | 1111112222333445 |                  | Coba Nama | jl malang | 8  | 2  | malang      |
        | 1111112222333445 | 11111            | Coba Nama | jl malang | 8  | 2  | malang      |
        | 1111112222333445 | 111asdasd        | Coba Nama | jl malang | 8  | 2  | malang      |
        | 1111112222333445 | 2532111@#!@dfsdf | Coba Nama | jl malang | 8  | 2  | malang      |
        | 1111112222333445 | 1111111222233432 |           | jl malang | 8  | 2  | malang      |
        | 1111112222333445 | 1111111222233432 | asd%@1    | jl malang | 8  | 2  | malang      |
        | 1111112222333445 | 1111111222233432 | Coba Nama |           | 8  | 2  | malang      |
        | 1111112222333445 | 1111111222233432 | Coba Nama | jl malang |    | 2  | malang      |
        | 1111112222333445 | 1111111222233432 | Coba Nama | jl malang | a  | 2  | malang      |
        | 1111112222333445 | 1111111222233432 | Coba Nama | jl malang | 8  |    | malang      |
        | 1111112222333445 | 1111111222233432 | Coba Nama | jl malang | 8  | a  | malang      |
        | 1111112222333445 | 1111111222233432 | Coba Nama | jl malang | 8  | 2  |             |







