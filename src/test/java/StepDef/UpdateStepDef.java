package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.pageObject.RegistrasiPage;
import org.pageObject.UpdatePage;

public class UpdateStepDef {
    private WebDriver webDriver;
    public UpdateStepDef(){
        super();
        this.webDriver=Hooks.webDriver ;
    }
    @And("^no kk have placeholder \"([^\"]*)\"$")
    public void noKkHavePlaceholder(String noKK) {
        RegistrasiPage registrasiPage=new RegistrasiPage(webDriver);
        Assert.assertEquals(noKK, registrasiPage.getNoKK());
    }

    @And("^no NIK have placeholder \"([^\"]*)\"$")
    public void noNIKHavePlaceholder(String noNik) {
        RegistrasiPage registrasiPage=new RegistrasiPage(webDriver);
        Assert.assertEquals(noNik, registrasiPage.getNoNik());
    }

    @Then("^user click edit button$")
    public void userClickEditButton() {
        UpdatePage updatePage = new UpdatePage(webDriver);
        updatePage.clickEdit();

    }

    @And("^user input NIK \"([^\"]*)\"$")
    public void userInputNIK(String nik) throws InterruptedException {
        UpdatePage updatePage = new UpdatePage(webDriver);
        updatePage.setUpdateNik(nik);
    }


    @Then("^user get message jumlah karakter tidak boleh kurang dari enam belas$")
    public void userGetMessageJumlahKarakterTidakBolehKurangDari() {
        UpdatePage updatePage = new UpdatePage(webDriver);
        updatePage.errorDisplayed() ;
    }


    @When("^user edit no KK \"([^\"]*)\"$")
    public void userEditNoKK(String kk) {
        UpdatePage updatePage = new UpdatePage(webDriver);
        updatePage.setUpdateKk(kk);

    }

    @And("^user edit no ktp \"([^\"]*)\"$")
    public void userEditNoKtp(String ktp) {
        UpdatePage updatePage = new UpdatePage(webDriver);
        updatePage.setUpdateNik(ktp);
    }

    @And("^user edit nama \"([^\"]*)\"$")
    public void userEditNama(String nama) {
        UpdatePage updatePage = new UpdatePage(webDriver);
        updatePage.setUpdateNama(nama);
    }

    @And("^user edit alamat \"([^\"]*)\"$")
    public void userEditAlamat(String alamat) {
        UpdatePage updatePage = new UpdatePage(webDriver);
        updatePage.setEditAlamat(alamat);

    }

    @And("^user edit tempat lahir \"([^\"]*)\"$")
    public void userEditTempatLahir(String tempatLahir){
        UpdatePage updatePage = new UpdatePage(webDriver);
        updatePage.setEditTempatLahir(tempatLahir);
    }

    @And("^user edit jenis kelamin perempuan$")
    public void userEditJenisKelaminPerempuan() {
        UpdatePage updatePage = new UpdatePage(webDriver);
        updatePage.setEditPerempuan();

    }

    @And("^user click simpan$")
    public void userClickSimpan() {
        UpdatePage updatePage = new UpdatePage(webDriver);
        updatePage.clickButtonSimpan();
    }


    @Then("^user get message success update$")
    public void userGetMessageSuccessUpdate() {
        UpdatePage updatePage = new UpdatePage(webDriver);
        updatePage.getMessage();
    }

    @Then("^user get message success edit data$")
    public void userGetMessageSuccessEditData() {
        UpdatePage updatePage = new UpdatePage(webDriver);
        updatePage.getMessage();
    }
}
