import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        backtracking(output, nums, new ArrayList<>(), 0);

        return output;
    }

    public void backtracking(List<List<Integer>> output, int[] nums, List<Integer> subsets, int idx) {
        output.add(new ArrayList<>(subsets)); // output.add(subsets);를 하면 subsets을 직접 참조해 subsets 값이 바뀔 때 함께 바뀜. 따라서 값만 복사한 ArrayList를 넣어야 함

        for (int i = idx; i < nums.length; i++) {
            subsets.add(nums[i]);
            backtracking(output, nums, subsets, i + 1);
            subsets.remove(subsets.size() - 1);
        }
    }
}