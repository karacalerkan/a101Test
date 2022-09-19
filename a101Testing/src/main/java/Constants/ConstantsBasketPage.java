package Constants;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConstantsBasketPage extends BasePage {

    @FindBy(xpath = "//a[@class='button green checkout-button block js-checkout-button']")
    public WebElement confirmCartButton;

    public ConstantsBasketPage(WebDriver driver) {
        super(driver);
    }
}
