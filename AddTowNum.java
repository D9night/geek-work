package com.geek.work;
import	java.util.HashMap;
import java.util.Map;

/**
 * 两数相加
 *
 * @author Liuxs
 * @version V1.0.0
 * @date 2020-03-07 11:11 PM
 */
public class AddTowNum {


    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;

    }

    public int[] twoSumS(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<> ();
        for (int i = 0; i < nums.length; i++) {
            int compareNum = target - nums[i];
            if (map.containsKey(compareNum)) {
                return new int[] {map.get(compareNum), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }




    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,7,9};
        int target = 12;
        AddTowNum test = new AddTowNum();
        int[] result = test.twoSumS(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
