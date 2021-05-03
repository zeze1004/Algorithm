from itertools import combinations 

end_num, size = map(int, input().split()) 
combination = combinations(range(1, end_num + 1), size) 

for i in combination: 
    # print(*i)
    print(' '.join(map(str, i)))

