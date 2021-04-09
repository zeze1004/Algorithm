#include <iostream>
#include <cmath>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	long long T, a, b, output;

	cin >> T;
	for (int i = 0; i < T; i++)
	{
		cin >> a >> b;
		if (a % 10 == 1)
		{
			cout << 1 << '\n';
		}
		if (a % 10 == 2)
		{
			output = (int)pow(2, (b % 4) + 4);
			cout << output % 10 << '\n';
		}
		if (a % 10 == 3)
		{
			output = (int)pow(3, (b % 4) + 4);
			cout << output % 10 << '\n';
		}
		if (a % 10 == 4)
		{
			output = (int)pow(4, (b % 2) + 2);
			cout << output % 10 << '\n';
		}
		if (a % 10 == 5)
		{
			cout << 5 << '\n';
		}
		if (a % 10 == 6)
		{
			cout << 6 << '\n';
		}
		if (a % 10 == 7)
		{
			output = (int)pow(7, (b % 4) + 4);
			cout << output % 10 << '\n';
		}
		if (a % 10 == 8)
		{
			output = (int)pow(8, (b % 4) + 4);
			cout << output % 10 << '\n';
		}
		if (a % 10 == 9)
		{
			output = (int)pow(9, (b % 2) + 2);
			cout << output % 10 << '\n';
		}
		if (a % 10 == 0)
			cout << 10 << '\n';
	}

	return 0;
}