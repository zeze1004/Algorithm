class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int zero = 0;
        int output = 0;
        
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                zero++;
                while (zero > k) {
                    if (nums[start] == 0) {
                        zero--;
                        start++;
                    } else {
                        start++;
                    }
                }
            }

            output = Math.max(output, end - start + 1);
        }

        return output;
    }
}
        