package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    public WebDriver driver;
    public ProductsPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[.='kids dress']")
    public WebElement pageTitle;

   public void verifyProductsPageLanding(String expectedTitle)
    {
        //Assert.assertEquals(expectedTitle,pageTitle);
    }
}
