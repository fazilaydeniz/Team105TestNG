package tests.day14_testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C03_NutellaTesti {
    @Test(groups = "minireg1")
    public void test01(){
        //Amazon ana sayfaya gidin.
        Driver.getDriver().get("https://www.amazon.com");
        // Nutella için arama yapın
      //  WebElement aramaKutusu= Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
       AmazonPage amazonPage =new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        // Sonuçların Nutella olduğunu test edin.
     //   WebElement aramaSonucuElementi=Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String expectedKelime="Nutella";
        String actualAramaSonucu=amazonPage.aramasonucuElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));

                Driver.closeDriver();

    }
}
