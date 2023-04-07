package org.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImportDataPage {
    public static WebDriver driver;

    public ImportDataPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    String pathFile = System.getProperty("user.dir")+"\\src\\test\\resources\\fileUpload\\";
    @FindBy(xpath = "//button[@class='btn btn-sm btn-aps dropdown-toggle dropdown-toggle-split']")
    private WebElement panahBawah;
    public void clickPanahBawah(){
        panahBawah.click();
    }
    @FindBy(xpath = "//a[.='Import Excel']")
    private WebElement importExcel;
    public void clickImporExcel(){
        importExcel.click();
    }
    @FindBy(xpath = "//input[@name='excel_file']")
    private WebElement inputExcel;
    public void setInputExcel(String namaFile){
        inputExcel.sendKeys(pathFile+namaFile);
    }

    @FindBy(xpath = "//button[.='Upload']")
    private WebElement buttonUpload ;
    public void clickButtonUpload(){
        buttonUpload.click();
    }

    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement infoUpload ;
    public boolean getInfoDisplayed(){
        return infoUpload.isDisplayed();
    }
    @FindBy(xpath = "//button[@class='swal2-confirm btn btn-focus btn-success m-btn m-btn--pill m-btn--air swal2-styled']")
    private WebElement buttonYes ;
    public void clickButtonYes(){
        buttonYes.click();
    }
    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement getSuccess;
    public String getSuccessMessage(){
        return getSuccess.getText() ;
    }
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement clickOk;
    public void setClickOk(){
        clickOk.click();
    }
}
