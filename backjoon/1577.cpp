#include <iostream>
#include <string>
#include <vector>


using namespace std;

int main() {
    string input;
    int alpha[26] = {0,};
    cin >> input;

    for (int i = 0; i < input.size(); i++) {
        int n = input[i];
        // 소문자일 때
        if(input[i] >= 'a') {
            alpha[input[i]-97]++;
            //cout << alpha[input[i]-97]++ << " ";
        }
        // 대문자일 때
        else {
            alpha[input[i]-65]++;
        }
    }
    int max = 0; 
    int count = 0;
    char ch;

    for(int i = 0; i < 26; i++) {
        if(alpha[i] > max) {
            max = alpha[i];
            ch = i;
        }
    }
    for(int i = 0; i< 26; i++) {
        if(alpha[i] == max) {
            count++;
            if(count >= 2) {
                cout << "?" << '\n';
                return 0;
            }
        }
    }

    cout << ch << '\n';   
    return 0;
}
