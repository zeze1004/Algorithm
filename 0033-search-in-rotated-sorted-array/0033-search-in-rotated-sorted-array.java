class Solution {
    public int search(int[] nums, int target) {
        // O(log n): 바이너리 서치 사용
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            // 정렬된 범위 구분
            // left ~ mid의 범위가 정렬된 상태
            if (nums[left] <= nums[mid]) {
                // 왼쪽 범위에 target이 있는지 확인
                if (nums[mid] >= target && nums[left] <= target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } 
            // mid ~ right의 범위가 정렬된 상태
            else if (nums[right] >= nums[mid]) {
                if (nums[mid] <= target && nums[right] >= target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}