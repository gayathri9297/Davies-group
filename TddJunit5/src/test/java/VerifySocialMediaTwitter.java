import base.BasePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.DriverFactory;
import utils.DriverUtils;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class VerifySocialMediaTwitter extends BasePage
{
    String homePageExpectedTitle = DriverFactory.prop.getProperty("homePageTitle");
    String homePageActualTitle;

    @Test
    public void verifyTwitterPage()
    {


        Set<String> windows;

        Iterator<String> itr;

        homePageActualTitle = driverUtils.getPageTitle();

        Assertions.assertEquals(homePageExpectedTitle,homePageActualTitle);



        homePage.clickTwitterIcon();


        windows =  DriverFactory.driver.getWindowHandles();

        itr = windows.iterator();

        String parentWindow = itr.next();



        System.out.println("Title of home page is: " + homePageActualTitle );

        System.out.println("parent window id is: " + parentWindow);

        String firstTab = itr.next();

        System.out.println("Twitter Tab id is: " + firstTab);


        DriverFactory.driver.switchTo().window(firstTab);


        String text = twitterPage.getName();

        System.out.println("Twitter Name is: "+text);

        String FirstTabTitle = driverUtils.getPageTitle();

        System.out.println("Title of Twitter Tab is: " + FirstTabTitle );







    }

}
