package tests.MyPractice;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C3_QdPozitifLoginTest {
    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qualitydemyPage.cookiesAccept.click();
        qualitydemyPage.ilkLoginLinki.click();

        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        qualitydemyPage.loginButonu.click();

        ReusableMethods.bekle(2);
        Assert.assertTrue(qualitydemyPage.basariliGirisCoursesLinki.isDisplayed());
        Driver.closeDriver();
    }
}
