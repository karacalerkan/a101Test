package Pages;

import Base.BasePage;
import Constants.ConstantsHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage {

    ConstantsHomePage homePage = new ConstantsHomePage(driver);
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage acceptCookies() {
        homePage.cookies.click();
        System.out.println("Cookies Accepted.");
        sleep(1);
        return this;
    }

    public void clickToKneeSocks() {
        Actions action = new Actions(driver);
        action.moveToElement(homePage.clothingAndAccessories).build().perform();
        homePage.kneeSocks.click();
        System.out.println("Knee Socks Selected.");
        sleep(1);
    }

}
