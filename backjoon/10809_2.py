word = input()

dict = {}
flag = []

for i in 'abcdefghijklmnopqrstuvwxyz':
    dict[i] = -1

for i in range(len(word)):
    for key in dict:
        if word[i] == key and word[i] not in flag:
            dict[key] = i
            flag.append(word[i])

for key in dict.keys():
    print(dict[key], end = ' ')
