package tests.day15_SoftAssert;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_SoftAssert {
    @Test
    public void test01(){
        //amazon anasayfaya gidin
        Driver.getDriver().get("https://www.amazon.com");
        // amazon anasayfaya gittiğini doğrulayın
        SoftAssert softAssert=new SoftAssert();
        String expectedUrlKelime= "amazon";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrlKelime));
        // Nutella aratın
        AmazonPage amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        //arama sonuclarının nutella içerdiğini doğrulayın
        String aramaSonucYazisi= amazonPage.aramasonucuElementi.getText();
        softAssert.assertTrue(aramaSonucYazisi.contains("Nutella"));
        //Java aratın
        amazonPage.amazonAramaKutusu.clear();
        amazonPage.amazonAramaKutusu.sendKeys("Java" + Keys.ENTER);
        ReusableMethods.bekle(10);
        //arama sonuclarının 1000'den fazla oldugunu dogrulayın
        aramaSonucYazisi=amazonPage.aramasonucuElementi.getText() ;
        String [] sonucArr= aramaSonucYazisi.split(" ");
        String javaSonucSayisiStr=sonucArr[3];
        javaSonucSayisiStr=javaSonucSayisiStr.replaceAll("\\W","");
        int sonucSayisiInt=Integer.parseInt(javaSonucSayisiStr);
        softAssert.assertTrue(sonucSayisiInt>1000);
        softAssert.assertAll();
        Driver.closeDriver();
    }
}
