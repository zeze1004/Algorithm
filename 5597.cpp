#include <iostream>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	int arr[31] = {0}, input;
	for (int i = 1; i <= 28; i++)
	{
		cin >> input;
		arr[input] = input;
	}
	for (int i = 1; i <= 30; i++)
	{
		if (arr[i] == 0)
			cout << i << '\n';
	}
	return 0;
}