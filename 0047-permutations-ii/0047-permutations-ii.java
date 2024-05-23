class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        // 정렬을 왜 해야하지?
        Arrays.sort(nums);
        backtrack(nums, output, new ArrayList<>(), new boolean[nums.length]);
        return output;
    }

    public void backtrack(int[] nums, List<List<Integer>> output, List<Integer> sub, boolean[] used) {
        System.out.println(sub.toString());
        if (sub.size() == nums.length) {
            output.add(new ArrayList<>(sub));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue; // 사용된 숫자면 pass
            // 중복 순열을 피하기 위한 조건
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) { 
                // System.out.println(nums[i] + " " + nums[i - 1]);
                continue;
            }
            sub.add(nums[i]);
            used[i] = true;
            backtrack(nums, output, sub, used);
            sub.remove(sub.size() - 1);
            used[i] = false;
        }
    }
}