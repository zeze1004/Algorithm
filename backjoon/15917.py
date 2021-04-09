import sys
for i in range(int(input())):
    a = int(sys.stdin.readline())
    if '1' in str(bin(int(sys.stdin.readline()[:-1])))[3:]:
        print(0)
    else:
        print(1)
