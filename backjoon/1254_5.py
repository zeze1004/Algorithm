from collections import deque

word = list(input())
if word == word[::-1]:
    print(len(word))
    exit(0)
que = deque()


while True:
    for i in word:
        que.appendleft(i)
        compare_list = word + list(que)
        if compare_list == compare_list[::-1]:
            print(len(compare_list))
            exit(0)
