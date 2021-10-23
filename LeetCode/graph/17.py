class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        def dfs(index, alpabet):
            
            if index == len(digits):
                if len(alpabet) == len(digits):
                    answer.append(alpabet)
                    return
                return
            for i in dic[digits[index]]:
                dfs(index + 1, alpabet + i)
            
        
        path = ""
        answer = []
        dic = {
            "2" : "abc",
            "3" : "def",
            "4" : "ghi",
            "5" : "jkl",
            "6" : "mno",
            "7" : "pqrs",
            "8" : "tuv",
            "9" : "wxyz"
        }
        
        for i in range(len(digits)):
            for j in dic[digits[i]]:
                dfs(i + 1, path + j)
        
        return answer
        