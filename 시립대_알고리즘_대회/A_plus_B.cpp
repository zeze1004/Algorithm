#include <iostream>
#include <vector>
using namespace std;

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int num, input;
    vector <int> v;
    cin >> num;
    // cout << num;
    for(int i = 0; i < num*2; i++) {
       cin >> input;
       v.push_back(input);
       if((i+1) % 2 == 0) {
           cout << v[i-1] + v[i] << '\n';          
       }
    }
    return 0;
}