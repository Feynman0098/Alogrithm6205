import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {
    public static void backtrack(
            int remain,
            LinkedList<Integer> comb,
            int start, int[] candidates,
            List<List<Integer>> results) {

        if (remain == 0) {
            results.add(new ArrayList<Integer>(comb));
            return;
        } else if (remain < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            comb.add(candidates[i]);
            backtrack(remain - candidates[i], comb, i, candidates, results);
            comb.removeLast();
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        LinkedList<Integer> comb = new LinkedList<Integer>();

        backtrack(target, comb, 0, candidates, results);
        return results;
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }
}
