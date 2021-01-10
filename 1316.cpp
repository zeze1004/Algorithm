#include <iostream>
#include <string>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int num, output, n = 1;
	string str;
	bool check = true;
	cin >> num;
	output = num;
	for (int i = 0; i < num; i++)
	{
		check = true;
		cin >> str;
		for (int j = 0; j < str.length(); j++)
		{
			n = 1;
			for (int k = j + 1; k < str.length(); k++)
			{
				// cout << j << " " << k << " " << str[j] << " " << str[k] << '\n';
				if (str[j] == str[k])
				{
					if (str[j] == str[j + n])
					{
						n++;
						// cout << n << '\n';
					}
					else if (str[j] == str[k] && k > j + n)
					{
						// cout << "duplicated: " << j << " " << k << " " << str[j] << " " << str[k] << '\n';
						check = false;
					}
				}
			}
		}
		if (check == false)
		{
			output--;
		}
	}
	cout << output;
	return 0;
}