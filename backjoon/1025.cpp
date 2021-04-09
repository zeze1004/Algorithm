#include <iostream>
#include <vector>
#include <algorithm>
#include <math.h>
#include <string>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	int x, y, input;
	string str;
	vector<string> vec;
	vector<int> output;
	cin >> x >> y;
	for (int i = 0; i < x; i++)
	{
		for (int j = 0; j < y; j++)
		{
			cin >> str;
			vec.push_back(str);
			// 입력 받는 모든 수는 등차수열인 것
		}
	}

	for (int i = 0; i < x; i++)
	{
		for (int j = 0; j < y; j++)
		{
		}
	}

	return 0;
}