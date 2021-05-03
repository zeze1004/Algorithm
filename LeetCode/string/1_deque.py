import collections

class Solution:
    def isPalindrome(self, s: str) -> bool:
        new_s = collections.deque()
        
        for i in s:
            if i.isalpha(): # 글자, 숫자면 true 반환
                new_s.append(i.lower()) # 소문자 넣기
        while len(new_s) > 1:
            if new_s.popleft() != new_s.pop():
                return False
        return True