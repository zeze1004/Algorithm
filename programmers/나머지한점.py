def solution(v):
    answer = []
    # x값 구하기
    if v[0][0] == v[1][0]:
        answer.append(v[2][0])
    elif v[0][0] == v[2][0]:
        answer.append(v[1][0])
    elif v[1][0] == v[2][0]:
        answer.append(v[0][0])

    # y값 구하기
    if v[0][1] == v[1][1]:
        answer.append(v[2][1])
    elif v[0][1] == v[2][1]:
        answer.append(v[1][1])
    elif v[1][1] == v[2][1]:
        answer.append(v[0][1])

    return answer