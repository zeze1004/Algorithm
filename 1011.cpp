#include <iostream>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int T, x, y, output, j;
	cin >> T;
	for (int i = 0; i < T; i++)
	{
		cin >> x >> y;
		output = 1, j = 1;
		for (j; j <= (y - 2) - x; j++)
		{
			if (j + output <= (y - 2) - x)
			{
				output++;
				// cout << output << '\n';
			}
			if (j == (y - 1) - x)
			{
				if (output >= 1)
				{
					output = 1;
				}
			}
		}
		cout << j + 1 << '\n';
	}

	return 0;
}