#include <iostream>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int input, sum = 0, minut, second;
	for (int i = 0; i < 4; i++)
	{
		cin >> input;
		sum += input;
	}

	cout << sum / 60 << '\n'
			 << sum % 60;
	return 0;
}