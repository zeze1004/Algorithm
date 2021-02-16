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
	vector<int> vec;
	vector<int>::iterator iter;
	cin >> num;
	while (num--)
	{
		cin >> str;
		if (str == "add")
		{
			cin >> input;
			vec.push_back(input);
		}
		if (str == "remove")
		{
			cin >> input;
			iter = find(vec.begin(), vec.end(), input);
			if (iter != vec.end())
				vec.erase(iter);
		}
		if (str == "check")
		{
			cin >> input;
			iter = find(vec.begin(), vec.end(), input);
			if (iter != vec.end())
				cout << 1 << '\n';
			else
				cout << 0 << '\n';
		}
		if (str == "toggle")
		{
			cin >> input;
			iter = find(vec.begin(), vec.end(), input);
			if (iter != vec.end())
				vec.erase(iter);
			else
				vec.push_back(input);
		}
		if (str == "all")
		{
			vec.clear();
			vec = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		}
		if (str == "empty")
		{
			vec.clear();
		}
	}

	return 0;
}
