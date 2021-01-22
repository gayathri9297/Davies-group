import base.BasePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.DriverFactory;

import java.util.Iterator;
import java.util.Set;

public class VerifyContactForm extends BasePage
{
    String homePageExpectedTitle = DriverFactory.prop.getProperty("homePageTitle");
    String homePageActualTitle;

    @Test
    public void contactForm()
    {

        homePageActualTitle = driverUtils.getPageTitle();

        Assertions.assertEquals(homePageExpectedTitle,homePageActualTitle);


        homePage.clickContactLink();

        contactPage.clickTechnologyButton();

        contactPage.selectFromProductDropdown();

        contactPage.enterName(DriverFactory.prop.getProperty("name"));

        contactPage.enterEmail(DriverFactory.prop.getProperty("email"));

        contactPage.enterMessage(DriverFactory.prop.getProperty("message"));

        contactPage.clickSubmitButton();

        String submitMessage = contactPage.verifySubmitMessage();

        System.out.println("Confirmation Message After Submitting Form is: "+submitMessage);





    }

}
