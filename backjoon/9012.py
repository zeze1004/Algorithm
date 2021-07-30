import sys
input = sys.stdin.readline


num = int(input())

for _ in range(num):
    stack = []
    word = input().strip()
    for i in word:
        if i == '(':
            stack.append(i)
        else:
            if len(stack) == 0:
                stack.append(i)
                break
            elif stack[-1] == '(':
                stack.pop()
            else:
                break
    if len(stack) == 0:
        print('YES')
    else:
        print('NO')


    
    