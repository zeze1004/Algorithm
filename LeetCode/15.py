# 완전탐색 - 시간초과 코드
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        print(nums)
        result = []
        for i in range(0, len(nums) - 2):
            # 리스트에 중복된 값이 있을 수 있으므로 중복된 값은 건너 뛰어야 함
            if i > 0 and nums[i] == nums[i-1]:
                continue
            for j in range(i+1, len(nums) - 1):
                if j > i + 1 and nums[j] == nums[j-1]:
                    continue
                for k in range(j+1, len(nums)):
                    if k > j + 1 and nums[k] == nums[k-1]:
                        continue
                    if nums[i] + nums[j] + nums[k] == 0:
                        result.append((nums[i], nums[j], nums[k]))

        return result

# 투 포인트 - 통과


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()

        result = []

        for i in range(len(nums) - 2):
            # 리스트에 중복된 값이 있을 수 있으므로 중복된 값은 건너 뛰어야 함
            if i > 0 and nums[i] == nums[i-1]:
                continue

            # 투 포인터, i와 중복되지 않게
            left, right = i + 1, len(nums) - 1

            while left < right:
                sum = nums[i] + nums[left] + nums[right]

                if sum < 0:
                    left += 1
                elif sum > 0:
                    right -= 1

                else:
                    result.append((nums[i], nums[left], nums[right]))

                    # left, right 중복값 건너뛰기
                    while left < right and nums[left] == nums[left + 1]:
                        # 중복된 값이 몇 개나 나열 돼 있을지 모르므로 while문으로 1씩 증가
                        left += 1
                    while left < right and nums[right] == nums[right - 1]:
                        right -= 1

                    # 중복된 값 다음 값으로 이동
                    left += 1
                    right -= 1

        return result
