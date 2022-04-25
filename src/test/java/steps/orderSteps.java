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

    @And("^Choose delivery method$")
    public void chooseDeliveryMethod() {
        op.pickUp();
    }

    @And("^Validate price$")
    public void validatePrice() {
        op.assure();
    }
    @And("^Fill customer (.*)(.*)(.*)$")
    public void fillCustomerNameSurnameAndPhone(String name, String surname, String phone) {
        op.cmrData();
    }
}
