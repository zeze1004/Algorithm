card_num, max_num = map(int, input().split())

card = list(map(int, input().split()))

tmp_list = []
output_list = []

for i in range(len(card)):
    for j in range(i + 1, len(card)):
        for k in range(j + 1, len(card)):
            tmp_list.append(card[i] + card[j] + card[k])

for i in tmp_list:
    if i <= max_num:
        output_list.append(i)
print(max(output_list))

                
