T = int(input())
arr = []
for i in range(T):
    n, s, e, k = map(int, input().split())
    arr = list(map(int, input().split()))
    arr = arr[s-1:e]  # ex) s = 2, e = 5일 시 리스트 인덱스는 1번과 4번을 가리킨다.
    # 오름차순 정렬
    arr.sort()
    print('#', end='')
    print(i+1, arr[k-1], sep=' ')
