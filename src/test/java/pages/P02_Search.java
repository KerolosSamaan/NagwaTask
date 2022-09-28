package pages;

import jdk.internal.org.objectweb.asm.Handle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P02_Search {

    public WebElement SearchIcon(){return Hooks.driver.findElement(By.cssSelector("button[type=\"button\"] i[class=\"f-icon search-icon\"]"));}
    public WebElement SearchTXT(){return Hooks.driver.findElement(By.cssSelector("input[id=\"txt_search_query\"]"));}
    public WebElement SearchSubmit(){return Hooks.driver.findElement(By.cssSelector("button[type=\"submit\"]"));}



}
