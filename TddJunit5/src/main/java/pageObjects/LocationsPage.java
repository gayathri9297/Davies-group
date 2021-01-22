package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;
import utils.DriverUtils;

public class LocationsPage
{
    WebDriver driver;





    @FindBy(xpath = "//*[name()='svg']//following-sibling::div//child::div[1]//div//div[@id='marker0_11']")
    public WebElement stokeMap;

    @FindBy(xpath = "//*[name()='svg']//following-sibling::ul//li[@id='desc0_11']//child::p")
    public WebElement stokeAddress;




    public LocationsPage(WebDriver driver)
    {
       this.driver=driver;
       PageFactory.initElements(driver,this);
    }





   public void clickStokeOnMap()
   {
       
      DriverUtils.waitForElementClickable(DriverFactory.driver,stokeMap);
       JavascriptExecutor jse = (JavascriptExecutor)driver;

       jse.executeScript("arguments[0].scrollIntoView()",stokeMap);
       jse.executeScript("arguments[0].click();",stokeMap);
               //DriverUtils.click(stokeMap);
   }


   public String getStokeAddress()
   {
      DriverUtils.waitForElementVisibility(DriverFactory.driver,stokeAddress);
      String address = DriverUtils.getElementText(stokeAddress);
      return address;
   }









}
