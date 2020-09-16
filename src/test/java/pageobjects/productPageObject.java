package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class productPageObject {

    WebDriver driver;

      public productPageObject(WebDriver driver) {

          this.driver = driver;
    }

    public void clickJackets(){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   //10 second timeout wait before clicking on "Jackets"

        driver.findElement(By.xpath("//a[contains(text(),'Jackets')]")).click();    //RelXpath selected

    }

}
