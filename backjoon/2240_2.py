import sys

input = sys.stdin.readline

second, move_num = map(int, input().split())
jadu_tree = [0]
for i in range(1, second + 1):
    jadu_tree.append(int(input()))
# print(jadu_tree)
# get_jadu_num = [[가만히 있을 때 1번 나무에서 받은 자두,짝수 번 움직여서 1번 나무에서 받은 + 안 받은, 홀수 번 움직여서 2번 나무에서 받은 + 안 받은]]
jadu_bucket = [[0] * (move_num + 1) for _ in range(second + 1)]


# 1. 가만히 있을 때(1번 나무에서 받기)
# 2. 짝수 번 움직여서 1번 나무에서 받기
# 3. 홀수 번 움직여서 2번 나무에서 받기
# 4. 피해서 안 받거나 안 움직여서 안 받을 때

for tree_num in range(1, len(jadu_tree)):
    # 1.
    if jadu_tree[tree_num] == 1:
        jadu_bucket[tree_num][0] = jadu_bucket[tree_num - 1][0] + 1
    elif jadu_tree[tree_num] == 2:
        jadu_bucket[tree_num][0] = jadu_bucket[tree_num - 1][0]
    
    for moving in range(1, move_num + 1):
        # 1초에 하나 씩 떨어지니깐 자두 갯수보다 움직임이 더 많을 수 X
        if moving > tree_num:
            break
        # 2.
        if (jadu_tree[tree_num] == 1) and (moving % 2 == 0):
            jadu_bucket[tree_num][moving] = max(jadu_bucket[tree_num - 1][moving], jadu_bucket[tree_num - 1][moving - 1]) + 1
        # 3.
        elif (jadu_tree[tree_num] == 2) and (moving % 2 == 1):
            jadu_bucket[tree_num][moving] = max(jadu_bucket[tree_num - 1][moving], jadu_bucket[tree_num - 1][moving - 1]) + 1
        # 4
        else:
            jadu_bucket[tree_num][moving] = max(jadu_bucket[tree_num - 1][moving], jadu_bucket[tree_num - 1][moving - 1])

print(max(jadu_bucket[-1]))

