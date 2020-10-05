

#include <iostream>
using namespace std;

int hansu(int n) {

    int count = 0;
    int arr[3];

    for(int i = 100; i <= n; i++) {
        arr[0] = i / 100;
        cout << arr[0];
        arr[1] = (i / 100) / 10;
        cout << arr[1];
        arr[2] = i % 10;
        cout << arr[2];
        if((arr[0]+arr[2])==arr[1]*2) {
            count ++;
            cout << "why??" << '\n';
        }
    }
    return count+99;
}


int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n;
    cin >> n;
    if(n >= 100) {
        int count = hansu(n);
        cout << count;
    } 
    else {
        cout << n;
    }

    return 0;
}