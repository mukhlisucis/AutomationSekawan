package org.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PencarianPage {
    public static WebDriver driver;

    public PencarianPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath ="//input[@id='table-inputpemilih_dtSearch']" )
    private WebElement fieldSearch ;
    public void setSearch(String search){
        fieldSearch.sendKeys(search);
}
    @FindBy(xpath = "//table[@id='table-inputpemilih']//tr")
    private List<WebElement> tableRows ;
    public void cekTable(){
        String columnFirst = "//table[@id='table-inputpemilih']//tr[" ;
        String columnLast="]//td";
        String column ;
        List<WebElement> tableColumns;
        for (int i =0 ; i<=tableRows.size();i++){
            column = columnFirst+i+columnLast;

            tableColumns=driver.findElements(By.xpath(column)) ;
            for (int j =0; j<tableColumns.size();j++){
                System.out.println(tableColumns.get(j).getText()+"      ");
            }
            System.out.println();
        }
    }
    @FindBy(xpath = "//select[@name='table-inputpemilih_length']")
    private WebElement jumlahDisplay;
    public void selectJumlah(String sortJumlah){
        Select jumlah = new Select(jumlahDisplay);
        jumlah.selectByVisibleText(sortJumlah);

    }


}
