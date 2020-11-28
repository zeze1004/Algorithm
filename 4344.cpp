#include <iostream>
#include <vector>
#include <numeric>
#include <algorithm>
#include <cmath>
using namespace std;

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n,student,input,sum,check = 0;
    float avg, result;
    vector <float> v;
    cin >> n;
    for(int i = 0; i < n; i++) {
        cin >> student;
        v.clear(); // 벡터 초기화
        for(int j = 0; j < student; j++) {
            cin >> input;
            v.push_back(input);
        }
        for(int k = 0; k < student; k++) {
            avg = float(accumulate(v.begin(), v.end(), 0) / student);
            if(v[k] > avg) {
                check++;
            }
        }
        // 소수점 아래 3개만 출력
        cout << fixed;
        cout.precision(3);
        //cout << student << " ";
        cout << (float)check/student * 100 << "%" << '\n';
        check = 0; // 초기화
    }
    return 0;
}