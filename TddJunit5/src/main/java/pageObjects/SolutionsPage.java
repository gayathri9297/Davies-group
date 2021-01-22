package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;
import utils.DriverUtils;

public class SolutionsPage
{
    WebDriver driver;



    @FindBy(className = "view-all__circle") public WebElement viewAllButton;




    public SolutionsPage(WebDriver driver)
    {
       this.driver=driver;
       PageFactory.initElements(driver,this);
    }





   public void clickViewAllButton()
   {
       DriverUtils.waitForElementClickable(DriverFactory.driver,viewAllButton);
       JavascriptExecutor jse = (JavascriptExecutor)driver;

       jse.executeScript("arguments[0].scrollIntoView()", viewAllButton);
       jse.executeScript("arguments[0].click();",viewAllButton );
       //DriverUtils.click(viewAllButton);
   }











}
