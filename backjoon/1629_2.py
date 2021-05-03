a, b, c = map(int, input().split())

def power(a, b):
    if b == 1:
        return a % c
    else:
        tmp = pow(a, b // 2)
        # b가 짝수면
        if b % 2 == 0:
            return tmp * tmp % c
        # 홀수면
        else:
            return tmp * tmp * a % c

print(power(a, b))
