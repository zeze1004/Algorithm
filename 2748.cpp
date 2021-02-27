#include <iostream>
using namespace std;

// 0으로 초기화
long long dp[91] = {0};

long long fibo(int n)
{
	if (n <= 2)
	{
		if (n == 0)
			return 0;
		return 1;
	}
	// 값이 이미 있다면 추가로 연산(재귀, fibo 함수 호출)하지 말고 함수 끝냄
	if (dp[n] != 0)
	{
		return dp[n];
	}
	else
	{
		dp[n] = fibo(n - 1) + fibo(n - 2);
		return dp[n];
	}
}

int main()
{
	int n;
	cin >> n;
	cout << fibo(n);
	return 0;
}