package Constants;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css = "a.js-proceed-to-checkout-btn")
    public WebElement continueWithoutLoginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
