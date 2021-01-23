#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	int x, y, input;
	vector<int> vec;
	cin >> x >> y;
	for (int i = 0; i < x; i++)
	{
		for (int j = 0; j < y; j++)
		{
			cin >> input;
			vec.push_back(input);
			// 입력 받는 모든 수는 등차수열인 것
				}
	}

	return 0;
}