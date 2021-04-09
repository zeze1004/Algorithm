#include <iostream>
using namespace std;

int N;
int building[51];

// 기울기 구하기
double slope(int near, int std)
{
	return ((double)(building[near] - building[std]) / (near - std));
}

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	double Mslope_std, Mslope, Pslope_std, Pslope;
	int i, j, k;
	int num[51] = {0}; // 각 빌딩 별 볼 수 있는 건물 수
	cin >> N;

	for (i = 1; i <= N; i++)
	{
		cin >> building[i];
	}

	for (i = 1; i <= N; i++)
	{

		// i번째 빌딩(기준)에서 Minus 방향으로 이동
		// 기준 기울기보다 기울기가 커야 볼 수 있음
		if (i > 1)
		{
			num[i]++;											// 자기 옆은 무조건 볼 수 있음
			Mslope_std = slope(i - 1, i); // 처음 기준 기울기는 바로 옆 건물과 기준 건물의 기울기
			for (j = i - 2; j >= 1; j--)
			{
				Mslope = slope(j, i);
				if (Mslope_std > Mslope)
				{
					Mslope_std = Mslope;
					num[i]++;
				}
			}
		}

		// i번째 빌딩(기준)에서 Plus 방향으로 이동
		// 기준 기울기보다 기울기가 작아야 볼 수 있음
		if (i < N)
		{
			num[i]++;
			Pslope_std = slope(i + 1, i);
			for (k = i + 2; k <= N; k++)
			{
				Pslope_std = slope(k, i);
				if (Pslope_std < Pslope)
				{
					Pslope_std = Pslope;
					num[i]++;
				}
			}
		}
	}

	// 최댓값 출력
	int max = num[1];
	for (i = 2; i <= N; i++)
	{
		if (max < num[i])
		{
			max = num[i];
		}
	}
	cout << max;
}