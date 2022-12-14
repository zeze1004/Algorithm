def solution(brown, red):
    total = brown + red
    for sero in range(3, total):    # red가 한 칸 있으려면 세로 최소 길이는 3
        garo = total / sero         # 가로 길이 = 전체 칸 수 / 세로 길이
        if (garo * sero == total) and (garo - 2) * (sero - 2) == red:
            return [garo, sero]
