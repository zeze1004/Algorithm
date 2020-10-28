#include <iostream>
#include <string>
#include <vector>
using namespace std;
// cin >> back
// 1 0 2 -1 -1 -1 -1 -1 -1 -1 3
int main() {
    string str;
    vector<int> v(26);
    //fill_n(v, 26, -1);  // 벡터 초기화
    vector<int> output;
    cin >> str;
    /*
     입력단어의 각 알파벳 순번이 자기 자신의 소문자 번호에 출력된다. 입력단어에 없는 소문자는 -1
     baebea -> 1 0 -1 -1 2 -1 -1 -1...
        v[98,97,102]
    */

    for(int i = 0; i < str.size(); i++) {
        //v.push_back(str[i]);
        cout << str[i] << "\n";
    }   
    for(int i = 0; i < 26; i++)
        if(v[i] < 97) {
            cout << -1 << " ";
        } else cout << v[i] - 97 << " ";
    
    return 0;
}