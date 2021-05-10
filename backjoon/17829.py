import sys
input = sys.stdin.readline

def cnn(arr, arr_size):
    # 4칸 만들기
    new_arr = [[] for _ in range(arr_size // 2)]
    if arr_size == 1:
        return print(arr[0][0])
    for i in range(0, arr_size, 2):
        for j in range(0, arr_size, 2):
            new_arr[i//2].append(sorted([arr[i][j], arr[i][j+1], arr[i+1][j], arr[i+1][j+1]])[2])
            # print(new_arr)
    return cnn(new_arr, arr_size//2)
    

    



arr_size = int(input())

arr = [list(map(int, input().split())) for _ in range(arr_size)]
cnn(arr, arr_size)