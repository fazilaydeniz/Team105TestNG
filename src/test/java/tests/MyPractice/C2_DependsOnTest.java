package tests.MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C2_DependsOnTest {

    @Test (priority = 1)
    public void test01(){
        //https://www.amazon.com/ adresine gidin.
        //1. Test : Amazon ana sayfaya gittiginizi test edin
        Driver.getDriver().get("https://www.amazon.com/ ");
        String expectedUrl="amazon.com";
        String actualURL=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualURL.contains(expectedUrl));
        Driver.closeDriver();
    }
    @Test (priority = 2, dependsOnMethods = "test01")
    public void test02(){
        //2. Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin arama yapin
        //ve aramanizin gerceklestigini Test edin
        Driver.getDriver().get("https://www.amazon.com/ ");
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        ReusableMethods.bekle(2);
        Assert.assertTrue(amazonPage.aramasonucuElementi.isDisplayed());
        Driver.closeDriver();
    }
    @Test (priority = 3, dependsOnMethods = "test02")
    public void test03(){
        //3.Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin $16.83
        //oldugunu test edin
        Driver.getDriver().get("https://www.amazon.com/ ");
        Driver.getDriver().findElement(By.xpath("(//div[@class='a-section a-spacing-base'])[1]")).click();


        Driver.closeDriver();

    }


}
