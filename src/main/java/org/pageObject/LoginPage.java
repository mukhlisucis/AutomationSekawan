package org.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//input[@id='username']")
    private WebElement username ;
    public void inputUsername(String user){
        username.sendKeys(user);
    }
    @FindBy(xpath = "//input[@id='password']")
    private WebElement password ;
    public void inputPassword(String pass){
        password.sendKeys(pass);
    }
    @FindBy(xpath = "//button[@id='kt_login_signin_submit']")
    private WebElement buttonSubmit ;
    public void clickSubmit(){
        buttonSubmit.click();
    }
    @FindBy(xpath = "//span[@class='text-muted font-weight-bold font-size-base d-none d-md-inline mr-1']")
    private WebElement selamatDatang;
    public String pesanSelamat(){
        return selamatDatang.getText() ;
    }

    @FindBy(xpath = "//h3[@class='font-weight-bolder text-dark']")
    private WebElement loginPage;
    public String getLogin(){
       return loginPage.getText();
    }




}
