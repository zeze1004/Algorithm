#include <iostream>
#include <string>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int num = 1, i = 0;
	string input;
	getline(cin, input);

	for (; i < input.length(); i++)
	{
		if (input[i] == ' ')
		{
			num++;
		}
	}

	if (input[0] == ' ')
	{
		num--;
	}
	if (input[input.length() - 1] == ' ')
	{
		num--;
	}

	cout << num;
	return 0;
}