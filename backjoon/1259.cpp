#include <iostream>
#include <string>
using namespace std;

int main()
{
	int i = 0, j, k;
	string input;
	char int_input;

	while (1)
	{
		cin >> input;
		if (input[0] == '0')
			break;
		bool result = true;
		int length = input.length();

		for (j = 0; j < length; j++)
		{
			if (input[j] != input[length - 1 - j])
			{
				result = false;
			}
		}
		if (result)
		{
			cout << "yes" << '\n';
		}
		else
			cout << "no" << '\n';
		result = true;
	}
	return 0;
}