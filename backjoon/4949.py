from sys import stdin

while True:
    stack = []
    sentence = stdin.readline().rstrip()
    
    if '.' == sentence:
        exit(0)
    for i in sentence:
        if i == '(' or i == '[':
            stack.append(i)
            # print(stack)
        elif i == ')':
            if len(stack) == 0:
                stack.append(i)
                break
            elif stack[-1] == '(':
                stack.pop()
            else:
                break
        elif i == ']':
            if len(stack) == 0:
                stack.append(i)
                break
            elif stack[-1] == '[':
                stack.pop()
            else:
                break


    if len(stack) == 0:
        print('yes')
    else:
        print('no')


