import sys

input = sys.stdin.readline

num = int(input())

def dev(i):
    tmp_list = []
    tmp = i
    for j in range(1, i):
        if tmp < 10:
            tmp_list.append(tmp)
            if sum(tmp_list) + i == num:
                print(i)
                exit(0)
            else:
                return
        tmp_list.append(tmp % 10)
        tmp = tmp // 10
    


for i in range(1, 1000001):
    dev(i)
    if i > num:
        print(0)
        exit(0)
    

        
