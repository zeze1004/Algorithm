import sys
input = sys.stdin.readline

case = int(input())

stack = []

for _ in range(case):
    num = int(input())
    if num != 0:
        stack.append(num)
    else:
        stack.pop()
print(sum(stack))
