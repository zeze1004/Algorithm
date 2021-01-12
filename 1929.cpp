#include <iostream>
#include <cmath>
#include <vector>
using namespace std;

int main()
{
	// ios_base ::sync_with_stdio(false);
	// cin.tie(NULL);
	// cout.tie(NULL);
	int M, N;
	vector<int> prime;

	cin >> M >> N;
	if (M == 1)
	{
		M++;
	}

	// 초기화
	for (int i = 0; i <= N; i++)
	{
		prime.push_back(i);
	}

	for (int i = 2; i <= sqrt(N); i++)
	{
		if (prime[i] == 0)
			continue;
		for (int j = i * i; j <= N; j += i)
		{
			prime[j] = 0;
		}
	}

	for (int i = M; i <= N; i++)
	{
		if (prime[i] != 0)
			cout << prime[i] << '\n';
	}

	return 0;
}