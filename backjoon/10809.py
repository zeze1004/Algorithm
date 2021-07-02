

word = input()

excepttion_list = []


dic = {}
for i in 'abcdefghijklmnopqrstuvwxyz':
    dic[i] = -1

for i in range(len(word)):
    if word[i] in dic.keys() and word[i] not in excepttion_list:
        dic[word[i]] = i
        excepttion_list.append(word[i])

for i in dic.values():
    print(i, end=' ')