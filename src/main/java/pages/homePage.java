package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
    WebDriver driver;

    public homePage(WebDriver webDriver){
        this.driver = webDriver;
    }

    public void loggedSuccesfully(){
        driver.findElement(By.id("conf_message")).getText();
    }
}
