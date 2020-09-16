package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.homePageObject;
import pageobjects.productPageObject;

public class navigatestepdefinitions {

    WebDriver driver;

    homePageObject homePage;
    productPageObject prodPage;

    @Given("I am a visitor")
    public void i_am_a_visitor() {
        // Write code here that turns the phrase above into concrete actions

                System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\27829\\Desktop\\IntelliJ\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.get("https://magento.abox.co.za/index.php/");

        String expectedTitle = "Home Page";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

        driver.manage().window().maximize();

        homePage =
                PageFactory.initElements(driver, homePageObject.class);

        prodPage = PageFactory.initElements(driver, productPageObject.class);

    }

    @When("I navigate to product menu")
    public void i_navigate_to_product_menu() {
        // Write code here that turns the phrase above into concrete actions

          homePage.clickMen();
          prodPage.clickJackets();

    }

    @Then("The view product list page will be displayed")
    public void the_view_product_list_page_will_be_displayed() {
        // Write code here that turns the phrase above into concrete actions

       WebElement body = driver.findElement(By.tagName("Body"));
        String bodyText = body.getText();
      Assert.assertTrue("Does not contains the text 'Jackets'",bodyText.contains("Jackets"));


      //Negative test to ensure "Bags" are not displayed on the selected product list page

        WebElement bodys = driver.findElement(By.tagName("Body"));
        String bodysText = bodys.getText();
        Assert.assertFalse("Contains the text 'Bags'",bodysText.contains("Bags"));

    }

}
