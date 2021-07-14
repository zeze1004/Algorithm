while True:
    word = input()
    if word == '0':
        exit(0)
    if word == word[::-1]:
        print('yes')
    else:
        print('no')
