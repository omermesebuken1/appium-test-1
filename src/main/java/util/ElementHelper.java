package util;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElementHelper {

    AppiumDriver driver;
    WebDriverWait wait;
    Actions action;

    public ElementHelper(AppiumDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.action = new Actions(driver);
    }



    public WebElement findElement(By by)
    {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public List<WebElement> findElements(By by)
    {
        List<WebElement> elements = new ArrayList<>();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        elements = driver.findElements(by);

        System.out.println("Size: " + elements.size());
        return elements;
    }

    public void clickElement(WebElement element)
    {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void sendKeys(By by, String text)
    {
        findElement(by).sendKeys(text);
    }

    public static void waitSomeTime(long timeNoSee) throws InterruptedException {

        Thread.sleep(timeNoSee);

    }







}
