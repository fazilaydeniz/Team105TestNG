package tests.MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C1_YouTubeAssertions {

     //Bir class oluşturun: YoutubeAssertions
     //1) https://www.youtube.com adresine gidin
     //2) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
     //○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
     //○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
     //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
     //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin

    @Test
    public void titleTest(){
        Driver.getDriver().get("https://www.youtube.com");
        String expectedTitle="YouTube";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        Driver.closeDriver();

    }
    @Test
    public void imageTest(){
        Driver.getDriver().get("https://www.youtube.com");
        WebElement youtubeResmi=Driver.getDriver().findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]"));
        Assert.assertTrue(youtubeResmi.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void searchBoxTesti(){
        Driver.getDriver().get("https://www.youtube.com");
        WebElement searchBoxKutusu=Driver.getDriver().findElement(By.xpath("//input[@id='search']"));
        Assert.assertTrue(searchBoxKutusu.isEnabled());
        Driver.closeDriver();

    }
    @Test
    public void wrongTitleTesti(){
        Driver.getDriver().get("https://www.youtube.com");
        String expectedTitle="youtube";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertFalse(actualTitle.contains(expectedTitle));
        Driver.closeDriver();


    }

}
