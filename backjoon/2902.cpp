#include <iostream>
#include <string>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	string str;
	getline(cin, str);
	cout << str[0];
	for (int i = 0; i < str.length(); i++)
	{
		if (str[i] == '-')
		{
			cout << str[i + 1];
		}
	}
	return 0;
}