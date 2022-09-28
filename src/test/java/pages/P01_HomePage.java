package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P01_HomePage {

    public WebElement LanguageList(){return Hooks.driver.findElement
            (By.cssSelector("li[class=\"dropdown\"] a[href=\"#\"] i[class=\"f-icon arrow-head-down-icon\"]"));}

    public WebElement Language(){return Hooks.driver.findElement(By.cssSelector
            ("ul[class=\"dropdown-menu languages\"] a[href=\"https://www.nagwa.com/en/\"]"));}
}

