num = int(input())
# input_list = [list(map(str, input().split())) for _ in range(num)]

for i in range(num):
    input_list = list(map(str, input().split()))
    # print(input_list)
    flag = 0
    score = 0
    total_score = 0
    for j in range(len(input_list)):
        print(j)
        # 처음 O 시작
        if j == 'O' and flag == 0:
            flag = 1
            total_score += 1
            score = 1
        elif j == 'X':
            flag = 0
        # 연속된 O
        elif j == 'O' and flag == 1:
            flag = 1
            score += 1
            total_score += score
    print(total_score)
            
            
        
