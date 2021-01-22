package base;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import pageObjects.*;
import utils.DriverFactory;
import utils.DriverUtils;



public class BasePage
{


    public static HomePage homePage;
    public static SolutionsPage solutionsPage;
    public static CaseStudyPage caseStudyPage;
    public static FireInvestigationPage fireInvestigationPage;
    public static LocationsPage locationsPage;
    public static TwitterPage twitterPage;
    public static LinkedInPage linkedInPage;
    public static ContactPage contactPage;
    public static DriverUtils driverUtils;




    public static void initPages()
    {


        homePage = new HomePage(DriverFactory.driver);
        solutionsPage = new SolutionsPage(DriverFactory.driver);
        caseStudyPage = new CaseStudyPage(DriverFactory.driver);
        fireInvestigationPage = new FireInvestigationPage(DriverFactory.driver);
        locationsPage = new LocationsPage(DriverFactory.driver);
        twitterPage = new TwitterPage(DriverFactory.driver);
        linkedInPage = new LinkedInPage(DriverFactory.driver);
        contactPage = new ContactPage(DriverFactory.driver);
        driverUtils = new DriverUtils();
    }




     @BeforeAll
     public static void setUp()
     {
         DriverFactory.getDriver();
     }

     @AfterAll
     public static void tearDown()
     {
         DriverFactory.closeDriver();
     }


}
