#include <iostream>
using namespace std;

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int num;
 
    cin >> num;
    
    for(int i = 0; i < num; i++) {
        for(int j = 1; j < num-i; j++) {
            cout << " ";
        }
        for(int k = 0; k <= i; k++) {
            cout << "*";
        }
        cout << '\n';
    }

   return 0;
}
