package pageObjects;

import io.cucumber.java.bs.A;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;
import utils.DriverUtils;

public class CaseStudyPage {
    WebDriver driver;


    @FindBy(xpath = "//a[@href='https://davies-group.com/case-study/fire-investigation/']")
    public WebElement fireInvestigationLink;

    @FindBy(id = "select2--container")
    public WebElement searchBox;


    @FindBy(xpath = "//input[@role='searchbox']")
    public WebElement searchTextbox;


    @FindBy(className = "select2-results__option--highlighted")
    public WebElement fireinvOption;


    public CaseStudyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void clickSearchBox() {
        //DriverUtils.waitForElementClickable(DriverFactory.driver,fireInvestigationLink);
        DriverUtils.click(searchBox);
    }

    public void enterSearchText() {
        DriverUtils.type(searchTextbox, DriverFactory.prop.getProperty("searchDataFireInv"));


    }


    public void clickFireInvOption() {
        DriverUtils.click(fireinvOption);
    }


}
