#include <iostream>
#include <string>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	string str;
	int num = 0;
	cin >> str;
	for (int i = 0; i < str.length(); i++)
	{
		if (str[i] == '-' || str[i] == '=')
		{
			if ((str[i - 1] == 'z' && str[i - 2] == 'd'))
			{
				num -= 2;
			}
			else
				num--;
		}
		else if (str[i] == 'l' || str[i] == 'n')
		{
			if (str[i + 1] == 'j')
			{
				num--;
			}
		}
	}
	cout << str.length() + num;
	return 0;
}