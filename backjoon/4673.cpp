#include <iostream>
using namespace std;
#define N 10001 // 0~10000
bool arr[N];
// return 값이 있으면 생성자
int self_num(int n) {
    int sum = n;
    while (1) {
        if(n == 0) 
            break;
        sum += n % 10;      // 끝자리
        n = n / 10;         // 자리 수 줄여나가기
    }
    return sum;
}

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    for(int i = 1; i <= 10000; i++) {
        int n = self_num(i);
        if(n > 0) {         // return sum이 될 경우
            arr[n] = true;  // 셀프 넘버가 아니면 true
        }
    }
    // 출력
    for(int i = 1; i <= 10000; i++) {
        if(!arr[i])
            cout << i << '\n';
    }
    return 0;
}