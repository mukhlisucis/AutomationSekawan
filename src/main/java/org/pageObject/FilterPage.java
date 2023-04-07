package org.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FilterPage {
    public static WebDriver driver;

    public FilterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//button[@class='btn btn-sm btn-light-aps d-flex justify-content-center']")
    private WebElement buttonFilter;
    public void setButtonFilter(){
        buttonFilter.click();
    }
    @FindBy(xpath = "//select[@class='form-control form-control-sm filter_provinsi_id select2-hidden-accessible']")
    private WebElement provinsi ;
    public void clickProvinsi(String prov){
        Select pilihan = new Select(provinsi) ;
        pilihan.selectByVisibleText(prov);
    }
    @FindBy(xpath = "//select[@class='form-control form-control-sm select2-hidden-accessible']")
    private WebElement kota;
    public void clickKota(String ambon){
        Select kotaPilihan = new Select(kota);
        kotaPilihan.selectByVisibleText(ambon);
    }
    @FindBy(xpath = "//li[@class='select2-results__option select2-results__option--highlighted']")
    private WebElement kotaAmbon;
    public void clickAmbon(){
        kotaAmbon.click();
    }
    @FindBy(xpath = "//div[@class='modal fade show']//select[@id='filter_kecamatan_id']")
    private WebElement kecamatan ;
    public void clickKecamatan(String kec){
        Select pilihanKecamatan = new Select(kecamatan);
        pilihanKecamatan.selectByVisibleText(kec);

    }
    @FindBy(xpath = "//li[@class='select2-results__option select2-results__option--highlighted']")
    private WebElement kecManggarai;
    public void clickManggarai(){
        kecManggarai.click();
    }
    @FindBy(xpath = "//div[@class='modal fade show']//select[@id='filter_kelurahan_id']")
    private WebElement kelurahan ;
    public void clickKelurahan(String kel){
        Select pilihanKelurahan = new Select(kelurahan);
        pilihanKelurahan.selectByVisibleText(kel);

    }
    @FindBy(xpath = "//li[@class='select2-results__option select2-results__option--highlighted']")
    private WebElement jangkung;
    public void clickJangkung(){
        jangkung.click();
    }
    @FindBy(xpath = "//div[@class='modal fade show']//select[@id='filter_tps_id']")
    private WebElement tps ;
    public void clickTps(String getTps){
        Select pilihanTps = new Select(tps);
        pilihanTps.selectByVisibleText(getTps);
    }
    @FindBy(xpath = "//li[@class='select2-results__option select2-results__option--highlighted']")
    private WebElement tpsJangkung;
    public void clickTpsJangkung(){
        tpsJangkung.click();
    }
    @FindBy(xpath = "//div[@class='modal fade show']//button[@class='btn btn-sm btn-aps font-weight-bold']")
    private WebElement apply ;
    public void clickApply(){
        apply.click();
    }
    @FindBy(xpath = "//td[.='TPS 8 Jangkung']")
    private WebElement tabelTps;
    public boolean jangkungDisplayed(String tps){
        return tabelTps.isDisplayed() ;
    }




}
