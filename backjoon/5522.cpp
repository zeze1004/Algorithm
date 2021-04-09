#include <iostream>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int input, sum = 0;
	for (int i = 0; i < 5; i++)
	{
		cin >> input;
		sum += input;
	}
	cout << sum;
	return 0;
}