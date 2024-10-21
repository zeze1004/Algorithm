class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, zeroNum = 0, maxNum = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroNum++;
                while (zeroNum > 1) {
                    if (nums[left] != 0) {
                        left++;
                    } else {
                        zeroNum--;
                        left++;
                    }
                }
            }

            maxNum = Math.max(maxNum, right - left + 1);
        }

        return maxNum - 1;
    }
}