class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        answer = []
        
        def dfs(index, k, path):
            if k == 0:
                answer.append(path)
                return
            
            for i in range(index, n + 1):
                dfs(i + 1, k - 1, path + [i])
        
        dfs(1, k, [])
        
        return answer
        