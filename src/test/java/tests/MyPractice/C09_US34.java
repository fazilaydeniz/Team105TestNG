package tests.MyPractice;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C09_US34 {
    @Test
    public void metaKeywordTesti(){
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qualitydemyPage.cookiesAccept.click();
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        ReusableMethods.bekle(1);
        qualitydemyPage.loginButonu.click();
        qualitydemyPage.instructorLinki.click();
        qualitydemyPage.courseManagerLinki.click();
        qualitydemyPage.addNewCourseLinki.click();
        ReusableMethods.bekle(1);
        qualitydemyPage.seoLinki.click();
        ReusableMethods.bekle(1);
        qualitydemyPage.metaKeywordsTextbox.click();
        ReusableMethods.bekle(1);
        qualitydemyPage.metaKeywordsTextbox.sendKeys("Java");
        ReusableMethods.bekle(1);
        Assert.assertTrue(qualitydemyPage.metaKeywordsTextbox.isEnabled());


    }
}
