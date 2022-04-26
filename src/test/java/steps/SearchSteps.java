package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.SearchPage;


public class SearchSteps {
    SearchPage searchPage = new SearchPage();

    @Given("^Search (.*)$")
    public void searchProduct(String product) {
        searchPage.searchProduct();
    }

    @And("^Choose subcategory$")
    public void chooseSubcategory() {
        searchPage.filterCat();
    }
}
