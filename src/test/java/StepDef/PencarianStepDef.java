package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.pageObject.PencarianPage;

public class PencarianStepDef {
    private WebDriver webDriver;
    public PencarianStepDef(){
        super();
        this.webDriver=Hooks.webDriver ;
    }
    @And("^user search \"([^\"]*)\"$")
    public void userSearch(String search) throws InterruptedException {
        PencarianPage pencarianPage = new PencarianPage(webDriver);
        pencarianPage.setSearch(search);
        Thread.sleep(3000) ;
    }

    @Then("^user print all table$")
    public void userPrintAllTable() {
        PencarianPage pencarianPage = new PencarianPage(webDriver);
        pencarianPage.cekTable();


    }

    @And("^user display for \"([^\"]*)\"$")
    public void userDisplayFor(String jumlah) throws InterruptedException {
        PencarianPage pencarianPage = new PencarianPage(webDriver);
        pencarianPage.selectJumlah(jumlah);
        Thread.sleep(2000);
    }
}
