package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.P03_SearchResult;

public class D03_SearchResult extends P03_SearchResult {


    @Then("user click on 2nd lesson")
    public void second_lesson(){SecondLesson().click();}





}