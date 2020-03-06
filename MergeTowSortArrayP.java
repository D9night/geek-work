package com.geek.work;

/**
 * 合并两个有序数组 时间复杂度为n+2m
 *
 * @author Liuxs
 * @version V1.0.0
 * @date 2020-03-06 10:13 PM
 */
public class MergeTowSortArrayP {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n < 1) return;
        if (m > 0) {
            for (int i = m + n - 1; i > n - 1; i--) {
                nums1[i] = nums1[i - n];
            }
        }
        int j = 0;
        int k = n;
        for (int i = 0; i < m + n; i++) {
            if (j > n - 1 || (k < n + m && nums1[k] < nums2[j])) {
                nums1[i] = nums1[k];
                k++;
            } else {
                nums1[i] = nums2[j];
                j++;
            }
        }
    }

    public static void main(String[] args) {
        MergeTowSortArrayP test = new MergeTowSortArrayP();
        int[] a = {1,2,4,5,5,0};
        int[] b = {11};
        test.merge(a, 5, b, 1);
        for (int aa: a) {
            System.out.println(aa);
        }
    }
}
