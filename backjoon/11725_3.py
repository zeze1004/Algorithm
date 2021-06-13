import sys
sys.setrecursionlimit(100001)

input = sys.stdin.readline

num = int(input())
tree1 = [[] for _ in range(num + 1)]
visited = [0 for _ in range(num + 1)]
table = {}
# print(tree1)
for _ in range(1, num):
    a, b = map(int, input().split())
    tree1[a].append(b)
    tree1[b].append(a)
# print(tree1)
def dfs(node):
    for i in tree1[node]:
        if visited[i] == 0:
            visited[i] = 1
            table[i] = node
            dfs(i)


for i in range(1, num + 1):
    for j in tree1[i]:
        if visited[j] == 0:
            visited[j] = 1
            table[j] = i
            dfs(j)

# 출력
for i in range(2, num + 1):
    print(table[i])


