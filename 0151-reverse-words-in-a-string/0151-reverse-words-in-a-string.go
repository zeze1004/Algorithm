func reverseWords(s string) string {
    s = strings.TrimSpace(s)           // 문자열 앞뒤에 공백을 제거
    output := strings.Fields(s)        // 공백을 기준으로 분리 return '[]string'

    // fmt.Println(reflect.TypeOf(output))
    
    for i := 0; i < len(output) / 2; i++ {
        tmp := output[i]
        output[i] = output[len(output) - 1 - i] 
        output[len(output) - 1 - i] = tmp
    }

    return strings.Join(output, " ")
}