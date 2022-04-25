package pages;

import model.shoppingCart;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
public class resultPage {

    shoppingCart cart = new shoppingCart();

    public void product() {
        $(byXpath("//a[@data-gtm-link= '667069']")).click();
    }

    public void groza() {
        String getName = $(By.xpath("//H1[text()]")).getAttribute("value") ;
        String price = $(By.xpath("//span[@class = 'price']")).getAttribute("value");
        cart.setProductName(getName);
        cart.setPrice(price);

        $(byXpath("//button[@id = 'add_to_cart_btn']")).click();
    }

    public void checkOut() {
        $(By.xpath("//a[@class ='main-button']")).click();
    }
    public void confirmCo(){
        $(By.xpath("//input[@type='submit']")).click();
    }

}


