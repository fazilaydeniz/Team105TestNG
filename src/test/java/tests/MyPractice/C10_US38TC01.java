package tests.MyPractice;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C10_US38TC01 {
    @Test
    public void testCase01(){
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qualitydemyPage.cookiesAccept.click();
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        qualitydemyPage.loginButonu.click();
        Actions action=new Actions(Driver.getDriver());
        qualitydemyPage.categoriesDropDown.click();
        action.moveToElement(qualitydemyPage.enlishCourseSekmesi).click(qualitydemyPage.enlishCourseSekmesi).perform();
        qualitydemyPage.englishCourseLearnToSpeakLinki.click();
        qualitydemyPage.comparebutonu.click();
        Assert.assertTrue(qualitydemyPage.homeCourseCompareYazisi.isDisplayed());


    }

}
