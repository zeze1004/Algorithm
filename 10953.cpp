#include <iostream>
#include <vector>
using namespace std;

vector <int> v;
void sum(int a, int b) {
    v.push_back(a+b);
}
int main() {
    int n,a,b;
    char comma;
    cin >> n;
    for(int i = 0; i < n; i++) {
        cin >> a >> comma >> b;
        sum(a,b);
    }
    for(int i = 0; i < n; i++) {
        cout << v[i] << '\n';
    }

    return 0;
}