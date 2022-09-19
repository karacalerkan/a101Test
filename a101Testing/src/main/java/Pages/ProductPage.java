package Pages;

import Base.BasePage;
import Constants.ConstantsProductPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductPage extends BasePage {

    ConstantsProductPage productPage = new ConstantsProductPage(driver);
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage theSocksBlack() {
        String isBlack = productPage.isBlack.getText();
        Assert.assertEquals("SİYAH", isBlack);
        System.out.println("The Socks Have Been Confirmed To Be Black.");
        sleep(1);
        return this;
    }

    public ProductPage addToCart() {
        productPage.addToCartButton.click();
        System.out.println("The Product Has Been Added To The Cart.");
        sleep(1);
        return this;
    }

    public void viewCart() {
        productPage.viewCartButton.click();
        System.out.println("Redirected To Cart.");
        sleep(1);
    }

}
