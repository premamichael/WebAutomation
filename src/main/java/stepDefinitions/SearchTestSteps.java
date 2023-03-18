package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.jfr.Timespan;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ProductsPage;
import pageObjects.SearchPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SearchTestSteps extends CommonFunctions {

    SearchPage searchPage=new SearchPage(driver);
    ProductsPage productsPage=new ProductsPage(driver);

    @Given("I am on home page {string} with title {string}")
    public void openHomePage(String url, String expectedTitle)
    {
        driver.get(url);
        driver.findElement(By.id("a-autoid-0")).click();
        searchPage.verifyHomePageLanding(expectedTitle);
    }

    @When("I enter {string}")
    public void enterSearchKeyWord(String search)
    {
        searchPage.enterSearch(search);
    }

    @When("I click search")
    public void clickSearchButton()
    {
        searchPage.clickSearchBtn();
    }

    @Then("I get redirected to products page with title {string}")
    public void verifySearch(String expectedTitle)
    {
        //productsPage.verifyProductsPageLanding(expectedTitle);
        //Assert.assertTrue(driver.findElement(By.xpath("xpath = '//span[.='kids dress']'")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.className("sg-col-inner")).getText().contains(expectedTitle));
    }
}
