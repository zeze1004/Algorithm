class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int tmp = 0, output = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                tmp = nums[i + 1];
                nums[i + 1] = nums[i] + 1;
                output += nums[i + 1] - tmp;
            }
        }
        
        return output;
    }
}