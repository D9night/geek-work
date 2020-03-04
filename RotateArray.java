package com.geek.work;

/**
 * rotate-array
 *
 * @author Liuxs
 * @version V1.0.0
 * @date 2020-03-04 1:18 PM
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length < 2) return;
        k %= nums.length;
        for (int i = nums.length - 1; i > k - 1; i--) {
            exchange(nums, i, i - k);
        }
        if (nums.length % k == 0) return;
        rotateRight(nums, 0, nums.length - (nums.length % k) - 1, Math.abs(nums.length % k - k));

    }

    private void rotateRight(int[] nums, int start, int end, int k) {
        if (start >= end || k <= 0) return;
        for (int i = end;  i > k - 1 && i > start; i--) {
            exchange(nums, i , i - k );
        }
        if ((end + 1)% k == 0) return;
        rotateRight(nums,  start , end - end % k - 1, Math.abs((end + 1) % k - k));
    }

    /**
     * 置换两个位置的值
     * @param nums
     * @param a
     * @param b
     */
    private void exchange(int[] nums, int a, int b){
        int x = nums[a];
        nums[a] = nums[b];
        nums[b] = x;
    }

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate(nums, 4);
        for (int m:
             nums) {
            System.out.println(m);
        }
    }
}
