x, y = map(int, input().split())
a = x
b = y
while(a!=b):
  if(a>b) : a-=b
  else    : b-=a

print(a)
print(x * y // a)