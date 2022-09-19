package Pages;

import Base.BasePage;
import Constants.ConstantsBasketPage;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage {

    ConstantsBasketPage basketPage =  new ConstantsBasketPage(driver);
    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public void confirmCart(){
        basketPage.confirmCartButton.click();
        System.out.println("Cart Confirmed.");
        sleep(1);
    }

}
