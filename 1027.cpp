#include <iostream>
using namespace std;

int N;
int building[51];

double slope(int near, int center)
{
	return ((double)(building[near] - building[center]) / (near - center));
}

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	double Mslope1, Mslope2, Pslope1, Pslope2;
	int i, j, k;
	int num[51] = {0};
	cin >> N;

	for (i = 1; i <= N; i++)
	{
		cin >> building[i];
	}

	for (i = 1; i <= N; i++)
	{

		// i번째 빌딩에서 Minus 방향으로 이동
		if (i > 1)
		{
			num[i]++;
			Mslope1 = slope(i - 1, i);
			for (j = i - 2; j >= 1; j--)
			{
				Mslope2 = slope(j, i);
				if (Mslope1 > Mslope2)
				{
					//cout << "Mslope1: " << Mslope1 << "Mslope2: " << Mslope2 << '\n';
					Mslope1 = Mslope2;
					num[i]++;
				}
			}
		}
		// cout << i << " Mslope: " << num[i] << " ";

		if (i < N)
		{
			num[i]++;
			Pslope1 = slope(i + 1, i);
			for (k = i + 2; k <= N; k++)
			{
				Pslope2 = slope(k, i);
				if (Pslope1 < Pslope2)
				{
					Pslope1 = Pslope2;
					num[i]++;
				}
			}
		}
		// cout << "Pslope: " << num[i] << '\n';
	}
	int max = num[1];
	for (i = 2; i <= N; i++)
	{
		if (max < num[i])
		{
			max = num[i];
		}
	}
	cout << max << '\n';
}