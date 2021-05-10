class Solution:
    def longestPalindrome(self, s: str) -> str:
        # print(s[1:1]) # 걍 공백처리
        def expand(left, right):
            while left >= 0 and right < len(s) and s[left] == s[right]:
                # 중앙에서부터 left 포인터는 왼쪽으로 이동해서 right는 오른쪽으로 하나 이동해서 비교
                left -= 1
                right += 1
                
            
            # left -= 1 하고 while문에서 걸렸기 때문에 letf+1, right는 1 증가된 것이므로 그대로 return
            return s[left+1:right]
        
        # 해당 사항 없을 때 빠르게 리턴
        if len(s) < 2 or s == s[::-1]:
            return s
        
        result = ''
        # 슬라이딩 윈도우 우측이로 이동
        for i in range(len(s) - 1):
            # expand(i, i): 가운데 하나를 두고 팰린드롬 ex.babad
            # expand(i, i + 1): 가운데 두개를 두고 팰린드롬 ex.cabbad
            result = max(result, expand(i, i), expand(i, i+1), key = len)
        
        return result
        