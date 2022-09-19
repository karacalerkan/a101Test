package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    Constants.LoginPage loginPage = new Constants.LoginPage(driver);
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void continueWithoutLogin() {
        loginPage.continueWithoutLoginButton.click();
        System.out.println("Continued Without Logging Into The Site.");
        sleep(1);
    }
}
