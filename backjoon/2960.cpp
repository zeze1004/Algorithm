#include <iostream>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);

	int N, K, count = 0;
	int check[1001] = {0};

	cin >> N >> K;
	for (int i = 2; i <= N; i++)
	{
		for (int j = i; j <= N; j += i)
		{
			if (check[j] == 0)
			{
				check[j] = 1;
				// cout << j << '\n';
				count++;
				if (count == K)
				{
					cout << j;
					return 0;
				}
			}
		}
	}
	return 0;
}