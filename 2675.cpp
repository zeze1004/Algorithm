#include <iostream>
#include <cstring>
using namespace std;

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n, case_n;
    string input;

    cin >> n;
    for(int i = 0; i < n; i++) {
        cin >> case_n;
        cin >> input;
        for(int j = 0; j < input.size(); j++) {
            for(int k =0; k < case_n; k++)
                cout << input[j];               
        }
        cout << '\n';
    }
    
 
    return 0;
}