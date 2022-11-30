/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author 16039
 */
public class NewArrivalsPage {
    
    
     public  NewArrivalsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        
        
    }
    
    @FindBy(xpath = "//*[@id=\"usmm-tl-cat240003\"]")
    private WebElement newArrival;
    
    @FindBy(xpath = "//*[@id=\"usmm-dd-cat240003\"]/div[1]/div/ul[1]/li[2]/ul/li[2]/a")
    private WebElement mensClothing;
    
    public void selectClothing(){
        newArrival.click();
        mensClothing.click();
        
    }
    
    
    
   
    
    
}
