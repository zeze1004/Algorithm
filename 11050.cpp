#include <iostream>
using namespace std;

int main()
{
	int N, K;
	int i = 1, j = 1, k = 1;
	int a = 1, b = 1, c = 1;
	cin >> N >> K;

	for (i; i <= K; i++)
	{
		a = a * i;
	}
	for (j; j <= (N - K); j++)
	{
		b = b * j;
	}
	for (k; k <= N; k++)
	{
		c = c * k;
	}
	cout << c / (a * b);
}