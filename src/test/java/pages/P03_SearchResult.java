package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

import javax.xml.bind.annotation.W3CDomHandler;

public class P03_SearchResult {


    public WebElement SecondLesson(){return Hooks.driver.findElement(By.cssSelector("a[href=\"https://www.nagwa.com/en/lessons/167131671315/\"]"));}
}
