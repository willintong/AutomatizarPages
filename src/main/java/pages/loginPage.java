package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    WebDriver driver;

    public loginPage(WebDriver webDriver){
        this.driver = webDriver;
    }

    public void setUser(String email){
        driver.findElement(By.id("MainContent_txtUserName")).sendKeys(email);
    }

    public void setPassword(String password){
        driver.findElement(By.id("MainContent_txtPassword")).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(By.id("MainContent_btnLogin")).click();
    }

    public void invalidPassword(){
        driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
    }
}
