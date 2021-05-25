import sys

input = sys.stdin.readline
sys.setrecursionlimit(10 ** 6)

people_num = int(input())
start, end = map(int, input().split())
line_num = int(input())

tree = [[] for _ in range(people_num + 2)]
table = {}
check = [False] * (people_num + 2)

def dfs(v):
    check[v] = True
    for i in tree[v]:
        if not check[i]:
            # print(i)
            table[i] = v
            dfs(i)

for _ in range(line_num):
    a, b = map(int, input().split())
    tree[a].append(b)
    tree[b].append(a)
print(tree)

dfs(1)


for i in range(len(check)):
    if check[i] == False:
        dfs(i)

print(table)

count = 1
# 출력

for i in range(2, people_num - 1):
    tmp = table.get(start)
    if table[tmp] == table.get(end):
        print(count)
        break
    else:
        count += 1

# for key, value in table.items():
#     tmp = table.get(start)
#     if tmp == end:
#         count += 1
#         print(count)
#     elif table
        
    


# for i in range(2, num + 1):
#     if i in table:
#         print(table[i])