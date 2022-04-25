package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.orderPage;

public class orderSteps {

    orderPage op = new orderPage();

    @When("^Enter (asdfrths@mmail.com|all) and continue$")
    public void enterEmailAndContinue(String email) {
        op.guest();
    }

    @And("^Choose pickup in store$")
    public void choosePickupInStore() {
        op.pickUp();
    }

    @And("^Validate price$")
    public void validatePrice() {
        op.assure();
    }

    @And("^Put (Alek|all) (Smith|all) and (23123456|all)$")
    public void putAlekSmithAndPhoneNumber(String name, String surname, String phone) {
        op.cmrData();
    }
}
