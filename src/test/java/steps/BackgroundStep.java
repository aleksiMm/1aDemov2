package steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BackgroundStep {

    By cookies = By.xpath("//a[@class = 'c-button-inverse']");
    @Given("^Open eshop$")
    public void openEshop() {
        open("https://www.1a.lv/");
        getWebDriver().manage().window().maximize();
        Configuration.holdBrowserOpen = true;
    }

    @Then("^Accept necessary cookies$")
    public void acceptNecessaryCookies() {
        $(cookies).click();

    }
}
