import sys

input = sys.stdin.readline

num = int(input())
score_list = list(map(int, input().split()))

max_num = max(score_list)
total = max(score_list)

score_list.remove(max_num)

for i in range(len(score_list)):
    score_list[i] = score_list[i] / max_num * 100
    total += score_list[i]

score_list.append(max_num)
print(score_list)
print(total / num)
# sum_without_max = sum(score_list)

# sum_without_max += (max_num * 2)    

# print((sum_without_max + max_num) // num)
