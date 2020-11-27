#include <iostream>
#include <vector>
#include <numeric>
using namespace std;

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int n;
    int arr[1000];
    cin >> n;
    for(int i = 0; i < n; ++i)
        cin >> arr[i];
    
    bool isPalin = true;
    for(int i = 0; i < n/2 && isPalin; ++i) {
        if(arr[i] != arr[n-1-i])
            isPalin = false;
    }
    if(isPalin) {
        bool increasing = arr[0] < arr[1];
        bool isMixed = arr[0] == arr[1];
        for(int i = 1; i < (n%2 == 0 ? n/2-1 : n/2) && !isMixed; ++i) {
            if(increasing && arr[i] >= arr[i+1] ||
                !increasing && arr[i] <= arr[i+1]
            )
                isMixed = true;
        }
            if(isMixed)
                cout << 3;
            else if(increasing)
                cout << 1;
            else
                cout << 2; 
    } else
        cout << "D";

    return 0;
}