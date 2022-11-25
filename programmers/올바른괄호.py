def solution(s):
    tmp = []
    for i in s:
        if i == '(':
            tmp.append(i)
        else:
            if len(tmp) == 0:
                return False
            tmp.pop()

    return len(tmp) == 0