package com.geek.work;

/**
 * 加1
 *
 * @author Liuxs
 * @version V1.0.0
 * @date 2020-03-08 12:54 PM
 */
public class AddOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] % 10 != 0) return digits;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
