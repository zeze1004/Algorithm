#include <iostream>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int a = 0, b = 0, sum = 0;
	for (int i = 0; i < 2; i++)
	{
		cin >> a >> b;
		a = a * b;
		sum += a;
	}
	cout << sum;
	return 0;
}