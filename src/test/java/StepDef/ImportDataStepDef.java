package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.pageObject.ImportDataPage;

public class ImportDataStepDef {
    private WebDriver webDriver;
    public ImportDataStepDef(){
        super();
        this.webDriver=Hooks.webDriver ;
    }
    @And("^user click arrow down$")
    public void userClickArrowDown() {
        ImportDataPage importDataPage = new ImportDataPage(webDriver);
        importDataPage.clickPanahBawah();

    }

    @And("^user click Import excel$")
    public void userClickImportExcel() {
        ImportDataPage importDataPage = new ImportDataPage(webDriver);
        importDataPage.clickImporExcel();
    }

    @Then("^user upload \"([^\"]*)\"$")
    public void userUpload(String file) throws InterruptedException {
        ImportDataPage importDataPage = new ImportDataPage(webDriver);
        importDataPage.setInputExcel(file);
        Thread.sleep(2000);

    }

    @And("^user click upload button$")
    public void userClickUploadButton() {
        ImportDataPage importDataPage = new ImportDataPage(webDriver);
        importDataPage.clickButtonUpload();
    }

    @And("^user click button yes$")
    public void userClickButtonYes() {
        ImportDataPage importDataPage = new ImportDataPage(webDriver);
        importDataPage.clickButtonYes();
    }



    @And("^user click button OK$")
    public void userClickButtonOK() {
        ImportDataPage importDataPage = new ImportDataPage(webDriver);
        importDataPage.setClickOk();
    }

    @Then("^user get message \"([^\"]*)\" Success for upload data$")
    public void userGetMessageSuccessForUploadData(String pesan) {
        ImportDataPage importDataPage = new ImportDataPage(webDriver);
        Assert.assertEquals(pesan, importDataPage.getSuccessMessage());

    }

    @Then("^user get message \"([^\"]*)\" invalid data failed for upload data$")
    public void userGetMessageInvalidDataFailedForUploadData(String pesan) {
        ImportDataPage importDataPage = new ImportDataPage(webDriver);
        Assert.assertEquals(pesan, importDataPage.getSuccessMessage());
    }

    @Then("^user get message \"([^\"]*)\" failed for upload data$")
    public void userGetMessageFailedForUploadData(String pesan) {
        ImportDataPage importDataPage = new ImportDataPage(webDriver);
        Assert.assertEquals(pesan, importDataPage.getSuccessMessage());
    }

    @Then("^user get message \"([^\"]*)\" for upload data$")
    public void userGetMessageForUploadData(String pesan){
        ImportDataPage importDataPage = new ImportDataPage(webDriver);
        Assert.assertEquals(pesan, importDataPage.getSuccessMessage());
    }

    @Then("^user get message \"([^\"]*)\" error for upload data$")
    public void userGetMessageErrorForUploadData(String pesan) {
        ImportDataPage importDataPage = new ImportDataPage(webDriver);
        Assert.assertEquals(pesan, importDataPage.getSuccessMessage());

    }
}
