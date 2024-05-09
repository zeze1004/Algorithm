# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
240509 데일리 문제
# Approach
<!-- Describe your approach to solving the problem. -->
##### [오답 이유]
정렬을 하지 않고 list에서 Max 값을 뽑고 해당 값의 인덱스를 찾고 제거했다.
그리고 list.max 값에 num을 뺀 값을 output에 더했다.
로직 자체는 맞으나 list 인덱스 조작 과정 때문에 시간초과가 났다.

- 리스트에서 최댓값을 찾는 작업: O(n)
- 최댓값의 인덱스를 찾는 작업: O(n)
- 리스트에서 원소를 제거하는 작업: O(n)

그리고 최악의 경우(k = n)면 k번의 순회를 할 때 O(n^2) 의 시간복잡도가 나와서 시간초과가 난다.

##### [수정 사항]
솔루션을 보고 내림차순 정렬을 한 후 list 인덱스의 처음부터 k번째만 순회하는걸 알게 됐다.
그리고 원소의 값이 0보다 작으면 안되므로 0보다 큰지 비교하는 구문을 추가했다.
`Math.max(list.get(i) - num, 0);`


# Complexity
- Time complexity: O(n)
