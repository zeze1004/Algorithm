class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        answer = []
        prev = []
        
        def dfs(elements, path):
            if len(path) == len(nums):
                answer.append(path[:])
                return
            
            for i in elements:
                next = elements[:]
                next.remove(i)
                prev.append(i)
                dfs(next, prev)
                prev.pop()
                
        dfs(nums, prev)
        
        return answer
                
                
            
        