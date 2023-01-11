package tests.MyPractice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C6_SwitchingWindowsTestRapor extends TestBaseRapor {
    // ve sayfa uzerinde h1 tag'inda "Elemental Selenium" yazisi oldugunu test edin
    @Test
    public void test01(){
        extentTest= extentReports.createTest("Switch Testi","Kullanici HerOku sitesinde Elemental Selenium Yazısını görebilmeli");

        // https://the-internet.herokuapp.com/iframe adresine gidin
        Driver.getDriver().get("https://the-internet.herokuapp.com/iframe");
        extentTest.info("Herokuu anasayfaya gidildi");
        // elemental selenium linlkine tiklayin
        Driver.getDriver().findElement(By.linkText("Elemental Selenium")).click();
        extentTest.info("Elemental Selenium linkine tıklandı");
        // title'i "Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro"
        // olan yeni window'a gecis yapin
        ReusableMethods.switchToWindow("Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro");
        extentTest.info("Yeni sayfaya gidildi");
        // ve sayfa uzerinde h1 tag'inda "Elemental Selenium" yazisi oldugunu test edin
        String expectedYazi= "Elemental Selenium";
        String actualYazi= Driver.getDriver().findElement(By.tagName("h1")).getText();
        extentTest.info("Açılan sayfada h1 tagında elemental Selenium yazısı görüntülendi");
        Assert.assertEquals(actualYazi,expectedYazi);

        ReusableMethods.bekle(2);
        Driver.getDriver().quit();
    }
}
