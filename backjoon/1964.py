a = int(input())
num = 5
count = 7
if a == 1:
    print(5)
else:
    for i in range(2, a + 1):
        num += count
        count += 3

    print(num % 45678)
