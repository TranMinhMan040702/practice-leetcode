
import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidate = {2, 3, 5};
        List<List<Integer>> result = Solution.combinationSum(candidate, 8);
        System.out.println(result.toString());
    }
}

class Solution {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        func(target, 0, candidates, new ArrayList<>(), result);
        return result;
    }

    private static void func(int target, int index, int[] candidates, List<Integer> combinations, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(combinations));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            combinations.add(candidates[i]);
            func(target - candidates[i], i, candidates, combinations, result);
            combinations.remove(combinations.size() - 1);
        }
    }
}


// Example 1:

// Input: candidates = [2,3,6,7], target = 7
// Output: [[2,2,3],[7]]
// Explanation:
// 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
// 7 is a candidate, and 7 = 7.
// These are the only two combinations.
// Example 2:

// Input: candidates = [2,3,5], target = 8
// Output: [[2,2,2,2],[2,3,3],[3,5]]
// Example 3:

// Input: candidates = [2], target = 1
// Output: []




