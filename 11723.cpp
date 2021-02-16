#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);

	int num, input;
	string str;
	vector<bool> vec(21, false);
	vector<int>::iterator iter;
	cin >> num;
	while (num--)
	{
		cin >> str;
		if (str == "add")
		{
			cin >> input;
			vec[input] = true;
		}
		if (str == "remove")
		{
			cin >> input;
			vec[input] = false;
		}
		if (str == "check")
		{
			cin >> input;
			if (vec[input] == true)
				cout << 1 << '\n';
			else
				cout << 0 << '\n';
		}
		if (str == "toggle")
		{
			cin >> input;
			if (vec[input] == true)
				vec[input] = false;
			else
				vec[input] = true;
		}
		if (str == "all")
		{
			vec = {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
		}
		if (str == "empty")
		{
			vec = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
		}
	}

	return 0;
}
