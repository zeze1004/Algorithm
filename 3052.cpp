#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    vector <int> v;
    int n, a;
    int num=0;
    ;
    for(int i =0; i < 10; i++) {
        cin >> a;
        v.push_back(a);
        v[i] = v[i]%42;
    }
    sort(v.begin(),v.end());
    /*
    for(int i =0; i < 10; i++){
        cout << v[i] << '\n';
    }
    */
    // cout << "unique" << '\n';
    v.erase(unique(v.begin(), v.end()), v.end());
    /*
    for(int i =0; i <v.size(); i++){
        cout << v[i] << '\n';
    }
    */
    cout << v.size();

    return 0;
}