package Pages;

import Base.BasePage;
import Constants.ConstantsMailPage;
import org.openqa.selenium.WebDriver;

public class MailPage extends BasePage {

    ConstantsMailPage mailPage = new ConstantsMailPage(driver);
    public MailPage(WebDriver driver) {
        super(driver);
    }

    public MailPage enterMail(String Mail) {
        mailPage.box.clear();
        mailPage.box.sendKeys(Mail);
        System.out.println("E-mail Address Has Been Entered.");
        sleep(1);
        return this;
    }

    public void clickContinue(){
        mailPage.continueButton.click();
        sleep(1);
    }

}
