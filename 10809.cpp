#include <iostream>
#include <string>
using namespace std;

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    string a;
    int aski[26];
    cin >> a;
    for(int i = 0; i < 26; i++) {
            aski[i] = 'a' + i;
    }
    for(int i = 0; i<a.size(); i++) {
        //cout << (int)a[i] << '\n'; //아스키코드 출력
        //b[i] = (int)a[i] - 97;  // a부터 순서대로 0,1,2,...출력
        for(int j = 0; j < 26; j++) {
            if(aski[j]==(int)a[i]) {
                aski[j] = i;
            } 
        }
    }
    for(int i =0; i<26; i++) {
        if(aski[i]>26) {
            aski[i] = -1;
        }
        if(i<25)
            cout << aski[i] << " ";
        else cout << aski[i];
    }

    return 0;
}