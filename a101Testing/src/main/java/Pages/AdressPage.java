package Pages;

import Base.BasePage;
import Constants.ConstantsAdressPage;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class AdressPage extends BasePage {

    ConstantsAdressPage adressPage = new ConstantsAdressPage(driver);

    public AdressPage(WebDriver driver) {
        super(driver);
    }

    public AdressPage createNewAdress() {
        adressPage.createNewAdressButton.click();
        sleep(1);
        return this;
    }

    public AdressPage enterAdressTitle(String title) {
        adressPage.adressTitle.clear();
        adressPage.adressTitle.sendKeys(title);
        sleep(1);
        return this;
    }

    public AdressPage enterName(String name) {
        adressPage.name.clear();
        adressPage.name.sendKeys(name);
        sleep(1);
        return this;
    }

    public AdressPage enterSurname(String surname) {
        adressPage.surname.clear();
        adressPage.surname.sendKeys(surname);
        sleep(1);
        return this;
    }

    public AdressPage enterPhone(String phone) {
        adressPage.phone.clear();
        adressPage.phone.sendKeys(phone);
        sleep(1);
        return this;
    }

    public AdressPage selectCity() {
        adressPage.istanbul.click();
        sleep(1);
        return this;
    }

    public AdressPage selectTownship() {
        adressPage.kartal.click();
        sleep(1);
        return this;
    }

    public AdressPage selectDistrict() {
        adressPage.gumuspinar.click();
        sleep(1);
        return this;
    }

    public AdressPage enterAdress() {
        //Her denemede farklı bir adres girmek gerekiyor. Yoksa sunucudan responce alınamıyor.
        Random ran = new Random();
        int randomCount1 = ran.nextInt(100);
        int randomCount2 = ran.nextInt(10000);

        adressPage.enterAdress.clear();
        adressPage.enterAdress.sendKeys( "No:" +randomCount1 +"/"+ randomCount2);
        sleep(1);
        return this;
    }

   public AdressPage saveInfo(){
        adressPage.saveButton.click();
        System.out.println("Address Information Has Been Entered.");
        sleep(1);
        return this;
    }

    public void saveAndContinue() {
        adressPage.saveAndContinueButton.click();
        sleep(1);
    }

}
