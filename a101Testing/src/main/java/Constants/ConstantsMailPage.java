package Constants;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConstantsMailPage extends BasePage {

    @FindBy (name = "user_email")
    public WebElement box;
    @FindBy(xpath = "//div[@class='block-email-info']//preceding::button[@class='button block green']")
    public WebElement continueButton;

    public ConstantsMailPage(WebDriver driver) {
        super(driver);
    }
}
