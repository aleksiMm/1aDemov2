package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.searchPage;


public class searchSteps {
    searchPage sp = new searchPage();
    @Given("^Search (.*)$")
    public void searchProduct(String product) {
  sp.searchProduct();
    }

    @And("^Choose subcategory$")
    public void chooseSubcategory() {
     sp.filterCat();    }
}
