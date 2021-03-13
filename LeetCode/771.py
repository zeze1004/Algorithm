class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        result = {}
        count = 0
        for i in stones:
            if i in result:
                result[i] += 1
            else:
                result[i] = 1

        for i in jewels:
            if i in result:
                count += result[i]
        return count
