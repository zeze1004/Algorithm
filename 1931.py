meeting_num = int(input())
meeting_time = []


def meeting_max(meeting_time):
    count = 0
    start = 0

    for time in meeting_time:
        if time[0] >= start:
            # print(time[0])
            start = time[1]
            count += 1
    return count


for _ in range(meeting_num):
    start, end = map(int, input().split())
    meeting_time.append([start, end])

# start 기준으로 정렬 후 end로 정렬
# ex) (3,5),(3,6),(5,5),(5,10),(6,9)
#     (3,5),(5,5),(3,6),(6,9),(5,10) -> 시작과 끝이 같은 회의가 있을 경우 고려

# start 기준으로 정렬
meeting_time.sort(key=lambda x: x[0])
# end 기준으로 정렬
meeting_time.sort(key=lambda x: x[1])
# print(meeting_time)
print(meeting_max(meeting_time))
