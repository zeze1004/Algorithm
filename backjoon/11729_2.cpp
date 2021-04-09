#include <iostream>
#include <math.h>
using namespace std;

void hanoi(int n, int from, int tmp, int to) {
    if(n==1) {
        cout << from << " " << to << '\n'; 
    }
    else {
        hanoi(n-1, from, to, tmp);
        cout << from << " " << to << '\n';
        hanoi(n-1, tmp, from, to);
    }
}
int main() {
    int n;
    cin >> n;
    // pow 출력은 실수형이므로 정수로 바꿔서 출력해야 정답
    cout << (int)pow(2,n)-1 << '\n';
    hanoi(n, 1, 2, 3);
    return 0;
}