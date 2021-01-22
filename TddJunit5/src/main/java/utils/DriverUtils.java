package utils;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class DriverUtils
{
   public static String text;

    public static void navigateToUrl(String url)
    {
      DriverFactory.driver.navigate().to(url);
    }

    public static void pageRefresh()
    {
        DriverFactory.driver.navigate().refresh();
    }

    public static String getPageTitle()
    {
        return DriverFactory.driver.getTitle();

    }




    /********************Explicit Wait/Expected Conditions*******************************/

    public static void waitForElementPresence(WebDriver driver,By element)
    {
        WebDriverWait wait = new WebDriverWait(driver,20);
        try{
            wait.until(ExpectedConditions.presenceOfElementLocated(element));
        } catch(Exception e){

            e.printStackTrace();

           Assertions.assertFalse(false, "Failed the test - "+e.getMessage());
        }
    }


    public static void waitForElementVisibility(WebDriver driver,WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver,20);
        try{
            wait.until(ExpectedConditions.visibilityOf(element));

        } catch(Exception e){

            e.printStackTrace();

            Assertions.assertFalse(false, "Failed the test - "+e.getMessage());
        }
    }

    public static void waitForlocatorVisibility(WebDriver driver,By locator)
    {
        WebDriverWait wait = new WebDriverWait(driver,20);
        try{

            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch(Exception e){

            e.printStackTrace();

            Assertions.assertFalse(false, "Failed the test - "+e.getMessage());
        }
    }


    public static void islocatorInvisible(WebDriver driver,By locator)
    {
        WebDriverWait wait = new WebDriverWait(driver,20);
        try{

            wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
        } catch(Exception e){

            e.printStackTrace();

            Assertions.assertFalse(false, "Failed the test - "+e.getMessage());
        }
    }


    public static void waitForElementClickable(WebDriver driver,WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver,20);
        try{

            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch(Exception e){

            e.printStackTrace();

            Assertions.assertFalse(false, "Failed the test - "+e.getMessage());
        }
    }



    /****************click,wait,type **********************/



    //click
    public static void click(WebElement element){
        try{

           element.click();

        }catch(Exception e){

            e.printStackTrace();
        }

    }







    //type
    public static void type(WebElement element,String data){
        try{
            element.sendKeys(data);
        }catch(Exception e){

            e.printStackTrace();
        }
    }



   // getText
    public static String getElementText(WebElement element)
    {

       try
       {
           text = element.getText();
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }

         return text;




    }






    /***********************Validations***************************/

    public static boolean verifyTextEquals(WebElement element,String expectedText){
        try {
            Assertions.assertTrue(element.getText().matches(expectedText));
        }catch (Error e) {

            Assertions.assertFalse(false, "Text didn't match");
        }
        return false;
    }










    /*****************Verify element present / element not present ***************/



    public static boolean isElementPresent(WebElement element) {
        try {
            element.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }







    /*************************Dropdown*********************************/

    public static String getSelectedValue(WebElement element) {
        String value = new Select(element).getFirstSelectedOption().getText();
        return value;
    }

    public static void SelectUsingIndex(WebElement element,int index) {
        Select select = new Select(element);
        select.selectByIndex(index);

    }

    public static void SelectUsingVisibleText(WebElement element,String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public static void SelectByVisibleValue(WebElement element,String text) {
        Select select = new Select(element);
        select.selectByValue(text);
    }




// is selected

    public static  boolean verifyisChecked( WebElement element) {

        boolean result = false;
        if(element.isSelected()){

            result = true;
        }
        else{
            result = false;
        }
        return result;
    }


}
