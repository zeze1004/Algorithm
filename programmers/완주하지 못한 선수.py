from collections import Counter


def solution(participant, completion):
    # 차집합
    name = Counter(participant) - Counter(completion)
    # 완주하지 못한 선수는 단 한 명
    answer = list(name.keys())[0]
    return answer
