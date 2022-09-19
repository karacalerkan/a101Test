package Constants;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConstantsAdressPage extends BasePage {

    @FindBy(css = "div.checkout-delivery>div>div>ul>li>a")
    public WebElement createNewAdressButton;
    @FindBy(css = "input[name='title']")
    public WebElement adressTitle;
    @FindBy(name = "first_name")
    public WebElement name;
    @FindBy(name = "last_name")
    public WebElement surname;
    @FindBy(name = "phone_number")
    public WebElement phone;
    @FindBy(xpath = "//select[@name='city']/option[@value='40']")
    public WebElement istanbul;
    @FindBy(xpath = "//select[@name='township']/option[@value='472']")
    public WebElement kartal;
    @FindBy(xpath = "//select[@name='district']/option[@value='35957']")
    public WebElement gumuspinar;
    @FindBy(css = "textarea[name='line']")
    public WebElement enterAdress;
    @FindBy(css = "button[class= 'button green js-set-country js-prevent-emoji']")
    public WebElement saveButton;
    @FindBy(xpath = "//div[@class='cargo']/button")
    public WebElement saveAndContinueButton;

    public ConstantsAdressPage(WebDriver driver) {
        super(driver);
    }
}
