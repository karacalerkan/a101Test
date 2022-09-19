package Constants;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConstantsProductPage extends BasePage {

    @FindBy(css = "div[class='selected-variant-text']>span")
    public WebElement isBlack;
    @FindBy(xpath = "//button[starts-with(@class,'add-to-basket')]")
    public WebElement addToCartButton;
    @FindBy(css = "a.go-to-shop")
    public WebElement viewCartButton;

    public ConstantsProductPage(WebDriver driver) {
        super(driver);
    }
}
