#include <iostream>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int chess[6] = {1, 1, 2, 2, 2, 8};
	int input;
	for (int i = 0; i < 6; i++)
	{
		cin >> input;
		if (chess[i] == input)
		{
			cout << 0 << " ";
		}
		else
		{
			cout << chess[i] - input << " ";
		}
	}
	return 0;
}