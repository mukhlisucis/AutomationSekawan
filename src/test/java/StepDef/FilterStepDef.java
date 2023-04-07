package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.pageObject.FilterPage;

public class FilterStepDef {
    private WebDriver webDriver;
    public FilterStepDef(){
        super();
        this.webDriver=Hooks.webDriver ;
    }
    @And("^user click filter button$")
    public void userClickFilterButton() {
        FilterPage filterPage = new FilterPage(webDriver);
        filterPage.setButtonFilter();
    }


    @Then("^user click apply$")
    public void userClickApply() {
        FilterPage filterPage = new FilterPage(webDriver);
        filterPage.clickApply();
    }

    @And("^data filtering by \"([^\"]*)\"$")
    public void dataFilteringBy(String jangkung) {
        FilterPage filterPage = new FilterPage(webDriver);
        filterPage.jangkungDisplayed(jangkung);
    }

    @Then("^user choose provinsi \"([^\"]*)\"$")
    public void userChooseProvinsi(String prov) {
        FilterPage filterPage = new FilterPage(webDriver);
        filterPage.clickProvinsi(prov);

    }

    @And("^user choose kota \"([^\"]*)\"$")
    public void userChooseKota(String kota){
        FilterPage filterPage = new FilterPage(webDriver);
        filterPage.clickKota(kota);
    }

    @And("^user choose kecamatan \"([^\"]*)\"$")
    public void userChooseKecamatan(String kec) {
        FilterPage filterPage = new FilterPage(webDriver);
        filterPage.clickKecamatan(kec);
    }

    @And("^user choose kelurahan \"([^\"]*)\"$")
    public void userChooseKelurahan(String kel){
        FilterPage filterPage = new FilterPage(webDriver);
        filterPage.clickKelurahan(kel);

    }

    @And("^user choose tps \"([^\"]*)\"$")
    public void userChooseTps(String tps) {
        FilterPage filterPage = new FilterPage(webDriver);
        filterPage.clickTps(tps);

    }
}
