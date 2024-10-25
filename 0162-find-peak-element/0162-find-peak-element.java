class Solution {
    public int findPeakElement(int[] nums) {
        // Peek Element: 양 옆의 수보다 큰 수
        // Peek Element는 nums 내에 여러 개일 수 있고 그 중 하나의 인덱스만 리턴하면 정답

        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return right;
    }
}