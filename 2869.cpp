#include <iostream>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	unsigned int A, B, V, a, b;
	cin >> A >> B >> V;
	a = A, b = B;
	for (int i = 1; i <= V; i++)
	{
		if ((a - b) * (i - 1) + a >= V)
		{
			cout << i;
			break;
		}
	}
}