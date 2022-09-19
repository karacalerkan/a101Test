package Pages;

import Base.BasePage;
import Constants.ConstantsPaymentPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PaymentPage extends BasePage {

    ConstantsPaymentPage paymentPage = new ConstantsPaymentPage(driver);
    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    public PaymentPage amIonPaymentPageCheck() {
        String check = paymentPage.amIonPaymentPage.getText();
        Assert.assertEquals("2. ÖDEME SEÇENEKLERİ", check);
        System.out.println("Confirmed That You Are On The Payment Page.");
        sleep(1);
        return this;
    }

    public void completeOrder() {
        paymentPage.completeOrderButton.click();
        System.out.println("Payment Compete.");
        sleep(1);
    }

}
