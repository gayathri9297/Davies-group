package pageObjects;

import base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;
import utils.DriverUtils;

public class HomePage
{
    WebDriver driver;



    @FindBy(xpath = "//a[@href='https://twitter.com/Davies_Group']") public WebElement twitterIcon;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/company/daviesgroup/']") public WebElement linkedinIcon;

    @FindBy(linkText = "Solutions") public WebElement solutionsLink;

    @FindBy(linkText = "About") public WebElement aboutLink;

    @FindBy(linkText = "Contact") public WebElement contactLink;
    @FindBy(xpath = "(//a[text()='Locations'])[1]") public WebElement locationsLink;


    public HomePage(WebDriver driver)
    {
       this.driver=driver;
       PageFactory.initElements(driver,this);
    }





   public void clickTwitterIcon()
   {
       JavascriptExecutor jse = (JavascriptExecutor)driver;

       //jse.executeScript("arguments[0].scrollIntoView()", twitterIcon);
       jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
       jse.executeScript("arguments[0].click();",twitterIcon);
      // DriverUtils.click(twitterIcon);
   }

    public void clickLinkedInIcon()
    {
        JavascriptExecutor jse = (JavascriptExecutor)driver;

        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        jse.executeScript("arguments[0].click();",linkedinIcon);
       //DriverUtils.click(linkedinIcon);
    }

    public void clickSolutionsLink()
    {
        DriverUtils.click(solutionsLink);
    }


    public void clickAboutLocations()
    {
        Actions a = new Actions(DriverFactory.driver);
        a.moveToElement(aboutLink).perform();
        JavascriptExecutor jse = (JavascriptExecutor)driver;

        jse.executeScript("arguments[0].scrollIntoView()", locationsLink);
        jse.executeScript("arguments[0].click();",locationsLink);

        //DriverUtils.click(aboutLink);
    }






    public void clickContactLink()
    {
        JavascriptExecutor jse = (JavascriptExecutor)driver;

        jse.executeScript("arguments[0].scrollIntoView()", contactLink);
        jse.executeScript("arguments[0].click();",contactLink);
    }

}
