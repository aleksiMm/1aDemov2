package pages;

import model.customerData;
import model.shoppingCart;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class orderPage {
    customerData user = new customerData();
    shoppingCart cart = new shoppingCart();

    private final By emailGuest = By.xpath("//form[@id = 'new_user_guest']//input[@type= 'email']");
    private final By finalPrice = By.xpath("//span[@class = 'checkout-order-summary-total__price']");
    private final By name = By.xpath("//input[@id = 'address_first_name']");
    private final By surname = By.xpath("//input[@id = 'address_last_name']");
    private final By phone =  By.xpath("//input[@id = 'address_phone_number']");
    private final By deliveryOption = By.xpath("//input[@value = '2']");

    public void guest() {
        $(emailGuest).sendKeys(user.getEmail());
        String checkMail = $(emailGuest).getAttribute("value");
        assertThat(checkMail).isEqualTo("asdfrths@mmail.com");
        $(By.xpath("//form[@id = 'new_user_guest']//input[@type= 'submit']")).click();

    }

    public void pickUp() {
        $(deliveryOption).click();
    }

    public void assure() {
        String priceCheck = $(finalPrice).getAttribute("value");
        assertThat(priceCheck).isEqualTo(cart.getPrice());
    }

    public void cmrData() {
        $(By.xpath("//input[@value = '3207']")).click();
        $(name).sendKeys(user.getFirstName());
        $(surname).sendKeys(user.getLastName());
        $(phone).sendKeys(user.getPhone());

    }

}
