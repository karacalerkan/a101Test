package Constants;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConstantsProductListPage extends BasePage {

    @FindBy (xpath = "//label[@for='attributes_integration_colourSİYAH']")
    public WebElement listBlackSocks;
    @FindBy (xpath = "//ul[@class='product-list-general']/li[1]")
    public WebElement firstSocks;

    public ConstantsProductListPage(WebDriver driver) {
        super(driver);
    }
}
