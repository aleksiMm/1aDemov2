package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ResultPage;

public class ResultStep {

    ResultPage resultPage = new ResultPage();

    @Then("^Select product$")
    public void selectProduct() {
        resultPage.product();
    }

    @And("^Add to cart$")
    public void addToCart() {
        resultPage.groza();
    }

    @And("^Go to cart$")
    public void goToCart() {
        resultPage.checkOut();
    }

    @And("^Press buy$")
    public void pressBuy() {
        resultPage.confirmCo();
    }
}

