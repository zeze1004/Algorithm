#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	int N, M, sum = 0;
	cin >> N >> M;
	vector<int> prime;
	vector<bool> check(M, false);
	if (N == 1)
		N++;

	for (int i = 2; i <= M; i++)
	{
		if (check[i] == true)
			continue;
		for (int j = i * i; j <= M; j += i)
		{
			check[j] = true;
		}
	}

	for (int i = N; i <= M; i++)
	{
		if (check[i] == false)
		{
			sum += i;
			prime.push_back(i);
			// cout << i << " ";
		}
	}
	if (sum == 0)
	{
		cout << -1;
		return 0;
	}
	else
	{
		cout << sum << '\n'
				 << prime[0];
	}
	return 0;
}