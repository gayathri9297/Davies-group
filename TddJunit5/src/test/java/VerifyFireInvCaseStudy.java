import base.BasePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.DriverFactory;
import utils.DriverUtils;

public class VerifyFireInvCaseStudy extends BasePage
{


    public static String solutionsPageExpectedTitle = DriverFactory.prop.getProperty("solutionsPageTitle");
    public static String solutionsPageActualTitle;

    public static String caseStudyPageExpectedTitle = DriverFactory.prop.getProperty("caseStudyPageTitle");
    public static String caseStudyPageActualTitle;

    public static String fireInvExpectedTitle = DriverFactory.prop.getProperty("fireInvPageTitle");
    public static   String fireInvPageActualTitle;
    @Test
    public  void verifyFireInvestigation()
    {
        homePage.clickSolutionsLink();

        solutionsPageActualTitle = BasePage.driverUtils.getPageTitle();

        System.out.println(solutionsPageActualTitle);
        Assertions.assertEquals(solutionsPageExpectedTitle,solutionsPageActualTitle);

        solutionsPage.clickViewAllButton();

       caseStudyPageActualTitle = BasePage.driverUtils.getPageTitle();

        System.out.println(caseStudyPageActualTitle);
        Assertions.assertEquals(caseStudyPageExpectedTitle,caseStudyPageActualTitle);


        caseStudyPage.clickSearchBox();
        caseStudyPage.enterSearchText();
        caseStudyPage.clickFireInvOption();


        fireInvPageActualTitle = BasePage.driverUtils.getPageTitle();


        Assertions.assertEquals(fireInvExpectedTitle,fireInvPageActualTitle);

        System.out.println("Fire Investigation Page Title is: "+fireInvPageActualTitle);





    }

}
