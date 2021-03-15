# 전위순회: 부모 -> 왼쪽 트리 노드 -> 오른쪽 트리 노드
# 중위순회: 왼쪽 -> 부모 -> 오른쪽
# 후휘순회: 왼쪽 -> 오른쪽 -> 부모

# 전위순회(대부분 전위순회 사용)
def DFS_1(num):
    if num > 7:
        return
    else:
        print(num)
        DFS_1(num * 2)
        DFS_1((num * 2) + 1)


# 중위순회
def DSF_2(num):
    if num > 7:
        return
    else:
        DSF_2(num * 2)
        print(num)
        DSF_2((num * 2) + 1)


# 후위순회(주로 병합정렬에서 사용)
def DSF_3(num):
    if num > 7:
        return
    else:
        DSF_3(num * 2)
        DSF_3((num * 2) + 1)
        print(num)


DFS_1(1)
