package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P04_SecondLesson {
    public WebElement WorkSheet(){return Hooks.driver.findElement(By.cssSelector("a[href=\"https://www.nagwa.com/en/worksheets/805156363640/\"]"));}


}
