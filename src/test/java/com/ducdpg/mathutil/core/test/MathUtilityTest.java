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
    
    // 3 TEST CASE TRÊN KO ĐẸP, BAD SMELLS VÌ CHỈ KHÁC NHAU PHẦN DATA
    // TRONG NGHỀ KIỂM THỬ CÓ 1 KĨ THUẬT GỌI LÀ TÁCH HẲN DATA KIỂM THỬ RA 
    // 1 CHỖ, CHO DỄ NHÌN, DỄ QUẢN LÍ ĐƯỢC DATA THIẾU ĐỦ HAY KO
    
    // SAU ĐÓ TA ĐƯA BỘ DATA NÀY VÀO TRONG CÂU LỆNH SO SÁNH ASSERT()
    // QUA CÁC THAM SỐ (PARAMETER)
    // TỨC LLAF ASSERTEQUALS (EXPECTED, ACTUAL) LÀ 2 THAM SỐ
    // ỨNG VỚI BỘ DATA ĐƯỢC TÁCH RA
    //              120     5!
    //              720     6!
    //               24     4!
    //                6     3!
    //                2     2!
    //              ...
    
    //              MẢNG [5][2] {0, 1} {1, 1} {2, 2} {3, 6} {5, 120}
    // CODE NHÌN GỌN, PHÁT HIỆN ĐƯỢC THIẾU ĐỦ TEST DATA, TEST CASE
    // KĨ THUẬT TÁCH DATA KIỂM THỬ RA KHỎI CÂU LỆNH SO SÁNH -> ĐƯỢC GỌI
    // LÀ DDT - DATA DRIVEN TESTING - KIỂM THỬ THEO HƯỚNG TÁCH DATA RIÊNG RẼ
}
