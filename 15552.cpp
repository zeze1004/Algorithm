#include <iostream>
using namespace std;

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int num, x, y;
    cin >> num;
    for (int i = 0; i < num; i++) {
        cin >> x >> y;
        cout << x + y << '\n';
    }

    return 0;
}