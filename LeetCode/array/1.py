class Solution:
    # 완전탐색
    def twoSum1(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]

    # in을 이용한 탐색
    # in의 시간 복잡도는 O(n)이어서 위의 완탐과 동일하게 O(n^2)이나 같은 시간 복잡도여도 in 연산이 훨 빠르다 함
    def twoSum2(self, nums: List[int], target: int) -> List[int]:
        for i, n in enumerate(nums):
            complement = target - n
            
            if complement in nums[i + 1:]:
                #return nums.index(n), nums.index(complement)   # 중복 값 나올 때 index 같은걸로 return할 수 있음
                return nums.index(n), nums[i:].index(complement) + (i + 1) # i까지 잘렸으니깐 i + 1 더해주기

# target을 뺀 결과 키 조회(딕셔너리)
# 딕셔너리는 해시테이블로 구성 되어 있으므로 O(1) 조회 가능
# 아래 코드의 시간복잡도는 평균 O(1), 최악의 경우 O(n)
def twoSum3(self, nums: List[int], target: int) -> List[int]:
        nums_map = {}
        
        # 키와 값을 바꿔서 딕셔너리로 저장
        for i, num in enumerate(nums):
            nums_map[num] = i
        print(nums_map)
        # 타겟에서 첫 번째 수를 뺀 결과를 키로 조회
        for i, num in enumerate(nums):
            if target - num in nums_map and i != nums_map[target - num]: # i != nums_map[target - num]는 중복되는 원소의 index를 피할려고
                return nums.index(num), nums_map[target - num]           # 인덱스 출력