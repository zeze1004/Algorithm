'''
N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두 개의 부분집합으로 나누었을 때
두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 “YES"를 출력하고, 그렇지 않으면
”NO"를 출력하는 프로그램을 작성하세요.
둘로 나뉘는 두 부분집합은 서로소 집합이며, 두 부분집합을 합하면 입력으로 주어진 원래의
집합이 되어 합니다.
예를 들어 {1, 3, 5, 6, 7, 10}이 입력되면 {1, 3, 5, 7} = {6, 10} 으로 두 부분집합의 합이
16으로 같은 경우가 존재하는 것을 알 수 있다.
'''


def DFS(index, sum):
    if index == num:
        if sum == (total - sum):  # 두 개의 부분집합으로 나눴을 때 선택하지 않은 원소들이랑 합이 같으면 종료
            print("YES")
            exit(0)
    else:
        DFS(index + 1, sum + arr[index])
        DFS(index + 1, sum)


if __name__ == "__main__":
    num = int(input())
    arr = list(map(int, input().split()))
    total = sum(arr)
    DFS(0, 0)
    print("NO")
