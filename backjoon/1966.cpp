#include <iostream>
#include <queue>
#include <algorithm>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int T, N, M, priority, print_num, index;
	cin >> T;
	for (int i = 0; i < T; i++)
	{
		print_num = 0;
		queue<pair<int, int>> que;
		priority_queue<int> pri_que;
		cin >> N >> M;
		for (int j = 0; j < N; j++)
		{
			cin >> priority;
			que.push(make_pair(priority, j));
			pri_que.push(priority);
		}
		while (!que.empty())
		{
			priority = que.front().first;
			index = que.front().second;
			que.pop();
			if (priority == pri_que.top())
			{
				pri_que.pop();
				print_num++;
				if (index == M)
				{
					cout << print_num << '\n';
					break;
				}
			}
			else
			{
				que.push(make_pair(priority, index));
			}
		}
	}

	return 0;
}