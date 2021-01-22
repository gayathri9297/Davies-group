package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;
import utils.DriverUtils;

public class TwitterPage
{
    WebDriver driver;





    @FindBy(xpath = "(//span[text()='Davies Group'])[1]") public WebElement daviesText;




    public TwitterPage(WebDriver driver)
    {
       this.driver=driver;
       PageFactory.initElements(driver,this);
    }







   public String getName()
   {
       DriverUtils.waitForElementVisibility(DriverFactory.driver,daviesText);
      String text = DriverUtils.getElementText(daviesText);
      return text;
   }









}
