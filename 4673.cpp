#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

#define N 10001 // 배열 arr[0 - 10000]이므로 10001
bool arr[N];

// 셀프넘버 판별 함수
int self_num_f(int n) {
    int sum = n;        // 먼저 자기자신 더하기

    while(1) {          // 각 자리수 숫자 더하기
        if(n == 0)
            break;      // n이 0이 되면 끝내기
        sum += n % 10;  // 1의 자리 더하기
        n = n / 10;     // 한 자리씩 없애기
    }
    return sum;
}

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    for(int i = 1; i < N; i++) {   
        int self_num = self_num_f(i);
        if(self_num <= N) // self_num() return의 값은 무조건 10000보다 작거나 같다
            arr[self_num] = true; // 셀프넘버가 아니면 true
    }
    // 출력
    for(int i = 1; i < N; i++) {
        if(!arr[i]) // false면 셀프넘버
            cout << i << '\n';
    }
    
    return 0;
}