package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver == null){
            WebDriverManager.chromiumdriver().setup();
            ChromeOptions co = new ChromeOptions();
            co.addArguments("--disable-notifications");
            co.addArguments("--disable-popup-blocking");
            //co.addArguments("headless"); // enable this to run without opening the screen - must be ON to run on Jenkins
            driver = new ChromeDriver(co);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            Driver.driver.get("https://www.hoyts.co.nz/");
        }
        return driver;
    }

    public static void killDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
