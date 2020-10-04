#include <iostream>
#include <string>
using namespace std;

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int sum,num,result,x,y;
    int i = 0;
    cin >> num;

    if(num < 10) {
        num = num * 10;
        //i++;
    }
    result = num;
    while (1)
    {
        x = result / 10;
        y = result % 10;
        sum = x + y;
        result = (y*10) + (sum%10);
        i++;

        if(result == num) {
            cout << i;
            break;
        }
    }
    

    return 0;
}
