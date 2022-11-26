def solution(progresses, speeds):
    left_day_list = []

    # 필요한 작업 일수 구하기
    for p, s in zip(progresses, speeds):
        left_progress = 100 - p

        if left_progress % s > 0:
            left_day = int(left_progress / s) + 1
        else:
            left_day = int(left_progress / s)
        left_day_list.append(left_day)

    # 배포 일정 구하기
    answer = []
    ans = 1
    pre_num = left_day_list.pop(0)
    while left_day_list:
        next_num = left_day_list.pop(0)
        if pre_num < next_num:
            pre_num = next_num
            answer.append(ans)
            ans = 1
        else:
            ans += 1
    answer.append(ans)

    return answer
