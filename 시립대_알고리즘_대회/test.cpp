#include <iostream>
using namespace std;

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int arr[1000];
    int n;
    cin >> n;
    bool isPalin = true;
    // 배열에 원소 입력
    for(int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    // 팰린드롬 확인 구문
    for(int i = 0; i < n; i++) {
        if(arr[i] != arr[n-1-i]) {
            isPalin = false;
            cout << "is not Palin";
            break;
        } 
    }
    if(isPalin) {
        // cout << "is Palin";
        bool increasing = arr[0] < arr[1];
        bool isMixed = arr[0] == arr[1]; // 가운데로 갈수록 증가, 감소도 아닌 것

        // 증감 확인을 위해 가운데와 그 전 원소만 체크
        for(int i = 1; i < (n % 2 == 0 ? n/2-1 : n/2) && !isMixed; i++) {
            if(increasing && arr[i] >= arr[i+1] || // ex. 23232 -> increasing이지만 arr[1] >= arr[2]
               !increasing && arr[i] <= arr[i+1]) { // ex. 82528 -> increasing이 아니지만 arr[1] <= arr[2]
                isMixed = true;
            }
        }
        //길이가 3미만 혹은 1 또는 2가 아닌 팰린드롬
        if(isMixed)
            cout << "3";
        // 길이가 3이상, 중심으로 갈수록 증가
        else if(increasing)
            cout << "1";
        else // 길이가 3 이상, 중심으로 갈수록 감소
            cout << "2";
    } 

    return 0;
}