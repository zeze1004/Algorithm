#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

int main() {

    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n;
    int sum = 0;
    int count = 0;
    string ox;

    cin >> n;
    for(int i = 0; i < n; i++) {

        cin >> ox;
        // 초기화 매우 중요!!!
        count = 0;
        sum = 0;
        for (int i = 0; i < (int)(ox.size()); i++) {
            if(ox[i] == 'O') {
                count++;
                sum += count;
                /*
                cout << "ox[" <<i <<"] " << ox[i] << '\n';
                cout << "count: " << count  <<'\n';
                cout << "sum: "  << sum << '\n';
                */
            }
            else
                count = 0;
        }
        cout << sum << '\n';
    }
    return 0;
}
