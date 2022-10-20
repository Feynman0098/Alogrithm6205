import java.util.*;

public class Permutations46 {

    public static void backtrack(int n,
                          ArrayList<Integer> nums,
                          List<List<Integer>> output,
                          int first) {
        if (n == first) {
            output.add(new ArrayList<>(nums));
            return;
        }
        for (int i = first; i < n; i++) {
            Collections.swap(nums, i, first);
            backtrack(n, nums, output, first+1);
            Collections.swap(nums, i, first);
        }

    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> num_list = new ArrayList<>();
        int n = nums.length;
        for (int i : nums) {
            num_list.add(i);
        }
        backtrack(n, num_list, res, 0);

        return res;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3};
        System.out.println(permute(nums));

    }
}
