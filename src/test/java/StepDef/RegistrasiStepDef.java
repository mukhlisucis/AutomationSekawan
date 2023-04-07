package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.pageObject.RegistrasiPage;

public class RegistrasiStepDef {
    private WebDriver webDriver;
    public RegistrasiStepDef(){
        super();
        this.webDriver=Hooks.webDriver ;
    }
    @When("^user click menu pemilihan tetap$")
    public void userClickMenuPemilihanTetap() throws InterruptedException {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        registrasiPage.clickPemilihTetap();
        Thread.sleep(3000);
    }

    @And("^click button tambah$")
    public void clickButtonTambah() throws InterruptedException {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        registrasiPage.setClickTambah();
        Thread.sleep(1000);
    }

    @Then("^user on \"([^\"]*)\" page$")
    public void userOnPage(String input) {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        Assert.assertEquals(input, registrasiPage.getJudul());
    }

    @Given("^user input no KK \"([^\"]*)\"$")
    public void userInputNoKK(String nokk) {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        registrasiPage.setNoKK(nokk);

    }

    @And("^user input no NIK \"([^\"]*)\"$")
    public void userInputNoNIK(String nik) {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        registrasiPage.setNik(nik);
    }

    @And("^user input nama \"([^\"]*)\"$")
    public void userInputNama(String nama) {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        registrasiPage.setNama(nama);
    }

    @And("^user input alamat \"([^\"]*)\"$")
    public void userInputAlamat(String alamat) {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        registrasiPage.setAlamat(alamat);
    }

    @And("^user input RT \"([^\"]*)\"$")
    public void userInputRT(String rt) {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        registrasiPage.setRt(rt);
    }

    @And("^user input RW \"([^\"]*)\"$")
    public void userInputRW(String rw) {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        registrasiPage.setRw(rw);
    }


    @And("^user input tempat lahir \"([^\"]*)\"$")
    public void userInputTempatLahir(String tempat) {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        registrasiPage.setTempatLahir(tempat);
    }

    @And("^user choose gender male$")
    public void userChooseGenderMale() throws InterruptedException {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        registrasiPage.setLaki();
    }


    @And("^user click kelurahan field$")
    public void userClickKelurahanField() {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        registrasiPage.setClickKelurahan();


    }

    @Then("^user choose kelurahan name Tasik Malaya$")
    public void userChooseKelurahanName() {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        registrasiPage.chooseKelurahan();
    }

    @And("^user click status kawin$")
    public void userClickStatusKawin() {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        registrasiPage.setStatusKawin();
    }

    @Then("^user choose P-Pernah Kawin$")
    public void userChoosePPernahKawin() {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        registrasiPage.setStatus();
    }

    @And("^user click pilih tps$")
    public void userClickPilihTps() {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        registrasiPage.clickTps();
    }

    @Then("^user choose place Testing TPS$")
    public void userChoosePlaceTestingTPS() {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        registrasiPage.setTps();
    }

    @And("^user choose status potensi$")
    public void userChooseStatusPotensi() {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        registrasiPage.setStatusPotensi();

    }

    @And("^user click simpan button$")
    public void userClickSimpanButton() {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        registrasiPage.setStatusPemilih();
    }


    @And("^user choose date of birth$")
    public void userChooseDateOfBirth() {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        registrasiPage.clickFieldTanggall();
        registrasiPage.setTanggal();


    }

    @Then("^user success add pemilih and redirect to \"([^\"]*)\" page$")
    public void userSuccessAddPemilihAndRedirectToPage(String pemilihPage) {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        Assert.assertEquals(pemilihPage, registrasiPage.getDataPemilihPage());
    }

    @And("^data success saving check name \"([^\"]*)\" in table data pemilih$")
    public void dataSuccessSavingCheckNameInTableDataPemilih(String nama) {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        Assert.assertEquals(nama, registrasiPage.cekNama());
    }



    @Then("^Then user on \"([^\"]*)\" page$")
    public void thenUserOnPage(String inputPage) {
        RegistrasiPage registrasiPage = new RegistrasiPage(webDriver);
        Assert.assertEquals(inputPage, registrasiPage.getInputPemilih());


    }
}
