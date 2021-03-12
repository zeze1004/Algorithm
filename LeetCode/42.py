class Solution:
    def trap(self, height: List[int]) -> int:
        if len(height) == 0:
            return 0

        water = 0
        # left와 right는 포인터
        left, right = 0, len(height)-1
        left_max, right_max = height[left], height[right]
        while left < right:

            left_max, right_max = max(height[left], left_max), max(
                height[right], right_max)
            print('left_max: ', left_max)
            print('right_max: ', right_max)

            # 더 높은 쪽을 향해 포인터 이동
            # 최대 지점에서 좌우 포인터가 서로 만나면서 종료
            if left_max < right_max:
                water += left_max - height[left]
                left += 1
            else:
                water += right_max - height[right]
                right -= 1

        return water
