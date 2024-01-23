package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class n11Pages {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public n11Pages(AppiumDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickItem(By by)
    {
        WebElement element = elementHelper.findElement(by);
        elementHelper.clickElement(element);

    }

    public void clickFromList(By by,int index)
    {
        List<WebElement> elements = elementHelper.findElements(by);
        elementHelper.clickElement(elements.get(index));
    }

    public void assertString(By by, String strToCompare)
    {
        WebElement element = elementHelper.findElement(by);
        System.out.println(element.getText());
        Assert.assertEquals(element.getText(),strToCompare);
    }
}
