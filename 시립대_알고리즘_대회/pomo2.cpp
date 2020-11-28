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
    int num = m % (a+b);
    if(num == m) {
        cout << a;
        return 0;
    }
    for(int i = 1; i <= m; i++) {
        if((a+b)*i + num == m) { // 후잉
            if(a < num && b >= num ) {
                //cout << '1' << '\n';
                cout << (a+b)*i + a - (b*i); //????
                return 0;
            }
            else if(a > num && b >= num ) { //????
                cout << (a+b)*i + num - (b*i); //????
                return 0;
            }
            else {
                //cout << '3' << '\n';
                cout << (a+b)*i + num - b*i; // a > num && b < num
                return 0;
            }
            
        } 
    }
}
