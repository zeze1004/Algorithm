#include <iostream>
#include <cmath>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int N, K, prime[1001] = {0}, count = 1;
	cin >> N >> K;
	for (int i = 2; i <= N; i++)
		prime[i] = i;
	for (int i = 2; i <= K; i++)
	{
		if (prime[i] == i)
		{
			prime[i] = count;
			// cout << "i " << i << " " << prime[i] << '\n';
			count++;
		}
		for (int j = i * i; j <= N; j += i)
		{
			if (prime[j] == j)
			{
				prime[j] = count;
				// cout << "j " << j << " " << prime[j] << '\n';

				count++;
			}
		}
	}
	cout << prime[K];
	return 0;
}
dsafdsfa