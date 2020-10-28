#include <iostream>
#include <math.h>
#include <vector>

using namespace std;
/*
problem 1
int main()
{
    int n, result;
    cin >> n;

    vector<int> dp(n / 2 + 2);
    dp[0] = 1;

    for (int i = 1; i < dp.size(); i++)
    {

        dp[i] = dp[i-1] * 2;

        if (dp[i] > 16769023)
        {
            dp[i] %= 16769023;
        } 
    }
    if (n % 2 == 0)
    {
        result = dp[n / 2];
    }
    else
    {
        result = dp[n / 2 + 1];
    }
    cout << result;

    return 0;
}

*/

int main()
{
    int n, tot_A = 0, tot_b = 0;
    cin >> n;
    vector<int> A(n);
    vector<int> B(n);

    for (int i = 0; i < n; i++)
    {
        cin >> A[i] >> B[i];
    }

    for(int i = 0; i < n; i++)
    {
        if (tot_a)
    }
}