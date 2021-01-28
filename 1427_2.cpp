#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	string input;
	vector<int> vec;

	getline(cin, input);
	for (int i = 0; i < input.length(); i++)
	{
		vec.push_back(input[i] - '0');
	}
	// 내림차순
	sort(vec.begin(), vec.end(), greater<int>());
	for (int i = 0; i < vec.size(); i++)
		cout << vec[i];
	return 0;
}