import sys
from collections import deque

input = sys.stdin.readline

test_num = int(input())

for _ in range(test_num):
    que = deque()
    paper_num, goal = map(int, input().split())
    rank = list(map(int, input().split()))
    print(rank)
    
    