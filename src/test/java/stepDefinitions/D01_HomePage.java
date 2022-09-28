package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.P01_HomePage;

public class D01_HomePage extends P01_HomePage {

@Given("user click on language list")
    public void language_list(){LanguageList().click();}

    @Then("user choose the language")
    public void choose_language(){Language().click();}


    }

