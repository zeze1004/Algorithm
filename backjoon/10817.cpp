#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int input[3];
	for (int i = 0; i < 3; i++)
	{
		cin >> input[i];
	}
	sort(&input[0], &input[3]);
	cout << input[1];

	return 0;
}