package tests.MyPractice;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C07_KullaniciKaydiYapmaDataProvider  {
    @DataProvider
    public static Object[][] kullaniciGirisleri() {
        Object[][] kullanicigirisleriArrayi={{"ilker" ,"ilker@a.com "},{"mehmet","mehmet@b.com"},{"yasar","yasar@c.com "}};

        return kullanicigirisleriArrayi;
    }
        @Test(dataProvider = "kullaniciGirisleri")
    public void kullaniciKaydi(String userName, String password){

        //  kullanici "qdUrl" anasayfaya gider
            Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
            QualitydemyPage qualitydemyPage=new QualitydemyPage();
        //  kullanici accept butonuna basar
            qualitydemyPage.cookiesAccept.click();
        //  ilk sayfa login linkine click yapar
            qualitydemyPage.ilkLoginLinki.click();
        //  kullanici kutusuna manuel olarak "<yanlisUsername>" yazar
            qualitydemyPage.kullaniciEmailKutusu.sendKeys(userName);
        //  password kutusuna manuel olarak "<yanlisPassword>" yazar
            qualitydemyPage.passwordKutusu.sendKeys(password);
        //  3 saniye bekler
            ReusableMethods.bekle(3);
        //  login butonuna basar
            qualitydemyPage.loginButonu.click();
        //  giris yapilamadigini test eder
            Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
        //  sayfayi kapatir
            ReusableMethods.bekle(3);
            Driver.closeDriver();


    }

}
