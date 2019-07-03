package com.yash.siddiqui;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MYtestNG {
    @Test
    public void testSum() {
        // we need to create an object in order to use them
        SoftAssert sa = new SoftAssert();
 
        System.out.println("\nRunning Test -> testSum");
        int result = 3;
        // we need to use that object when we are calling them
        sa.assertEquals(result, 5);
        sa.assertAll();

}
    
    
    @Test
    public void testSum1() {
        // we need to create an object in order to use them
        SoftAssert sa = new SoftAssert();
 
        System.out.println("\nRunning Test -> testSum");
        int result = 2;
        // we need to use that object when we are calling them
        sa.assertEquals(result, 2);
        sa.assertAll();

}
    
}