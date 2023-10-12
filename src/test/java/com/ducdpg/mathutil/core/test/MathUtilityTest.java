/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ducdpg.mathutil.core.test;

import com.ducdpg.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author giadu
 */
public class MathUtilityTest {

    // Test case #1 - Verify getFactorial(With n = 0)
    // Step/Procedure
    //      1. Given n = 0
    //      2. Call/Invoke getFactorial(n = 0)
    // Expected Result:
    //      The method must return 1 as the result of 0! = 1
    // Status: PASSED, FAILED chờ đến lúc runtime mới biết

    @Test
    public void VerifyFactorialGenRightArgument0ReturnOk(){
        assertEquals(1, MathUtility.getFactorial(0));
    }

    @Test
    public void VerifyFactorialGenRightArgument1ReturnOk(){
        assertEquals(1, MathUtility.getFactorial(1));
    }

    @Test
    public void VerifyFactorialGenRightArgument5ReturnOk(){
        assertEquals(120, MathUtility.getFactorial(5));
    }
}
