package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.resultPage;

public class resultStep {

    resultPage rp = new resultPage();

    @Then("^Select product$")
    public void selectProduct() {
        rp.product();
    }

    @And("^Add to cart$")
    public void addToCart() {
        rp.groza();
    }
    @And("^Go to cart$")
    public void goToCart() {
        rp.checkOut();
    }
    @And("^Press buy$")
    public void pressBuy() {
        rp.confirmCo();
    }
}

