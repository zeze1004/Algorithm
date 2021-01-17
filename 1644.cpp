#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	// cout.tie(NULL);
	int N;
	cin >> N;
	vector<int> prime;
	vector<bool> check(N + 1, true);

	// 소수판정
	for (int i = 2; i * i <= N; i++)
	{
		if (!check[i])
			continue;
		for (int j = i * i; i <= N; j += i)
		{
			check[j] = false;
		}
	}

	for (int i = 2; i <= N; i++)
	{
		if (check[i])
		{
			prime.push_back(i);
			// cout << prime[i] << '\n';
		}
	}

	// 투 포인터
	int start = 0, end = 0, count = 0, sum = 0;
	while (1)
	{
		if (sum >= N)
		{
			sum -= prime[start++];
			// start++;
		}
		else if (end == prime.size())
		{
			break;
		}
		else
		{
			sum += prime[end++];
			// end++;
		}
		if (sum == N)
		{
			count++;
		}
	}
	cout << count;
	return 0;
}