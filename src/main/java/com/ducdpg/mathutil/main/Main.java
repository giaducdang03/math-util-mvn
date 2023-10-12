package com.ducdpg.mathutil.main;

import com.ducdpg.mathutil.core.MathUtility;

/**
 *
 * @author giadu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TEST CASE #1 - XEM CHI TIẾT Ở DƯỚI
        int n = 0; // given n = 0, ý là muốn tính 0!
        long expected = 1; // ý muốn là hàm n! = 0! phải trả về 1
        long actual = MathUtility.getFactorial(n); // ý nói rằng hàm chạy ra mấy, invoke, call
        
        //so sánh giữa expected vs. actual
        System.out.println(n+ "! -> expected: " + expected +
                " | actual = " + actual);
        
        //TEST CASE #2 - N = 1 -> XEM CHI TIẾT Ở DƯỚI
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println(n+ "! -> expected: " + expected +
                " | actual = " + actual);
        
        //TEST CASE #3 - N = 5 -> XEM CHI TIẾT Ở DƯỚI
        System.out.println("5! -> expected: 120" +
                " | actual = " + MathUtility.getFactorial(5));
        
    }
    
    // MÌNH LÀ DEV, MÌNH PHẢI TEST CODE CỦA MÌNH NGON TRƯỚC ĐÃ
    // MUỐN TEST CODE (DEV) HAY TEST APP (QC/TESTER) THÌ CẦN PHẢI CHUẨN BỊ
    // TEST CASE - TÌNH HUỐNG KIỂM THỬ, TH KIỂM THỬ - CÁCH TA 
    //             KIỂM THỬ TRONG 1 NGỮ CẢNH NÀO ĐÓ
    // 1 TEST CASE CÓ CẤU TRÚC NHƯ SAU:
    // ID | Description | Step/Procedures | Expected Result | Status (Pass/Failed)
    
    //DEV EM MÚN KIỂM THỬ COI HÀM CHÍNH EM VIẾT getFactorial() đúng hay sai
    // thì em phải thiết kế các tets case
    
    //Test case #1: Verify getFactorial(with n = 0)
    //Steps-Procedures: (Các bước run app để test)
    //      1. Given n = 0
    //      2. Execute/Call/Invoke function getFactorial(0)
    
    //Expected Result: the function must return 1 (stading for 0! = 1)
    //Status PASS, or FAILED, ai biết, chờ run hàm/app cái đã
    
    //RUN HÀM, RUN APP, ĐƯA TEST DATA VÀO, ĐƯỢC GỌI LÀ TEST RUN
    
    //TEST CASE #2: Verify getFactorial(with n = 1)
    //Step/Procedures: 
    //      1. Given n = 1
    //      2. Call/Invoke getFactorial(n = 1)
    
    //Expected Result:
    //      the method must return 1 in case of 1!
    //Status: PASS | FAILED
    
    //TEST CASE #3: Verify getFactorial(with n = 5)
    //Step/Procedures: 
    //      1. Given n = 5
    //      2. Call/Invoke getFactorial(n = 5)
    
    //Expected Result:
    //      the method must return 120 in case of 5!
    //Status: PASS | FAILED
    
}
