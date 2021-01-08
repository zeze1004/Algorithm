#include <iostream>
using namespace std;

int main()
{
	int T, k, n, apart[20][20] = {0}; // apart[층][호]
	for (int i = 0; i <= 14; i++)			// 층
	{
		for (int j = 1; j <= 14; j++) // 호
		{
			apart[i][1] = 1; // 몇 층이든 1호는 무조건 1명 거주
			if (i == 0)
			{
				apart[i][j] = j;
				// cout << i << " " << j << " " << apart[i][j] << '\n';
			}
			else if (i > 0)
			{
				apart[i][j] = apart[i - 1][j] + apart[i][j - 1];
				// cout << i << " " << j << " " << apart[i][j] << '\n';
			}
		}
	}
	cin >> T;
	while (T--)
	{
		cin >> k >> n;
		cout << apart[k][n] << '\n';
	}

	return 0;
}