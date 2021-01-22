package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverUtils;

public class FireInvestigationPage
{
    WebDriver driver;






    @FindBy(xpath = "//div[@class='case-single-desc__flex--full no-testimonial-case']//p[2]")
    public WebElement resultsText;


    public FireInvestigationPage(WebDriver driver)
    {
       this.driver=driver;
       PageFactory.initElements(driver,this);
    }



    public String verifyResultsSection()
    {
        String results = DriverUtils.getElementText(resultsText);
        return results;
    }






}
