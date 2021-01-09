#include <iostream>
#include <string>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	string str;
	int output = 0;
	cin >> str;
	for (int i = 0; i < str.length(); i++)
	{
		output *= 16;
		if (str[i] >= 'A' && str[i] <= 'F')
		{
			output += str[i] - 'A' + 10;
		}
		else
			output += str[i] - '0';
	}

	cout << output;

	return 0;
}