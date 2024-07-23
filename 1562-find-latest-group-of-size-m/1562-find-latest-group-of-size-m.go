func findLatestStep(arr []int, m int) int {
    n := len(arr)
    if m == n {
        return n
    }

    group := make([]int, n+2)
    res := -1

    for i := 0; i < n; i++ {
        idx := arr[i]
        // left, right: 현재 위치의 왼쪽, 오른쪽에 있는 연속된 1의 길이
        left, right := group[idx-1], group[idx+1]
        groupSize := left + right + 1   // 다음 그룹 길이
        group[idx-left] = groupSize
        group[idx+right] = groupSize
        
        if left == m || right == m {
            res = i
        }
    }

    return res
}