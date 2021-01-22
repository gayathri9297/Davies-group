import base.BasePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.DriverFactory;

public class CaptureStokeOfficeAddress extends BasePage
{
    String homePageExpectedTitle = DriverFactory.prop.getProperty("homePageTitle");
    String homePageActualTitle;



    @Test
    public void getStokeOfficeAddress()
    {

        homePageActualTitle = driverUtils.getPageTitle();

        Assertions.assertEquals(homePageExpectedTitle,homePageActualTitle);

        homePage.clickAboutLocations();


        locationsPage.clickStokeOnMap();

        String stokeOfficeAddress = locationsPage.getStokeAddress();
        System.out.println("Stoke Office Address From Maps is: " + stokeOfficeAddress);



    }

}
