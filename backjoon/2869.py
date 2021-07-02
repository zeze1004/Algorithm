import sys

input = sys.stdin.readline 

A, B, C = map(int, input().split())

day = 1

# 도착지점과 동일하게 등반 
if (C - A) % (A - B) == 0: 
    day += (C - A) // (A - B)
# 도착지점 추월
else:
    day += (C - A) // (A - B) + 1

print(day)
    