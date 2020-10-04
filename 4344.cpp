#include <iostream>
#include <vector>
#include <algorithm>
#include <numeric>
using namespace std;

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    /*
    1. 테스트 케이스 수만큼 첫 for문
    2. 학생 수 만큼 두 번째 for문
    3. 학생 점수 벡터에 저장하면서 더하기, 마지막 벡터 원소가 총 합
    4. v.back() /학생 수  (벡터는 float)
    5. 출력
    6. 벡터 초기화하고 두 번째 for문 탈주(초기화 안해도 될지도..?)
    */
   
    int n, score;
    float student,avg, count;
    count = 0.0;
    vector <float> v;

    cin >> n;
    for(int i =0; i<n; i++) {
        v.clear(); //벡터의 모든 원소 제거(초기화)
        cin >> student;
        cout << v[i] << " " ;
        for(int i =0; i< student; i++) {
            cout << '\n';
            cin >> score;
            v.push_back(score);
            avg = accumulate(v.begin(),v.end(),0)/student; // sum += v[i]
        }
        for(int i =0; i< student; i++) {
            if(v[i] > avg) {
                count++;
            }
        }
        cout.precision(5);
        cout << (float)(count / student)*100 << "%" << '\n';

    }





    return 0;
}