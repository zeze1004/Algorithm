#include <iostream>
#include <algorithm>
#include <vector>
#include <math.h>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int N;
	vector<int> prime;
	cin >> N;

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
	// 출력
	// for (int i = 2; i <= N; i++)
	// {
	// 	if (prime[i] != 0)
	// 		cout << prime[i] << '\n';
	// }
	int num, count, output = 0;
	// 부르트포스트
	for (int i = 0; i < N; i++)
	{
		num = prime[i];
		for (int j = i + 1; j < N; j++)
		{
			count = 0;
			// int tmp = j - 1;
			// 소수면
			if (prime[i] != 0)
			{
				num += prime[j];
				count++;
				cout << "Continuous "
						 << "i: " << i << " j: " << j << " num " << num << " count: " << count << '\n';
				if (num == N)
				{
					output++;
					cout << "i: " << i << " j: " << j << " num " << num << " count: " << count << '\n';
				}
				else if (num > N)
				{
					count = 0;
				}
			}
		}
	}
	cout << output;
	return 0;
}