#include <iostream>
#include <string>
using namespace std;

int main()
{
	int input, six = 666;
	string str;
	cin >> input;

	for (int i = 0; i < input; i++)
	{
		if (input - 1 == i)
		{
			break;
		}
		while (1)
		{
			six++;
			str = to_string(six);
			if (str.find("666") != string::npos)
			{
				break;
			}
		}
	}

	cout << six;

	return 0;
}