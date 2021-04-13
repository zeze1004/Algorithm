import sys

test_num = int(sys.stdin.readline())
rank_arr = []

for _ in range(test_num):
    volunteer_num = int(input())
    count = 1
    rank_arr = []
    for _ in range(volunteer_num):
        paper_rank, interview_rank = map(int,sys.stdin.readline().split())
        rank_arr.append([paper_rank, interview_rank]) # [[],[],[]]
    rank_arr.sort() # paper_score 기준으로 정렬
    # print(rank_arr)
    # rank_arr[0][1]: 배열 맨 앞의 지원자는 paper_rank가 1위이므로 무족권 합격
    low_interview_rank = rank_arr[0][1]
    for i in range(1, volunteer_num):
        if low_interview_rank > rank_arr[i][1]:
            low_interview_rank = rank_arr[i][1]
            count += 1
    print(count)