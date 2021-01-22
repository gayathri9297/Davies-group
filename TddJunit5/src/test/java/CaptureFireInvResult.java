import base.BasePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.DriverFactory;

public class CaptureFireInvResult extends BasePage
{

    public static String solutionsPageExpectedTitle = DriverFactory.prop.getProperty("solutionsPageTitle");
    public static String solutionsPageActualTitle;

    public static String caseStudyPageExpectedTitle = DriverFactory.prop.getProperty("caseStudyPageTitle");
    public static String caseStudyPageActualTitle;

    public static String fireInvExpectedTitle = DriverFactory.prop.getProperty("fireInvPageTitle");
    public static   String fireInvPageActualTitle;


    @Test
    public  void verifyResultsSection()
    {
        homePage.clickSolutionsLink();

        solutionsPageActualTitle = BasePage.driverUtils.getPageTitle();

        System.out.println("Solutions Page Title is: "+solutionsPageActualTitle);
        Assertions.assertEquals(solutionsPageExpectedTitle,solutionsPageActualTitle);

        solutionsPage.clickViewAllButton();

        caseStudyPageActualTitle = BasePage.driverUtils.getPageTitle();

        System.out.println("Case Study Page Title is: "+caseStudyPageActualTitle);
        Assertions.assertEquals(caseStudyPageExpectedTitle,caseStudyPageActualTitle);


        caseStudyPage.clickSearchBox();
        caseStudyPage.enterSearchText();
        caseStudyPage.clickFireInvOption();


        fireInvPageActualTitle = BasePage.driverUtils.getPageTitle();


        Assertions.assertEquals(fireInvExpectedTitle,fireInvPageActualTitle);

        System.out.println("Fire Investigation Page Title is: "+fireInvPageActualTitle);




       String result = fireInvestigationPage.verifyResultsSection();
        System.out.println("Results Section Text is: " + result);



    }


}
