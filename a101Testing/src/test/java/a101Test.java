import Base.BaseTest;
import Pages.*;
import org.testng.annotations.Test;

    public class a101Test extends BaseTest {

        @Test
        public void Test(){

            HomePage homePage = new HomePage(driver);
            ProductListPage productListPage = new ProductListPage(driver);
            ProductPage productPage = new ProductPage(driver);
            BasketPage basketPage = new BasketPage(driver);
            LoginPage loginPage = new LoginPage(driver);
            MailPage mailPage = new MailPage(driver);
            AdressPage adressPage = new AdressPage(driver);
            PaymentPage paymentPage = new PaymentPage(driver);

            homePage.acceptCookies().clickToKneeSocks();

            productListPage.ListBlackSocks().selectFirstSocks();

            productPage.theSocksBlack().addToCart().viewCart();

            basketPage.confirmCart();

            loginPage.continueWithoutLogin();

            mailPage.enterMail("qaautomationtestingsamplemail@gmail.com").clickContinue();

            adressPage.createNewAdress().enterAdressTitle("Home").enterName("Erkan").enterSurname("Karaçal").enterPhone("9999999999")
                      .selectCity().selectTownship().selectDistrict().enterAdress().saveInfo().saveAndContinue();

            paymentPage.amIonPaymentPageCheck().completeOrder();


        }

}
