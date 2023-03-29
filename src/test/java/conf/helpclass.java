package conf;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static conf.Config.driver;

public class helpclass {
    static int trying = 10;
    public static WebDriverWait waiting = new WebDriverWait(driver, 5);
    public static boolean CheckElementToBeClickable(By element)
    {
        boolean condition = false;
        for (int i =0; i<trying; i++) {
            try {
                waiting.until(ExpectedConditions.elementToBeClickable(driver.findElement(element)));
                condition = true;
            } catch (Throwable t) {
                condition = false;

            }
        }
        try {
            waiting.until(ExpectedConditions.elementToBeClickable(driver.findElement(element)));
        } catch (Throwable t) {
            Assertions.fail("Превышено максимальное время ожидания элемента\n" + t.getMessage());
        }
        return condition;
    }
    public static boolean CheckElementToBeClickable(WebElement element)
    {
        boolean condition = false;
        for (int i =0; i<trying; i++) {
            try {
                waiting.until(ExpectedConditions.elementToBeClickable(element));
                condition = true;
            } catch (Throwable t) {
                condition = false;

            }
        }
        try {
            waiting.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Throwable t) {
            Assertions.fail("Превышено максимальное время ожидания элемента\n" + t.getMessage());
        }
        return condition;
    }
    public static boolean CheckElementVisibility(By element)
    {
        boolean condition = false;
        for (int i =0; i<trying; i++) {
            try {
                waiting.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
                condition = true;
            } catch (Throwable t) {
                condition = false;

            }
        }
        try {
            waiting.until(ExpectedConditions.elementToBeClickable(driver.findElement(element)));
        } catch (Throwable t) {
            Assertions.fail("Превышено максимальное время ожидания элемента\n" + t.getMessage());
        }
        return condition;
    }
    public static boolean CheckElementVisibility(WebElement element)
    {
        boolean condition = false;
        for (int i =0; i<trying; i++) {
            try {
                waiting.until(ExpectedConditions.visibilityOf(element));
                condition = true;
            } catch (Throwable t) {
                condition = false;

            }
        }
        try {
            waiting.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Throwable t) {
            Assertions.fail("Превышено максимальное время ожидания элемента\n" + t.getMessage());
        }
        return condition;
    }
    public static boolean CheckElementPresence(By element)
    {
        boolean condition = false;
        for (int i =0; i<trying; i++) {
            try {
                waiting.until(ExpectedConditions.presenceOfElementLocated(element));
                condition = true;
            } catch (Throwable t) {
                condition = false;

            }
        }
        try {
            waiting.until(ExpectedConditions.elementToBeClickable(driver.findElement(element)));
        } catch (Throwable t) {
            Assertions.fail("Превышено максимальное время ожидания элемента\n" + t.getMessage());
        }
        return condition;
    }
    public static void clickElementClickable(By element){
        Assertions.assertTrue(CheckElementToBeClickable(element));
        driver.findElement(element).click();
    }
    public static void clickElementClickable(WebElement element){
        Assertions.assertTrue(CheckElementToBeClickable(element));
        element.click();
    }
    public static void clickElementVisible(By element){
        Assertions.assertTrue(CheckElementVisibility(element));
        driver.findElement(element).click();
    }
    public static void clickElementVisible(WebElement element){
        Assertions.assertTrue(CheckElementVisibility(element));
        element.click();
    }
    public static void clickElementPresent(By element){
        Assertions.assertTrue(CheckElementPresence(element));
        driver.findElement(element).click();
    }
    public static void sendElementClickable(By element, String Text){
        Assertions.assertTrue(CheckElementToBeClickable(element));
        driver.findElement(element).sendKeys(Text);
    }
    public static void sendElementClickable(WebElement element, String Text){
        Assertions.assertTrue(CheckElementToBeClickable(element));
        element.sendKeys(Text);
    }
    public static void sendElementVisible(By element, String Text){
        Assertions.assertTrue(CheckElementVisibility(element));
        driver.findElement(element).sendKeys(Text);
    }
    public static void sendElementVisible(WebElement element, String Text){
        Assertions.assertTrue(CheckElementVisibility(element));
        element.sendKeys(Text);
    }
    public static void sendElementPresent(By element, String Text){
        Assertions.assertTrue(CheckElementPresence(element));
        driver.findElement(element).sendKeys(Text);
    }
    public static void clearElementClickable(By element){
        Assertions.assertTrue(CheckElementToBeClickable(element));
        driver.findElement(element).clear();
    }
    public static void clearElementClickable(WebElement element){
        Assertions.assertTrue(CheckElementToBeClickable(element));
        element.clear();
    }
    public static void clearElementVisible(By element){
        Assertions.assertTrue(CheckElementVisibility(element));
        driver.findElement(element).clear();
    }
    public static void clearElementVisible(WebElement element){
        Assertions.assertTrue(CheckElementVisibility(element));
        element.clear();
    }
    public static void clearElementPresent(By element){
        Assertions.assertTrue(CheckElementPresence(element));
        driver.findElement(element).clear();
    }
    public static void checkTextIdentity(String Text1, String Text2){
        Assertions.assertEquals(Text1, Text2);
    }

    public String getTextClickable(WebElement element){
        Assertions.assertTrue(CheckElementToBeClickable(element));
        return element.getText();
    }
    public static String getTextVisible(WebElement element){
        Assertions.assertTrue(CheckElementVisibility(element));
        return element.getText();
    }
    public static String getTextVisible(By element){
        Assertions.assertTrue(CheckElementVisibility(element));
        return driver.findElement(element).getText();
    }
}
