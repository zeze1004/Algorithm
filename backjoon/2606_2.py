from collections import defaultdict
com_num = int(input())
link_num = int(input())
link = defaultdict(list)
for _ in range(link_num):
    a, b = map(int, input().split())
    link[a].append(b)
    link[b].append(a)
# print(link)

def dfs(num):
    for i in link[num]:
        if i not in link[1]:
            link[1].append(i)
            dfs(i)

for i in link[1]:
    # print(i)
    for j in range(len(link[i])):
        if link[i][j] not in link[1] and link[i][j] != 1:
            link[1].append(link[i][j])
            dfs(link[i][j])


print(len(link[1]))



