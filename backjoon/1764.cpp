#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);

	vector<string> vec;
	vector<string> output;
	int non_listen, non_see, count = 0;
	string input;
	cin >> non_listen >> non_see;
	for (int i = 0; i < non_listen; i++)
	{
		cin >> input;
		vec.push_back(input);
	}
	sort(vec.begin(), vec.end());

	for (int i = 0; i < non_see; i++)
	{
		cin >> input;
		if (binary_search(vec.begin(), vec.end(), input))
		{
			count++;
			output.push_back(input);
		}
	}
	sort(output.begin(), output.end());
	cout << count << '\n';
	for (int i = 0; i < output.size(); i++)
	{
		cout << output[i] << '\n';
	}
	return 0;
}