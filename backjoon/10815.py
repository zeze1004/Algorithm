card_num = int(input())

have_card = list(map(int, input().split()))
have_card.sort()

question_card_num = int(input())

question_card = list(map(int, input().split()))

for i in question_card:
    left, right, result = 0, card_num - 1, False
    while left <= right:
        mid = (left + right) // 2
        if have_card[mid] == i:
            result = True
            break
        elif have_card[mid] < i:
            left = mid + 1
        else:
            right = mid - 1
    if result:
        print(1, end=' ')
    else:
        print(0, end=' ')
