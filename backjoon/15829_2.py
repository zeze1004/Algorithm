num = int(input())
word = input()

output = 0

for i, alpha in enumerate(word):
    output += (ord(alpha) - 96) * (31 ** i)
print(output % 1234567891)