import sys

a,b,c=map(int,sys.stdin.readline().split())

def pow(a):
    return a*a

while b:
    a = pow(a)
    b -= 1

print(a % c)