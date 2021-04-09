#include <iostream>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int input;
	cin >> input;
	if (input % 5 == 0)
	{
		cout << input / 5;
	}
	else
	{
		cout << input / 5 + 1;
	}

	return 0;
}