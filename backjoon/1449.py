num, tape_lenth = map(int, input().split())
leak_point = list(map(int, input().split()))
leak_point.sort() # 정렬 꼭 해주기
tape_num = 0
tape_end_point = 0
for i in leak_point:
    if i < tape_end_point:
        continue
    else:
        tape_num += 1
        tape_end_point = i + tape_lenth

print(tape_num)
