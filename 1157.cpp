#include <iostream>
#include <cstring>
using namespace std;
#define N 100 // 0~26

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    string input;

    int arr[N] = {0,};

    getline(cin, input);
    // 한 글자 입력 시 바로 대문자 출력   
    if(input.size() == 1) {
        if(input[0] < 97) { // 대문자일시
            cout << input;
        } else cout << (char)(input[0] - 32);
        return 0;
    }

    for(long unsigned int i = 0; i < input.size(); i++) {
        for(char j = 'A'; j <= 'Z'; j++) {
            if(input[i] == j) {
                int num = j - 65;
                arr[num]++;
            }  
        }
        for(char k = 'a'; k <= 'z'; k++) {
            if(input[i] == k) {
                int num = k - 97;
                arr[num]++;
            }  
        } 
    }

    int max_arr_num = 0; // 최대값을 가진 배열의 순서
    int max = arr[0];
    // 최대값 원소 찾기
    for(int i = 0; i < 26; i++) {
        if(max < arr[i]) {
            max = arr[i]; 
            max_arr_num = i;
        }
    }

    // 중복 체크
    for(int j = 0; j < 26; j++) {
        // max와 같은 수를 가졌으나 배열 순서는 다를 경우
        if(max == arr[j] && j != max_arr_num) {
            cout << "?";
            return 0;
        }
    }

    // 대문자 출력
    cout << (char)(max_arr_num+65) << '\n';
 
    return 0;
}