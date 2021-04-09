#include <iostream>
using namespace std;

int main()
{
	int N, M, arr[101] = {0}; // 카드값 개수 최대 100
	int i = 0, j = 0, k = 0;
	int sum = 0, max = 0;
	cin >> N >> M;
	for (i; i < N; i++)
		cin >> arr[i];
	for (i = 0; i < N; i++)
	{
		// cout << "i " << i << '\n';
		for (j = i + 1; j < N; j++)
		{
			// cout << "j " << j << '\n';
			for (k = j + 1; k < N; k++)
			{
				// cout << "k " << k << '\n';
				sum = arr[i] + arr[j] + arr[k];
				if (sum <= M && max < sum)
				{
					max = sum;
				}
			}
		}
	}
	cout << max;
	return 0;
}