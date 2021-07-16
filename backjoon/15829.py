num = int(input())
word = input()

output = 0

for i, alpha in enumerate(word):
    output += (31 ** i) * (ord(alpha) - 96)

print(output % 1234567891)