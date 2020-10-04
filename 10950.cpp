#include <iostream>
using namespace std;

int main() {
    int num, x, y;
    cin >> num;
    for(int i = 0; i < num; i++) {
        cin >> x >> y;
        //output[i] = x + y;
        cout << x + y << endl;
    }

    return 0;
}