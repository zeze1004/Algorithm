class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int zeroNum = 0;
        int output = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                zeroNum++;
                while (zeroNum > k) {
                    if (nums[start] != 0) {
                        start++;
                    } else {
                        zeroNum--;
                        start++;
                    }
                }
            }
            output = Math.max(output, end - start + 1); // end와 start가 동일하게 시작해서 차이를 주고자 1 더함
        }
        return output;    
    }
}
        