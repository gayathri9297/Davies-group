package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;
import utils.DriverUtils;

public class LinkedInPage
{
    WebDriver driver;





    @FindBy(xpath = "(//input[@value='Davies Group'])[1]") public WebElement daviesGroupText;




    public LinkedInPage(WebDriver driver)
    {
       this.driver=driver;
       PageFactory.initElements(driver,this);
    }














}
