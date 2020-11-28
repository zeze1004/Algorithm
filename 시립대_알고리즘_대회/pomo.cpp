#include <iostream>
using namespace std;

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int m,a,b;
    cin >> m >> a >> b;

    if(m <= a) {
        cout << m;
        return 0;
    }
    if(m <= b) {
        cout << a;
        return 0;
    }

    int num = m % (a+b);
    for(int i = 1; i <= m; i++) {
        if((a+b)*i + num == m) { // 후잉
            //cout << (a+b)*i + num - b*i; //???????????????????????
            if((a+b)*i + a < m && (a+b)*i + b > m ) {
                cout << (a+b)*i + a - (b*i);
                return 0;
            }
            else {
                cout << (a+b)*i + num - b*i;
                return 0;
            }
            
        }
        // num이 m이 되는 경우, m보다 작은 a,b지만 안나눠질 때  
        else {
            if(a+b > m) {
                cout << a;
                return 0;
            }
        }
        
    }
}