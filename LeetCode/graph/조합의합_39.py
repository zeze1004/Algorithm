class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        answer = []
        
        
        def dfs(sum, index, path):
            if sum == 0:
                answer.append(path)
                return
            if sum < 0:
                return
            
            for i in range(index, len(candidates)):
                dfs(sum - candidates[i], i, path + [candidates[i]])
                
        
        
        dfs(target, 0, [])
        
        return answer
        