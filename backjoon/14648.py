n, q = map(int, input().split())

arr = list(map(int, input().split()))
query_arr = []

for i in range(q):
    query_arr.append(list(map(int, input().split())))

for i in range(q):
    if query_arr[i][0] == 1:
        new_arr = arr[query_arr[i][1]-1:query_arr[i][2]]
        print(sum(new_arr))
        tmp = arr[query_arr[i][1] - 1]
        arr[query_arr[i][1] - 1] = arr[query_arr[i][2] - 1]
        arr[query_arr[i][2] - 1] = tmp
    else:
        new_arr1 = arr[query_arr[i][1]-1:query_arr[i][2]]
        new_arr2 = arr[query_arr[i][3]-1:query_arr[i][4]]
        print(sum(new_arr1) - sum(new_arr2))
