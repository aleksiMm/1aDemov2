package pages;

import model.shoppingCart;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class resultPage {

    shoppingCart cart = new shoppingCart();

    private final By veloxAirflow = By.xpath("//a[@data-gtm-link= '667069']");
    private final By addToGroza = By.xpath("//button[@id = 'add_to_cart_btn']");
    private final By goToGroza = By.xpath("//a[@class ='main-button']");
    private final By commit = By.xpath("//input[@type='submit']");
    private final By findName = By.xpath("//H1[text()]");
    private final By findPrice = By.xpath("//span[@class = 'price']");

    public void product() {
        $(veloxAirflow).click();
    }

    public void groza() {
        String getName = $(findName).getAttribute("value");
        String price = $(findPrice).getAttribute("value");
        cart.setProductName(getName);
        cart.setPrice(price);
        $(addToGroza).click();
    }

    public void checkOut() {
        $(goToGroza).click();
    }

    public void confirmCo() {
        $(commit).click();
    }

}


