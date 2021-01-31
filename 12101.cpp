#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
using namespace std;

#define max 11
int n, k, arr[max] = {}, index = 0; // 1,2,3의 합으로 구현할 수, 1,2,3의 합으로 나타내는 방법을 사전 순으로 k번째

void dp(int n, int k)
{
	if (arr[n] < k)
	{ // k번 째가 없을 시
		cout << -1;
		return;
	}
	for (index = 1;; index++)
	{
		if (arr[n - index] >= k)
		{
			if (n - index > 0)
			{
				cout << index << '+';
				dp(n - index, k);
			}
			else
				cout << index;
			break;
		}
		k -= arr[n - index]; //
	}
	return;
}

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	// 1,2,3 만으로 합을 만들어야 함

	cin >> n >> k;
	arr[0] = 1, arr[1] = 1, arr[2] = 2, arr[3] = 4;
	for (int i = 4; i < 11; i++)
		arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];

	dp(n, k);
	return 0;
}