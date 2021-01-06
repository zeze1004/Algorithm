#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
	int N, y, x;
	cin >> N;
	pair<int, int> p[100001];
	for (int i = 0; i < N; i++)
	{
		cin >> p[i].second >> p[i].first;
	}
	sort(&p[0], &p[N]);
	for (int i = 0; i < N; i++)
	{
		cout << p[i].second << " " << p[i].first << '\n';
	}
}