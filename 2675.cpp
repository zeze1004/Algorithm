#include <iostream>
#include <cstring>
using namespace std;



int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n, case_n;
    char input[21];

   for(int i = 0; i < 1; i++) {
       cin >> n;
       if (n < 1 || n > 1000) {
           i--;
           continue;
       }
   }
    for(int i = 0; i<n; i++) {

        for(int q = 0; q < 1; q++) {
        cin >> case_n;
        if (case_n < 1 || case_n > 8) {
            i--;
            continue;
        }
    }
        
        //cout << strlen(input) << '\n';
        for(int q = 0; q < 1; q++) {
            cin >> input;
            if (strlen(input) < 1 || strlen(input) > 8) {
                i--;
                continue;
            }
        }
        for(int j = 0; j < case_n; j++) {
            for(int k =0; k < case_n; k++)
                cout << input[j];
                
        }
        cout << '\n';
    }
 
    return 0;
}