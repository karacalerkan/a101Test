package Pages;

import Base.BasePage;
import Constants.ConstantsProductListPage;
import org.openqa.selenium.WebDriver;

public class ProductListPage extends BasePage {

    ConstantsProductListPage productListPage = new ConstantsProductListPage(driver);

    public ProductListPage(WebDriver driver) {
        super(driver);
    }

    public ProductListPage ListBlackSocks() {
        productListPage.listBlackSocks.click();
        System.out.println("Black Socks are Listed.");
        sleep(1);
        return this;
    }

    public void selectFirstSocks() {
        productListPage.firstSocks.click();
        System.out.println("First Product is Selected.");
        sleep(1);
    }

}
