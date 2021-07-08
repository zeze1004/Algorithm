from collections import Counter
word = input()
if len(word) == 1:
    print(word.upper())
    exit(0)

word_list = []
for i in range(len(word)):
    word_list.append(word[i].upper())

counter = Counter(word_list)
result = counter.most_common(n = 2)

if result[0][1] == result[1][1]:
    print('?')
else:
    print(result[0][0])

    
