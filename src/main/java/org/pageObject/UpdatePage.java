package org.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdatePage {
    public static WebDriver driver;

    public UpdatePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//table[@id='table-inputpemilih']//tr[1]//a[2]")
    private WebElement buttonEdit;
    public void clickEdit(){
    buttonEdit.click();
     }
     @FindBy(xpath = "//input[@id='pemilih_nik']")
    private WebElement updateNik ;
    public void setUpdateNik(String Nik){
        updateNik.sendKeys(Nik);
    }
    @FindBy(xpath ="//div[@id='error_nik']" )
    private WebElement errorMessage ;
    public boolean errorDisplayed(){
        errorMessage.isDisplayed();
        return true ;
    }
    @FindBy(xpath = "//input[@id='pemilih_kk']")
    private WebElement updateKk ;
    public void setUpdateKk(String nik){
        updateNik.sendKeys(nik);
    }
    @FindBy(xpath = "//input[@id='pemilih_nama']")
    private WebElement editNama ;
    public void setUpdateNama(String nama){
        editNama.sendKeys(nama);
    }
    @FindBy(xpath = "//textarea[@id='pemilih_alamat']")
    private WebElement editAlamat;
    public void setEditAlamat(String alamat){
        editAlamat.sendKeys(alamat);
    }

    @FindBy(xpath = "//input[@id='pemilih_tempat_lahir']" )
    private WebElement editTempatLahir;
    public void setEditTempatLahir(String tempatLahir){
        editTempatLahir.sendKeys(tempatLahir);
    }

    @FindBy(xpath = "//div[@class='col-8 col-form-label']//label[2]/span[1]")
    private WebElement editPerempuan;
    public void setEditPerempuan(){
        editPerempuan.click();
    }
    @FindBy(xpath = "//button[@id='btn-simpan']")
    private WebElement buttonSimpan ;
    public void clickButtonSimpan(){
        buttonSimpan.click();
    }
    @FindBy(xpath = "xpathmessage")
    private WebElement message;
    public boolean getMessage(){
        return message.isDisplayed();
    }

}
