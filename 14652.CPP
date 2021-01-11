#include <iostream>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int N, M, seat, num = 0;
	cin >> N >> M >> seat;
	for (int i = 0; i < N; i++)
	{
		for (int j = 0; j < M; j++)
		{
			if (num == seat)
			{
				cout << i << " " << j;
				return 0;
			}
			num++;
		}
	}
}