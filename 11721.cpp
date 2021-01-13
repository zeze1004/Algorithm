#include <iostream>
#include <string>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int index = 0;
	string str;
	getline(cin, str);
	int length = str.length() / 10;
	if (str.length() % 10 != 0)
		length++;

	while (index < length * 10)
	{
		cout << str[index];
		index++;
		if (index % 10 == 0 && index != 0)
			cout << '\n';
		if (index == str.length())
			break;
	}

	return 0;
}