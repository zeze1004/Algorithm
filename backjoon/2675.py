case_num = int(input())

for i in range(case_num):
    num, word = map(str, input().split())
    
    for j in range(len(word)):
        for k in range(int(num)):
            print(word[j], end = '')
    print()