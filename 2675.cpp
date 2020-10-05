#include <iostream>
#include <string>
using namespace std;



int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n, case_n;
    string input;
    cin >> n;
    while(1) {
        if(n<1 || n>1000) {
            cin >> n;
        } else break;    
    }
    for(int i = 0; i<n; i++) {
        cin >> case_n;
        while(1) {
            if(case_n < 1 || case_n > 8) {
                cin >> case_n;
            } else break; 
        }
        cin >> input;
        while(1) {
            if(input.size() < 1 || input.size() > 20) {
                cin >> input;
            } else break;    
        }
        for(int j = 0; j < case_n; j++) {
            for(int k =0; k < case_n; k++)
                cout << input[j];
                
        }
        cout << '\n';
    }
 
    return 0;
}