#include <iostream>
#include <string>
using namespace std;

int main()
{
	int i = 0, big, small, num, empty;
	string str;
	while (1)
	{
		big = 0, small = 0, num = 0, empty = 0;
		getline(cin, str);
		if (str.size() == 0)
			break;

		for (int j = 0; j < str.length(); j++)
		{
			if (str[j] >= 'A' && str[j] <= 'Z')
			{
				big++;
			}
			else if (str[j] >= 'a' && str[j] <= 'z')
			{
				small++;
			}
			else if (str[j] == ' ')
			{
				empty++;
			}
			else
			{
				num++;
			}
		}
		if (small + big + num + empty != 0)
			cout << small << " " << big << " " << num << " " << empty << '\n';
	}

	return 0;
}