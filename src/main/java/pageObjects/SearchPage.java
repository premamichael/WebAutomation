package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public WebDriver driver;
    public SearchPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement searchTxtFld;

    @FindBy(id="nav-search-submit-button")
    public WebElement searchBtn;

    @FindBy(xpath = "//a[@aria-label='Amazon.co.uk']")
    public WebElement pageTitle;
    public void enterSearch(String search)
    {
        searchTxtFld.sendKeys(search);
    }

    public void clickSearchBtn()
    {
        searchBtn.click();
    }
    public void verifyHomePageLanding(String expectedTitle)
    {
        Assert.assertEquals(expectedTitle,pageTitle.getText());
    }
}
