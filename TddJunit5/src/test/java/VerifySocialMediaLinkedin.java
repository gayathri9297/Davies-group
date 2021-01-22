import base.BasePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.DriverFactory;

import java.util.Iterator;
import java.util.Set;

public class VerifySocialMediaLinkedin extends BasePage
{
    String homePageExpectedTitle = DriverFactory.prop.getProperty("homePageTitle");
    String homePageActualTitle;

    @Test
    public void verifyLinkedInPage()

    {


        Set<String> windows;

        Iterator<String> itr;

        homePageActualTitle = driverUtils.getPageTitle();

        Assertions.assertEquals(homePageExpectedTitle,homePageActualTitle);



        homePage.clickLinkedInIcon();


        windows =  DriverFactory.driver.getWindowHandles();

        itr = windows.iterator();

        String parentWindow = itr.next();



        System.out.println("Title of home page is: " + homePageActualTitle );

        System.out.println("parent window id is: " + parentWindow);

        String firstTab = itr.next();

        System.out.println("LinkedIn Tab id is: " + firstTab);


        DriverFactory.driver.switchTo().window(firstTab);


        String FirstTabTitle = driverUtils.getPageTitle();

        System.out.println("Title of LinkedIn Tab is: " + FirstTabTitle );







    }

}
