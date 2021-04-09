#include <iostream>
#include <queue>
#include <string>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int N, num;
	queue<int> que;
	string word;
	cin >> N;
	for (int i = 0; i < N; i++)
	{
		cin >> word;
		if (word == "push")
		{
			cin >> num;
			que.push(num);
		}
		if (word == "pop")
		{
			if (que.empty())
				cout << -1 << '\n';
			else
			{
				cout << que.front() << '\n';
				que.pop();
			}
		}
		if (word == "front")
		{
			if (que.empty())
				cout << -1 << '\n';
			else
				cout << que.front() << '\n';
		}
		if (word == "back")
		{
			if (que.empty())
				cout << -1 << '\n';
			else
				cout << que.back() << '\n';
		}
		if (word == "empty")
		{
			if (que.empty())
				cout << 1 << '\n';
			else
				cout << 0 << '\n';
		}
		if (word == "size")
		{
			cout << que.size() << '\n';
		}
	}
	return 0;
}