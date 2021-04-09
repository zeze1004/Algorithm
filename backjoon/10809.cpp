#include <iostream>
#include <cstring>
#include <vector>
using namespace std;
#define N 100

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
        
    char *input1;
    int compare[N];
    string input2;
    for(int i = 0; i < 26; i++) {
        compare[i] = -1;
    }

    // 입력
    getline (cin, input2);

    for(int i = 0; i < 26; i++) {
        for(int j = 0; j < input2.size(); j++) {
            if((int)input2[j] - 97 == i) {
                // 중복체크
                if(compare[i] != -1) {
                    continue;
                } else compare[i] = j;  
            }
        }
    }
    for(int i = 0; i < 26; i++) {
        cout << compare[i] << " ";
    }
    return 0;
}