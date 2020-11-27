#include <iostream>
#include <vector>
#include <numeric>
using namespace std;

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int num, input;
    vector <int> v;
    cin >> num;
    for(int i = 0; i < num; i++) {
        cin >> input;
        v.push_back(input);
        int tmp = input;
        if(v[i+1] > tmp) {
            
        }
    }


    return 0;
}