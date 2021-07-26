from collections import deque

num = int(input())
word_list = [input() for _ in range(num)]

# 문자길이로 정렬
word_list.sort(key = lambda x:(len(x), x))
compare_list = []

for word in word_list:
    if word not in compare_list:
        compare_list.append(word)
        print(word)
