#include <iostream>
using namespace std;

int main() {
    int A, B, C;
    int BB, CC;
    cin >> A >> B >> C;
    int i = 1;
    if(B >= C) {
        cout << -1;
    } /*else {
        while (1) {
            BB = i * B; 
            CC = i * C;
            //cout << C << '\n';
            if(CC - (A+BB) > 0) {
                //cout << A << " " << BB << " "  << A+BB << " " << CC << '\n';
                cout << i;
                break;
            } 
            i++;
        }
    }*/
    /*
    A+ Bi < Ci 일 때 손익분기점 넘은거임
    A / (C - B) < i 이므로
    A / (C - B) + 1을 하면 손익분기점을 넘긴 i를 구할 수 있음
    */
    else cout << (A/(C-B))+1;
    

    return 0;
}