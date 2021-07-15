num = int(input())
if num == 1:
    print(1)
    exit(0)
count = 1
for i in range(1, num + 1):
    count += 6 * i
    if count >= num:
        print(i + 1)
        exit(0)
    
