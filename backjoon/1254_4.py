from collections import deque

word = input()

if word == word[::-1]:
    print(len(word))
    exit(0)

compare_list = deque()
compare_list.append(word)


while word != word[::-1]:
    for i in word:
        compare_list.appendleft(i)
        compare_word 
        if compare_list == compare_list:
            print(len(compare_list))
            exit(0)

        
        

    

    