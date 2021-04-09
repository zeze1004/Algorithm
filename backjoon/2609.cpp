#include <iostream>
using namespace std;

int main()
{
	int a, b, res = 0, output = 1;
	cin >> a >> b;
	int A = a, B = b;
	if (a > b)
	{
		int tmp = b;
		b = a;
		a = tmp;
	}
	while (b != 0)
	{
		res = a % b;
		a = b;
		b = res;
	}
	cout << a << '\n'
			 << (A * B) / a;
}