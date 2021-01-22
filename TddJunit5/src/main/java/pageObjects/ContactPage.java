package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;
import utils.DriverUtils;

public class ContactPage {
    WebDriver driver;


    @FindBy(id = "technology")
    public WebElement technologyButton;


    @FindBy(xpath = "(//select[@class='contact__subcat-list no-bullet'])[5]")
    public WebElement productDropdown;

    @FindBy(xpath = "//input[@placeholder='Your Name*']")
    public WebElement nameTextbox;


    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextbox;

    @FindBy(xpath = "//textarea[@name='your-message']")
    public WebElement messageTextbox;


    @FindBy(xpath = "//p[text()='Submit']")
    public WebElement submitButton;


    @FindBy(xpath = "(//div[@role='alert'])[2]")
    public WebElement submitConfirmMsg;

    public ContactPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void clickTechnologyButton() {

        DriverUtils.waitForElementClickable(DriverFactory.driver, technologyButton);
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("arguments[0].scrollIntoView()", technologyButton);
        jse.executeScript("arguments[0].click();", technologyButton);


        //  DriverUtils.click(technologyButton);
    }


    public void selectFromProductDropdown() {
        DriverUtils.SelectUsingIndex(productDropdown, 2);
    }


    public void enterName(String name) {
        DriverUtils.type(nameTextbox, name);
    }


    public void enterEmail(String email) {
        DriverUtils.type(emailTextbox, email);
    }

    public void enterMessage(String msg) {
        DriverUtils.type(messageTextbox, msg);
    }


    public void clickSubmitButton() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("arguments[0].scrollIntoView()", submitButton);
        jse.executeScript("arguments[0].click();", submitButton);
    }


    public String verifySubmitMessage() {

        DriverUtils.waitForElementVisibility(DriverFactory.driver, submitConfirmMsg);
        String msg = DriverUtils.getElementText(submitConfirmMsg);
        return msg;


    }

}
