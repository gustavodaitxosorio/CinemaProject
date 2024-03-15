package pages;

import core.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import static core.Driver.getDriver;

public class basePage {

    public void waitForElementToBeClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementToBeVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    public void clickElement (WebElement element){
        element.click();
    }

    public void typeTextByElement (WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }

    public String getTextElement(WebElement element) {
        return element.getText();
    }

    public void scrollToElement(WebElement element) throws InterruptedException {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        waitForElementToBeClickable(element);
        Thread.sleep(1000);

    }
}
