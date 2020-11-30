#include <iostream>
#include <cstring>
using namespace std;

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    string input;

    int arr[100] = {0};

    getline(cin, input);
    cout << "input" << '\n';

    for(int i = 0; i < sizeof(in); i++) {
        for(char j = 'A'; j <= 'Z'; j++) {
            if(input[i] == j) {
                arr[i]++;
                cout << "small input[i]: " << input[i] << '\n';
            } else cout << "small X" << '\n';
        }
        for(char k = 'a'; k <= 'z'; k++) {
            if(input[i] == k) {
                arr[i]++;
                cout << "big input[i]: " << input[i] << '\n';
            } else cout << "big X" << '\n';
        } 
    }
    // 최대값 원소 찾기
    int max = arr[0];
    for(int i = 1; i < 26; i++) {
        if(max > arr[i]) 
            max = arr[i];
        for(int j = i; j < 25;) {
            // 중복 체크
            if(max == arr[j])
                cout << "?";
                return 0;
        }
    }
    return 0;
}