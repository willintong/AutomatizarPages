package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver webDriver){
        this.driver = webDriver;
    }
    public void clicBotonCrearCuenta(){
        driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[3]/div[2]/div/div[2]/a")).click();
    }

    public void setName(String name){
        driver.findElement(By.id("MainContent_txtFirstName")).sendKeys(name);
    }

    public void setEmail(String email){ driver.findElement(By.id("MainContent_txtEmail")).sendKeys(email);
    }

    public void setPhone(String phone){ driver.findElement(By.id("MainContent_txtHomePhone")).sendKeys(phone);
    }

    public void clickLoginButtonMale() { driver.findElement(By.id("MainContent_Male")).click();
    }
    public void setPassword(String password){ driver.findElement(By.id("MainContent_txtPassword")).sendKeys(password);
    }
    public void verifyPassword(String verifyPassword){ driver.findElement(By.id("MainContent_txtVerifyPassword")).sendKeys(verifyPassword);
    }
    public  void  clicMenuDePises(){ driver.findElement(By.id("MainContent_menuCountry")).click();
    }
    public void seleccionDePais(){ driver.findElement(By.id("MainContent_menuCountry")).click();
    }
    public void clickWeeklyEmail() { driver.findElement(By.id("MainContent_checkWeeklyEmail")).click();
    }
    public void clickBotonSubmit(){ driver.findElement(By.id("MainContent_btnSubmit")).click();
    }
    public void registerSuccesfully(){ driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
    }




}
