def solution(progresses, speeds):

    answer = []
    time = 0
    bapo = 0

    # 리스트 empty 될 때까지 반복
    while progresses:
        # 완성 시
        if (progresses[0] + time*speeds[0]) >= 100:
            progresses.pop(0)
            speeds.pop(0)
            bapo += 1  		# 작업이 완료 됐으므로 배포 개수 증가
        # 미완성 시
        else:
            if bapo > 0:  # 현재 작업은 미완성이지만 앞서 작업이 완료 된 게 있을 시
                answer.append(bapo)
                bapo = 0
            time += 1
    answer.append(bapo)  # 마지막 배포 추가
    return answer


progresses = list(map(int, input().split()))
speeds = list(map(int, input().split()))

solution(progresses, speeds)
