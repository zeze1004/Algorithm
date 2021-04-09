#include <iostream>
#include <string>
#include <queue>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	string str;
	cin >> str;
	priority_queue<int> pq;
	for (int i = 0; i < str.length(); i++)
	{
		pq.push(str[i] - '0');
	}
	for (int j = 0; j < str.length(); j++)
	{
		cout << pq.top();
		pq.pop();
	}
	return 0;
}