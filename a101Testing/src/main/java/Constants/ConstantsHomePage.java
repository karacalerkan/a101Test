package Constants;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConstantsHomePage extends BasePage {

    @FindBy(xpath = "//button[text()='Kabul Et']")
    public WebElement cookies;
    @FindBy(xpath = "//li[@class='js-navigation-item '][4]/a[1]")
    public WebElement clothingAndAccessories;
    @FindBy(css = "a[title='Dizaltı Çorap']")
    public WebElement kneeSocks;

    public ConstantsHomePage(WebDriver driver) {
        super(driver);
    }
}
