package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class homePageObject {

    WebDriver driver;

        public homePageObject(WebDriver driver){

            this.driver = driver;
        }

        public void clickMen(){

            driver.findElement(By.xpath("//span[contains(text(),'Men')]")).click();    //RelXpath selected

    }

}
