package org.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrasiPage {
    public static WebDriver driver;

    public RegistrasiPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    //button pemilih tetap
    @FindBy(xpath = "//span[.='Pemilih Tetap']")
    private WebElement pemilihTetap ;
    public void clickPemilihTetap(){
        pemilihTetap.click();
    }

    //Tambah
    @FindBy(xpath = "//button[@class='btn btn-aps font-weight-bolder btn-sm']")
    private WebElement clickTambah ;
    public void setClickTambah(){
        clickTambah.click();
    }

    //nama form
    @FindBy(xpath = "//h3[.='Form Input Pemilih']")
    private WebElement judulForm ;
    public String getJudul(){
        return judulForm.getText();
    }

    // No KK
    @FindBy(xpath = "//input[@id='pemilih_kk']")
    private WebElement noKk ;
    public void setNoKK(String KK){
        noKk.sendKeys(KK);
    }
    public String getNoKK(){
       return noKk.getText();
    }


    // NIK
    @FindBy(xpath = "//input[@id='pemilih_nik']")
    private WebElement noNik ;
    public void setNik(String NIK){
        noNik.sendKeys(NIK);
    }
    public String getNoNik(){
        return noNik.getText();
    }

    //Nama
    @FindBy(xpath = "//input[@id='pemilih_nama']")
    private WebElement namaPemilih ;
    public void setNama(String nama){
        namaPemilih.sendKeys(nama);
    }

    //Alamat
    @FindBy(xpath = "//textarea[@id='pemilih_alamat']")
    private WebElement alamatpemilih ;
    public void setAlamat(String alamat){
        alamatpemilih.sendKeys(alamat);
    }

    //RT
    @FindBy(xpath = "//input[@id='pemilih_rt']")
    private WebElement inputRt;
    public void setRt(String rt){
        inputRt.sendKeys(rt);
    }

    // RW
    @FindBy(xpath = "//input[@id='pemilih_rw']")
    private WebElement inputRw;
    public void setRw(String rw){
        inputRw.sendKeys(rw);
    }

    //Kelurahan
    @FindBy(xpath = "//div[@class='modal fade show']//div[@class='form-group row']/div[contains(.,'- Pilih Provinsi -BagusBaliBaliBengkuluJakartaJawa BaratJawa SelatanJawa TengahJ')]")
    private WebElement kelurahan;
    public void setClickKelurahan() {
        kelurahan.click();
    }
    // nama kelurahan
    @FindBy(xpath = "//li[.='Tasik Malaya']")
    private WebElement namaKelurahan;
    public void chooseKelurahan(){
        namaKelurahan.click();
    }



    //Tempat Lahir
    @FindBy(xpath = "//input[@id='pemilih_tempat_lahir']")
    private WebElement tempatLahir ;
    public void setTempatLahir(String tempat){
        tempatLahir.sendKeys(tempat);
    }

    //Tanggal lahir
    @FindBy(xpath = "//input[@id='pemilih_tgl_lahir']")
    private WebElement tanggalLahir ;
    public void clickFieldTanggall(){
        tanggalLahir.click();
    }
    @FindBy(xpath = "//div[@class='datepicker-days']//th[@class='prev']")
    private WebElement prevDate;
    @FindBy(xpath = "//div[@class='datepicker-days']//tr[2]/td[.='3']")
    private WebElement setTanggal;
    public void setTanggal(){
        setTanggal.click();
    }




    // JK Laki
    @FindBy(xpath = "//div[@class='col-8 col-form-label']//label[1]/span[1]")
    private WebElement lakiLaki ;
    public void setLaki(){
        lakiLaki.click();
    }

    // JK Perempuan
    @FindBy(xpath = "//div[@class='col-8 col-form-label']//label[2]/span[1]")
    private WebElement perempuan ;
    public void setPerempuan(){
        perempuan.click();
    }

    //Stats Kawin
    @FindBy(xpath = "//div[@class='row col-12']//span[@class='selection']/span[contains(.,'- Pilih Status Kawin -')]")
    private WebElement statusKawin ;
    public void setStatusKawin(){
        statusKawin.click();

    }
    @FindBy(xpath = "//li[.='P - Pernah Kawin']")
    private WebElement status;
    public void setStatus(){
        status.click();
    }

    //Nama Caleg
    @FindBy(xpath = "//div[@class='row col-12']//span[@class='selection']/span[.='- Pilih Caleg -']")
    private WebElement namaCaleg ;
    public void clickNamaCaleg(){
        namaCaleg.click();
    }
    @FindBy(xpath = "//li[@class='select2-results__option select2-results__option--highlighted']")
    private WebElement chooseCaleg;
    public void setNamaCaleg(){
        chooseCaleg.click();
    }

    //TPS
    @FindBy(xpath = "//div[@class='row col-12']/div[2]/div[6]/div[@class='col-lg-8']")
    private WebElement tempatTps;
    public void clickTps(){
        tempatTps.click();
    }
    @FindBy(xpath = "//li[@class='select2-results__option select2-results__option--highlighted']")
    private WebElement chooseTps;
    public void setTps(){
        chooseTps.click();
    }

    // Status Potensi
    @FindBy(xpath = "//div[@id='Statusradio']/label[1]/span[1]")
    private WebElement statusPotensi ;
    public void setStatusPotensi(){
        statusPotensi.click();
    }

    // Status pemilih
    @FindBy(xpath = "//div[@id='Statusradio']/label[2]/span[1]")
    private WebElement statusPemilih ;
    public void setStatusPemilih(){
        statusPemilih.click();
    }
    //simpan button
    @FindBy(xpath = "//button[@id='btn-simpan']")
    private WebElement clickSimpan;
    public void setClickSimpan(){
        clickSimpan.click();
    }
    //pemilih tetap page
    @FindBy(xpath = "//h3[.='Data Pemilih']")
    private WebElement pemilihPage;
    public String getDataPemilihPage(){
        return pemilihPage.getText();
    }
    @FindBy(xpath = "//td[.='Coba Nama']")
    private WebElement checkNama;
    public String cekNama(){
       return checkNama.getText();
    }
    @FindBy(xpath = "//h3[.='Form Input Pemilih']")
    private WebElement inputPemilih;
    public String getInputPemilih(){
        return inputPemilih.getText();
    }

}
