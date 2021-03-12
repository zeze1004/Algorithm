class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        # 0, 2, 4,... 2칸씩 뛰어서 더함
        return sum(sorted(nums)[::2])
