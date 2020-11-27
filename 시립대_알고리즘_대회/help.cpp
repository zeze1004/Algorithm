#include <iostream>
#include <vector>
#include <numeric>
using namespace std;

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int budget, num, input;
    vector <int> v;
    cin >> budget;
    cin >> num;
    for(int i = 0; i < num; i++) {
        cin >> input;
        v.push_back(input);
    }
    
    if (budget - 40 < accumulate(v.begin(), v.end(),0)) {
        cout << "impossible";
    } else cout << "possible";
    return 0;
}