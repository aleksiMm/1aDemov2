package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.OrderPage;

public class OrderSteps {

    OrderPage orderPage = new OrderPage();

    @When("^Enter (asdfrths@mmail.com|all) and continue$")
    public void enterEmailAndContinue(String email) {
        orderPage.guest();
    }

    @And("^Choose pickup in store$")
    public void choosePickupInStore() {
        orderPage.pickUp();
    }

    @And("^Validate price$")
    public void validatePrice() {
        orderPage.assure();
    }

    @And("^Put (Alek|all) (Smith|all) and (23123456|all)$")
    public void putAlekSmithAndPhoneNumber(String name, String surname, String phone) {
        orderPage.cmrData();
    }
}
