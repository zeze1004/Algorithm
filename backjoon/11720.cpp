#include <iostream>

using namespace std;

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int n;
    int sum = 0;
    char ch;
    cin >> n;
    for(int i =0; i<n; i++) {
        cin >> ch;
        /*
        아스키코드에서 '0'은 48이고 '1','2',... 1씩 증가하므로
        '0'을 빼면 기존 정수를 구할 수 있다.
        ex. 2의 아스키 코드는 50, 50 - 48 = 2
        */
        sum += (ch - '0');
    }

    cout << sum;

    return 0;
}