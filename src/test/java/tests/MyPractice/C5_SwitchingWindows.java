package tests.MyPractice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C5_SwitchingWindows {



    // ve sayfa uzerinde h1 tag'inda "Elemental Selenium" yazisi oldugunu test edin
    @Test
    public void test01(){

        // https://the-internet.herokuapp.com/iframe adresine gidin
        Driver.getDriver().get("https://the-internet.herokuapp.com/iframe");

        // elemental selenium linlkine tiklayin
        Driver.getDriver().findElement(By.linkText("Elemental Selenium")).click();

        // title'i "Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro"
        // olan yeni window'a gecis yapin
        ReusableMethods.switchToWindow("Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro");

        // ve sayfa uzerinde h1 tag'inda "Elemental Selenium" yazisi oldugunu test edin
        String expectedYazi= "Elemental Selenium";
        String actualYazi= Driver.getDriver().findElement(By.tagName("h1")).getText();

        Assert.assertEquals(actualYazi,expectedYazi);

        ReusableMethods.bekle(2);
        Driver.getDriver().quit();
    }
}
