rope_num = int(input())
lope = []

for i in range(rope_num):
    lope.append(int(input()))

lope.sort(reverse = True)
# 로프가 들 수 있는 무게 * 로프의 개수 = 들 수 있는 제일 큰 무게 
for i in range(rope_num):
    lope[i] = lope[i] * (i + 1)

print(max(lope))
