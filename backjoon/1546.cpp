#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int N, score,max;
    float sum;
    vector <float> v;
    cin >> N;
    for ( int i =0; i<N; i++) {
        cin >> score;
        v.push_back(score);
    }
    sort(v.begin(),v.end());
    
    max = v.back();
    //cout << "max" << '\n' << max << '\n' << "v" <<'\n';
    for (int i =0; i<N;i++){
        //cout << "oringV" << '\n' << v[i] << '\n';
        v[i] = v[i]/max*100;
        //cout << v[i] << '\n' << "sum" << '\n';
        sum += v[i];
        //cout << sum << '\n';
        
    }
    cout << sum/N;


    return 0;
}