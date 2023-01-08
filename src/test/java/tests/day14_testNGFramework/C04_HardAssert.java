package tests.day14_testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C04_HardAssert {

    /*
    TestNG'de iki tane Assert class'ı vardır.
    1- JUnit'deki Assert class'ı ile aynı method'lara sahipdir.
    İlk FAILED olan Assert işleminde çalışmayı durdurur ve hata mesajı verir

    2.Assert class'ının adı SoftAssert oldugu ıcın ilkine HardAssert denmiştir.

    2- Assert Class'ı ise SoftAssert class'ıdır.
    SoftAssert biz raporla deyinceye kadar
    assertion'ları FAILED olsa  bile çalıştırmaya devam eder
    biz raporla dediğimizde çalışan assertion'lardan kaçının FAILED  olduğunu söyler
    ve FAILED olan assertion'  varsa raporla dedıgımız satırda calısmayı durdurur
     */
    @Test
    public void test01(){
        Assert.assertTrue(6>4);
        System.out.println("1.Assertion sonrası"); // Sadece 1 çalışır
        Assert.assertTrue(26>14);           //2 de sonuç false döndüğü için sonrakiler de çalışmaz artık.
        System.out.println("2.Assertion sonrası");  // Ben test düzelsin diye hepsini true'ya çevirdim
        Assert.assertEquals(6,6);
        System.out.println("3.Assertion sonrası");

    }
}
