#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n, sum;
    sum = 0;
    char ox;
    vector <char> v;
    cin >> n;
    for(int i = 0; i<n; i++) {
        /*
        cin >> ox;
        v.push_back(ox);
        if(v[i]==v[i+1]=='O'){
            sum++;
            sum += sum;
        }
        */
       while(1) {
           cin >> ox;
           v.push_back(ox);
           if(cin.eof()) 
            break; 
       }
    }
    cout << sum;


    return 0;
}
