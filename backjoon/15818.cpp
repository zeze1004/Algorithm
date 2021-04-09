#include <iostream>
using namespace std;

int main()
{
	long long N, M, res, sum = 1;
	cin >> N >> res;
	for (int i = 0; i < N; i++)
	{
		cin >> M;
		sum = (sum * M) % res;
	}
	cout << sum % res;
}