package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.P04_SecondLesson;

import java.util.List;

public class D04_SecondLesson extends P04_SecondLesson {
    @Then("user click on worksheet section")
    public void worksheet_section(){WorkSheet().click();}



}
