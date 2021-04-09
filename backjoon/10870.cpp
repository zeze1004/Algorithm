#include <iostream>
using namespace std;

/***** for문으로 구현
int fib(int n) {
    int result = 0;
    if(n == 1)
        return 1;
    if(n == 0)
        return 0;
    else {
        int pp = 0, p = 1, result = 0, tmp = 0;;
        for(int i = 2; i <= n; i++) {
            result = p + pp;
            tmp = pp;
            pp = p;
            p = tmp + p;
            //printf("%d\n",result);
        }
        return result;
    }
}
*/

int fib(int n) {
    if(n == 1)
        return 1;
    if(n == 0)
        return 0;
    else 
        return fib(n-1) + fib(n-2);
}

int main() {
    int n;
    cin >> n;
    cout << fib(n);

    return 0;
}