game_num, win_num = map(int, input().split())

win_rate = (win_num * 100 // game_num)

# 99%면 더 증가할 수 x
if win_rate >= 99:
    print(-1)
    exit(0)

left, right = 0, 100
while left + 1 < right:
    mid = (left + right) // 2
    # print(mid)
    win_rate_tmp = ((win_num + mid) * 100 // (game_num + mid))
    # print(win_rate_tmp)
    if win_rate >= win_rate_tmp:
        left = mid
        # print('left')
    else:
        right = mid
        # print('right')

print(right)


# 완전탐색
# while win_rate == tmp:
#     game_num += 1
#     win_num += 1
#     count += 1
#     if game_num == win_num:
#         print(-1)
#         break

#     win_rate = (win_num * 100 // game_num)
#     if win_rate > tmp:
#         print(count)
#         break
