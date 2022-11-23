package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login_page {

    WebDriver driver;

    By username = By.id("user-name");
    By password = By.id("password");
    By login = By.cssSelector("#login-button");


    public login_page(WebDriver driver) {
        // TODO Auto-generated constructor stub
        this.driver=driver;
    }

    public WebElement usernameField(){
        return driver.findElement(username);
    }

    public WebElement passwordField(){
        return driver.findElement(password);
    }

    public WebElement loginBtn(){
        return driver.findElement(login);
    }

    public void enterUsername (String uname){
        usernameField().sendKeys(uname);
    }

    public void enterPassword(String pwd){
        passwordField().sendKeys(pwd);
    }

    public void clickLogin(){
        loginBtn().click();
    }
}

