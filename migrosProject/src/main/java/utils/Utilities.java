package utils;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.driver.Driver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities extends Driver{

    public void navigate(String url)
    {
        driver.get(url);
    }
    public void waitFor(double seconds) {
        try {Thread.sleep((long) (seconds*1000));}
        catch (InterruptedException ignored){}
    }

    public void elementClick(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
}