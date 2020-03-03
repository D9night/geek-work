package com.geek.work;

/**
 * 删除排序数组中的重复项
 *
 * @author Liuxs
 * @version V1.0.0
 * @date 2020-03-03 9:45 PM
 */
public class Solution {

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int a = 0;
        int b = 1;
        while (b < nums.length) {
            if (nums[a] != nums[b]) {
                nums[a + 1] = nums[b];
                a++;
            }
            b++;
        }
        return a + 1;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }
}
