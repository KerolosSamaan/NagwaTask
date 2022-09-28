package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P02_Search;

public class D02_Search extends P02_Search {


    @And("user click on search icon")
    public void click_search_icon(){SearchIcon().click();}


    @And("user write the lesson name in search text box")
    public void search_txt(){SearchTXT().sendKeys("addition");}

    @Then("user click on search submit")
    public void search_submit(){SearchSubmit().click();}





}
