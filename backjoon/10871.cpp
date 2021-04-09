#include <iostream>
using namespace std;

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N, A[N], X;
    cin >> N >> X;
    for(int i = 0; i < N; i++) {
        cin >> A[i];
        if (A[i] < X) {
            cout << A[i] << " ";
        }
    }    



    return 0;
}
