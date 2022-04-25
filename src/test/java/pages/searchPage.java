package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class searchPage {
    By mekletB = By.xpath("//input[@class='sn-suggest-input autocomplete main-search-input']");

    public void searchProduct() {
        $(mekletB).sendKeys("MSI");
        String searchingFor = $(mekletB).getAttribute("value");
        assertThat(searchingFor).isEqualTo("MSI");
        $(By.xpath("//button[@class = 'main-search-submit']")).click();
    }
    public void filterCat() {
        By filter = byText("MSI korpusi");
        $(filter).hover().click();
        By main = byXpath("//img[@alt = 'Korpusi']");
        $(main).hover().click();
    }

}
