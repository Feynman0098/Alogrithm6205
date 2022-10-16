package leetcode.problem50;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class P1TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int key: map.keySet()){
                if (map.get(key) == target - nums[i]){
                    return new int[]{key, i};
                }
            }
            map.put(i, nums[i]);
        }
        return new int[2];
    }

    public static void main(String[] args) {

        int[] nums = new int[]{2,7,11,15};

        nums = twoSum(nums, 9);

        System.out.println(nums[0] + " | " + nums[1]);

    }


}
