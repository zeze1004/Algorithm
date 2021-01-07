#include <iostream>
#include <queue>
using namespace std;

int main()
{
	int T, N, M, priority, goal_prior, num = 0, front;
	queue<pair<int, int>> que;
	cin >> T;
	for (int i = 0; i < T; i++)
	{
		num = 0;
		cin >> N >> M;
		for (int j = 0; j < N; j++)
		{
			cin >> priority;
			que.push(make_pair(j, priority));
		}
	}
	return 0;
}