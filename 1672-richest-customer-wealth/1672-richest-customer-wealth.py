class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        output: int = 0
        for i in range(len(accounts)):
            tmp: int = 0
            for j in accounts[i]:
                tmp += j
            output = max(output, tmp)
        return output