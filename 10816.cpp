#include <iostream>
using namespace std;

int main()
{
	int N;
	long long M;
	unsigned int card[1000001] = {0};
	cin >> N;
	for (int i = 0; i < N; i++)
	{
		cin >> M;
		if (M < 0)
		{
			M = -1 * M + 10000000;
		}
		card[M]++;
	}
	cin >> N;
	for (int i = 0; i < N; i++)
	{
		cin >> M;
		if (M < 0)
		{
			M = -1 * M + 10000000;
		}
		if (card[M] != 0)
		{
			cout << card[M] << " ";
		}
	}
}