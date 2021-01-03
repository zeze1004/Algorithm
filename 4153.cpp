#include <iostream>
using namespace std;

int swap(int *a, int *b)
{
	int temp = *a;
	*a = *b;
	*b = temp;
}

int main(void)
{
	int a, b, c;
	while (1)
	{
		cin >> a >> b >> c;
		if (a > b)
			swap(a, b);
		if (b > c)
			swap(b, c);
		if (a == 0)
			return 0;
		else if (c * c == a * a + b * b)
			cout << "right" << '\n';
		else
			cout << "wrong" << '\n';
	}
}