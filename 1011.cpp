#include <iostream>
#include <math.h>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	long long T, x, y, res;
	cin >> T;
	for (int i = 0; i < T; i++)
	{
		cin >> x >> y;
		// 마지막 이동: 1
		// 마지막 전 이동: 최대 2
		// 마지막 전전 이동: 최대 3
		// 1 -> 2 -> ... -> 3 -> 2 -> 1
		res = y - x + 1;
		if (res <= 4)
		{
		}
		else
		{
		}
	}
	return 0;
}