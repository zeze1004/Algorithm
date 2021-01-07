#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
	int N, i = 2;
	cin >> N;
	while (1)
	{
		if (N % i == 0)
		{
			N = N / i;
			cout << i << '\n';
		}
		if (N % i != 0)
		{
			i++;
		}
		if (i > N)
			break;
	}

	return 0;
}