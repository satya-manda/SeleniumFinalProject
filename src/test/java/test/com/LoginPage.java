/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author 16039
 */
public class LoginPage {
    
    
    public  LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        
    }
    
  @FindBy(xpath = "//*[@id=\"site-wrapper\"]/header/div[1]/div/div[2]/nav/ul/li[2]/div/div/div/a']")
    private WebElement userName;
  
  @FindBy(xpath="//*[@id=\"login-id\"]")
  private WebElement email;
  
  @FindBy(xpath="//*[@id=\"password\"]")
  private WebElement password;
  
  @FindBy(xpath = "//*[@id=\"loginSubmit\"]")
  private WebElement submittBtn;
  
  public void logIntoAccount(){
      userName.click();
     // Alert alert =  driver.switchTo().alert();
      email.sendKeys("spvanitha@gmail.com");
      password.sendKeys("Mathematics2001$");
      submittBtn.click();
      
      
      
  }
      
  }
  
  
    
    







    

        
