class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, k, output, new ArrayList<>(), 0);
        
        return output.size();
    }

    public void backtrack(int[] nums, int k, List<List<Integer>> output, List<Integer> sub, int idx) {
        if (!sub.isEmpty()) {
            output.add(new ArrayList<>(sub));
        }

        for (int i = idx; i < nums.length; i++) {
            boolean isValid = true;
            for (Integer s : sub) {
                if (Math.abs(s - nums[i]) == k) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                sub.add(nums[i]);
                backtrack(nums, k, output, sub, i + 1);
                sub.remove(sub.size() - 1);
            }
        }
    }
}