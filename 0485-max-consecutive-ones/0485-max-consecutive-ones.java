class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0, output = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) sum++;
            else {
                output = Math.max(output, sum);
                sum = 0;
            }
        }
        output = Math.max(output, sum);

        return output;
    }
}