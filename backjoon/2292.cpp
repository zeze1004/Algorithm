#include <iostream>
using namespace std;

int main()
{
	int N, num = 0, start = 2, end = 7;
	cin >> N;

	for (int i = 1; i <= N; i++)
	{
		if (N < start)
		{
			cout << i;
			return 0;
		}
		else if (N <= end)
		{
			cout << i + 1;
			return 0;
		}
		start += 6 * i, end += 6 * (i + 1);
	}

	return 0;
}