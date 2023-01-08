package tests.day14_testNGFramework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C05_SoftAssert {

    @Test (groups = "minireg1")
    public void test01(){
        SoftAssert softAssert=new SoftAssert();

        softAssert.assertEquals(6,6);//Passed
        System.out.println("1.Assertion sonrası");

        softAssert.assertTrue(5>3);    // Passed
        System.out.println("2.Assertion sonrası");

        softAssert.assertFalse(5>8);   //Passed
        System.out.println("3.Assertion sonrası");

        softAssert.assertAll();

    }
}
