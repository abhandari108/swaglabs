package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class products_page {

    WebDriver driver;

    //By

    public products_page(WebDriver driver) {
        this.driver = driver;
    }


        public void validate_page(){
        String pageTitle = driver.getTitle();

        if (!pageTitle.equals("Products")) {
            throw new IllegalStateException("This is not the Products page. The current page is "
            + driver.getCurrentUrl());

        }





//    public WebElement usernamefield(){
//        return driver.findElement(username);
//    }


    }
}

