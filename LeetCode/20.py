class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        table = {
            ')': '(',
            '}': '{',
            ']': '['
        }

        for i in s:
            if i not in table:
                stack.append(i)
            # 스택이 비어있지 않거나 테이블의 키값과 pop 값이 value로 일치하지 않으면 false
            elif not stack or table[i] != stack.pop():
                return False
        return len(stack) == 0
