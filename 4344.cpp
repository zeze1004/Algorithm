#include <iostream>
#include <vector>
using namespace std;

int main() {
    cout << "test-1" << '\n';
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int case_n, student;
    vector <int> v;
    cout << "test0" << '\n';
    float avg = 0;
    int result = 0, count = 0;
    cin >> case_n;
    cout << "test1" << '\n';
    for(int i = 0; i < case_n; i++) {
        count = 0;
        cin >> student;
        for(int j = 0; j < student; j++) {
            cin >> v[j];
            result += v[j];
        }
        avg = result/ case_n;
        for(int k = 0; k < case_n; k++) {
            if(v[k] > avg) {
                count++;
            }
            cout <<  (float)count/case_n << "%" << '\n';
        }
    }

    return 0;
}


int main(){
    int n;
    scanf("%d", &n);
    for(int i  = 0; i < n; i++)
    {
        int num, sum = 0,count = 0;
        double avg;
        scanf("%d", &num);
        int arr[num];
        for(int j = 0; j < num; j ++)
        {
            scanf("%d", &arr[j]);
            sum+=arr[j];
        }
        avg = sum/num;        
        for(int k = 0; k < num; k ++)
            if(avg < arr[k])
                count++;
        printf("%.3f%%\n", (float)count/num*100);
    }
}
