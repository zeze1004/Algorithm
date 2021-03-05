def divided(num, x, y):
    global count
    # Z 형식으로 숫자를 세야하므로 2x2 형태로 만든 후 숫자 세기
    if num == 2:
        # 왼쪽 위
        if y == row and x == column:
            print(count)
            return
        count += 1
        # 오른쪽 위
        if y == row and x + 1 == column:
            print(count)
            return
        count += 1
        # 왼쪽 아래
        if y + 1 == row and x == column:
            print(count)
            return
        count += 1
        # 오른쪽 아래
        if y + 1 == row and x + 1 == column:
            print(count)
            return

    # row, column 좌표의 위치에 따라 해당 숫자를 알기위해 조건에 따라 분할해야 함
    # 모두 계산하면 시간초과
    # else:
    # divided(num // 2, x, y)
    # divided(num // 2, x, y + num // 2)
    # divided(num // 2, x + num // 2, y)
    # divided(num // 2, x + num // 2, y + num // 2)
    else:
        num_2 = num // 2
        # 왼쪽 위
        if x + num_2 > column and y + num_2 > row:
            divided(num_2, x, y)
        # 오른쪽 위
        elif x + num_2 <= column and y + num_2 > row:
            count += num_2 * num_2
            divided(num_2, x + num_2, y)
        # 왼쪽 아래
        elif x + num_2 > column and y + num_2 <= row:
            count += 2 * num_2 * num_2
            divided(num_2, x, y + num_2)
        # 오른쪽 아래
        elif x + num_2 <= column and y + num_2 <= row:
            count += 3 * num_2 * num_2
            divided(num_2, x + num_2, y + num_2)


if __name__ == '__main__':
    num, row, column = map(int, input().split())
    count = 0
    divided(2 ** num, 0, 0)
