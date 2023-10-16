package com.ducdpg.mathutil.core.test;

import com.ducdpg.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author giadu
 */
public class MathUtilityDDTTest {
    
    public static Object[][] initData(){
        Object[][] dataSet = {{0, 1}, 
                              {1, 1}, 
                              {2, 2}, 
                              {3, 6}, 
                              {5, 120}
                             };
        return dataSet;
    }
    
    // hàm sài data từ nơi khác đưa đến, mảng data đưa vào
    @ParameterizedTest
    @MethodSource("initData")
    public void verifyFactorialGivenRightArgumentReturnOk(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    
}
