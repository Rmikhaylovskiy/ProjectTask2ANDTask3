package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.NoSuchElementException;

import static org.junit.Assert.assertEquals;
public class Basepage {
    WebDriver driver;


    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (java.util.NoSuchElementException e) {
            return false;
        }
    }

    public void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public void checkFillField(String value, WebElement element) {
        assertEquals (value, element.getAttribute("value"));
    }
}
