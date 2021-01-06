#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{
	int N, input;
	vector<int> vec;
	cin >> N;
	for (int i = 0; i < N; i++)
	{
		cin >> input;
		vec.push_back(input);
	}
	sort(vec.begin(), vec.end());
	for (int i = 0; i < N; i++)
	{
		cout << vec[i] << '\n';
	}
}