#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <queue>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	int name_num, output_num;
	string name;
	vector<pair<int, string>> vec;

	cin >> name_num >> output_num;
	for (int i = 0; i < name_num; i++)
	{
		cin >> name;
		vec.push_back({i, name});
	}
	for (int i = 1; i <= output_num; i++)
	{
		string input;
		cin >> input;
		if ('0' <= input[0] && input[0] <= '9')
		{
			cout << vec[stoi(input)].second << '\n';
		}
		else
		{
			for (int j = 1; j <= output_num; j++)
			{
				if (vec[j].second == input)
				{
					cout << vec[j].first << '\n';
				}
			}
		}
	}
}