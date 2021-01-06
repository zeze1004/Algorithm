#include <iostream>
#include <algorithm>
#include <string>
#include <vector>
using namespace std;

bool compare(pair<int, string> a, pair<int, string> b)
{
	// pair.second는 냅두고 pair.first인 int만 오름차순 정렬
	return a.first < b.first;
}

int main()
{
	int N;
	vector<pair<int, string>> vec;
	pair<int, string> p;
	cin >> N;
	for (int i = 0; i < N; i++)
	{
		cin >> p.first >> p.second;
		vec.push_back(p);
	}
	// 원래 순서를 손상시키지 않으면서 정렬하는 알고리즘
	stable_sort(vec.begin(), vec.end(), compare);
	for (int i = 0; i < N; i++)
	{
		cout << vec[i].first << " " << vec[i].second << '\n';
	}
}