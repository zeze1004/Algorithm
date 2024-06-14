class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);

        int move = 0, need = 0; // 이동 횟수, 다음에 필요한 값
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) { // 정렬된 상태에서 이전 값이 그 다음 값보다 크단건 이전 값이 중복되어 필요한 값으로 업데이트 된 상태란 뜻
                need = nums[i - 1] + 1;   // nums[i] 는 nums[i - 1] 보다 1 커야함
                move += need - nums[i];   // 다음에 나와야할 수에서 num[i]를 빼서 이동값(차이)을 구할 수 있음
                nums[i] = need;
            }
        }
        
        return move;
    }
}