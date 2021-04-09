test_num = int(input())

for _ in range(test_num):
    count = 0
    # 6번째부터 패턴이 보임
    # triangle[i] = triangle[i-1] + triangle[i-5]
    triangle = [1, 1, 1, 2, 2]

    num = int(input())
    if num <= 5:
        print(triangle[num-1])
        continue
    for i in range(4, num):
        triangle.append(triangle[i] + triangle[count])
        count += 1
    print(triangle[num-1])
