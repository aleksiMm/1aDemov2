package pages;

import model.CustomerData;
import model.ShoppingCart;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OrderPage {
    CustomerData customerData = new CustomerData();
    ShoppingCart shoppingCart = new ShoppingCart();

    private final By emailGuest = By.xpath("//form[@id = 'new_user_guest']//input[@type= 'email']");
    private final By guestCheckout = By.xpath("//form[@id = 'new_user_guest']//input[@type= 'submit']");
    private final By finalPrice = By.xpath("//span[@class = 'checkout-order-summary-total__price']");
    private final By name = By.xpath("//input[@id = 'address_first_name']");
    private final By surname = By.xpath("//input[@id = 'address_last_name']");
    private final By phone = By.xpath("//input[@id = 'address_phone_number']");
    private final By deliveryOption = By.xpath("//input[@value = '2']");
    private final By jelgava = By.xpath("//input[@value = '3207']");

    public void guest() {
        $(emailGuest).sendKeys(customerData.getEmail());
        String checkMail = $(emailGuest).getAttribute("value");
        assertThat(checkMail).isEqualTo("asdfrths@mmail.com");
        $(guestCheckout).click();
    }

    public void pickUp() {
        $(deliveryOption).click();
    }

    public void assure() {
        String priceCheck = $(finalPrice).getAttribute("value");
        assertThat(priceCheck).isEqualTo(shoppingCart.getPrice());
    }

    public void cmrData() {
        $(jelgava).click();
        $(name).sendKeys(customerData.getFirstName());
        $(surname).sendKeys(customerData.getLastName());
        $(phone).sendKeys(customerData.getPhone());

    }

}
