#include <iostream>
#include <algorithm>
using namespace std;

int hansu(int n) {
    int count = 99; // 한수면 ++
    for(int i = 111; i <= n; i++) {
        int first = i / 100; // 100의 자리
        int second = i / 10 - first*10; // 10의 자리
        int third = i - first*100 - second*10; // 1의 자리
        if(first-second == second - third) { // 연속된 자리의 수가 등차수열인지 확인
            count++;
        }
    }
    return count;
}

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int n;
    cin >> n;
    if (n <= 110) {
        if( n < 100) {
            cout << n;
            return 0;
        } else cout << 99;
    return 0;
    } else {
        cout << hansu(n);
    }
}