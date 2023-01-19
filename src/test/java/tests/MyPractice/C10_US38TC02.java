package tests.MyPractice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C10_US38TC02 {
    @Test
    public void testCase02(){
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        Actions action= new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qualitydemyPage.cookiesAccept.click();
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        qualitydemyPage.loginButonu.click();
        qualitydemyPage.categoriesDropDown.click();
        action.moveToElement(qualitydemyPage.webDesignCourseSekmesi).click(qualitydemyPage.webDesignCourseSekmesi).perform();
        ReusableMethods.bekle(2);
        action.sendKeys(Keys.PAGE_DOWN);
        action.scrollToElement(qualitydemyPage.reactAndTypeScriptDersiLinki);
        ReusableMethods.bekle(1);
        qualitydemyPage.reactAndTypeScriptDersiLinki.click();
        qualitydemyPage.buyNowButonu.click();
        Assert.assertTrue(qualitydemyPage.homeShoppingCartYazisi.isDisplayed());


    }
}
