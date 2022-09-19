package Constants;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConstantsPaymentPage extends BasePage {

    @FindBy(css = "span.order-complete")
    public WebElement completeOrderButton;
    @FindBy(xpath = "//a[@title='2. ÖDEME SEÇENEKLERİ']")
    public WebElement amIonPaymentPage;

    public ConstantsPaymentPage(WebDriver driver) {
        super(driver);
    }
}
