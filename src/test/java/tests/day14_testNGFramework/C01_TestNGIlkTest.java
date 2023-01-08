package tests.day14_testNGFramework;

import org.testng.annotations.Test;

public class C01_TestNGIlkTest {
    /*
        TestNG test method'larini isim sirasina gore calistirir
        priority degeri verilen method'lar priority degeri kucukten buyuge dogru calisir
        esit olan priority degerlerinde harf sirasina gore calisir
        eger priority degeri yazmazsak priority=0 kabul edilir
     */

    @Test (priority = 6)
    public void ilkTest(){
        System.out.println("İlk test çalıştı");
    }
    @Test
    public void ikinciTest(){
        System.out.println("İkinci test çalıştı");
    }
    @Test (priority =-9)
    public void ucuncuTest(){
        System.out.println("Üçüncü test çalıştı");
    }
}
