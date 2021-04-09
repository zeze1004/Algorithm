#include <iostream>
using namespace std;

int main() {
    int output,n;
    output = 0;
    cin >> n;
    for(int i = 1; i <= n; i++) {
        output = output + i;
    }
    cout << output << endl;

    return 0;
}