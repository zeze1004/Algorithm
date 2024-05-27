class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);

        int maxNum = nums[nums.length - 1];
        for (int i = 0; i <= maxNum; i++) {
            int count = 0;
            for (Integer n : nums) {
                if (i <= n) count++;
            }
            if (count == i) return count;
        }

        return -1;
    }
}