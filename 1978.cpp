#include <iostream>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	bool check = true;
	int N, M, num = 0;
	cin >> N;

	for (int i = 0; i < N; i++)
	{
		cin >> M;

		for (int j = 2; j < M; j++)
		{
			// cout << i << " " << j << '\n';
			if (M % j == 0)
			{
				// cout << "non prime: " << i << " " << j << '\n';
				check = false;
			}
		}
		if (check && M != 1)
		{
			num++;
		}
		check = true;
	}
	cout << num;

	return 0;
}