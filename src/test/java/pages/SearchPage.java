package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class SearchPage {
    private final By searchWhat = By.xpath("//input[@class='sn-suggest-input autocomplete main-search-input']");
    private final By mekletB = By.xpath("//button[@class = 'main-search-submit']");
    private final By filter = byText("MSI korpusi");
    private final By main = byXpath("//img[@alt = 'Korpusi']");

    public void searchProduct() {
        $(searchWhat).sendKeys("MSI");
        String searchingFor = $(searchWhat).getAttribute("value");
        assertThat(searchingFor).isEqualTo("MSI");
        $(mekletB).click();
    }

    public void filterCat() {
        $(filter).hover().click();
        $(main).hover().click();
    }

}
