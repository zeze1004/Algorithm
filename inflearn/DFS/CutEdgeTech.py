# 철수는 바둑이를 데리고 시장에 가려고 함. 그런데 그의 트럭은 c킬로그램 넘게 태울 수 x
# 철수는 c를 넘지 않으면서 바둑이들을 가장 무겁게 태우고 싶다
# n마리의 바둑이와 각 바둑이의 무게 w가 주어지면, 철수가 트럭에 태울 수 있는 가장 무거운 무게를 구하는 프로그램을 작성하라

# 부분집합을 사용해서 풀면 ㅇㅋ

def DFS(index, sum, check_sum):
    global weight_result

    # 현재 값한 바둑이 몸무게와 전체에서 포함됐든 안됐든 check한 바둑이 몸무게를 뺀 값을 더해도 최종값 보다 작다면
    # 계속 계산할 이유가 없으니 빨리 종료시킨다(연산속도 증가)
    if sum + (total - check_sum) < weight_result:
        return

    # 무게보다 크면 종료, 무게보다 작은 값 출력
    if sum > weight:
        return
    if index == dog_num:
        if sum > weight_result:
            weight_result = sum
    else:
        DFS(index + 1, sum + weight_list[index],
            check_sum + weight_list[index])
        DFS(index + 1, sum, check_sum + weight_list[index])


if __name__ == "__main__":
    weight, dog_num = map(int, input().split())
    weight_list = [0] * dog_num
    weight_result = 0
    for i in range(dog_num):
        weight_list[i] = int(input())
    total = sum(weight_list)
    DFS(0, 0, 0)

    print(weight_result)

'''
▣ 입력예제 1
259 5
81
58
42
33
61

▣ 출력예제 1
242
'''
