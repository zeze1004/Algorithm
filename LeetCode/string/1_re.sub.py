# 정규 표현식
class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower() # 소문자로 만들기
        # s = re.sub('[ -=+,#/\?:^$.@*\"※~&%ㆍ!』\\‘|\(\)\[\<\>`\'…》]', '', s)
        s = re.sub('[^a-z0-9]','',s) # s의 특수문자, 숫자를 -> ''로 변환
        if s == s[::-1]:
            return True
        return False

# https://dojang.io/mod/page/view.php?id=2438