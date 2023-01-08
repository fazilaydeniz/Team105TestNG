package tests.day14_testNGFramework;

import org.testng.annotations.Test;

public class C02_DependsOnMethods {
    @Test
    public void ilkTest(){
        System.out.println("İlk test çalıştı");
    }
    @Test (dependsOnMethods ="ilkTest")
    public void ikinciTest(){
        System.out.println("İkinci test çalıştı");
    }
    @Test (dependsOnMethods ="ikinciTest")
    public void ucuncuTest(){
        System.out.println("Üçüncü test çalıştı");
    }
}
