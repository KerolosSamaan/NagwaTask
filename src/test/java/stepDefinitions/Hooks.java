package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver = null;
    @Before
    public static void OpenBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1024, 768));
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://www.nagwa.com/en/");
    }

    @After
    public static void QuitDriver() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
