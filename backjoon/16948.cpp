#include <iostream>
#include <queue>
#include <algorithm>
// #include <memory.h>
#include <cstring>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	int num, dist[201][201];
	memset(dist, -1, sizeof(dist));
	queue<pair<int, int>> que;

	int x[] = {-2, -2, 0, 0, 2, 2};	 // x행
	int y[] = {-1, 1, -2, 2, -1, 1}; // y행

	cin >> num;
	int start_x, start_y, end_x, end_y;
	cin >> start_x >> start_y >> end_x >> end_y;

	// 시작
	dist[start_x][start_y] = 0;
	que.push({start_x, start_y});
	while (!que.empty())
	{
		// tie(current_x, current_y) = que.front();
		int current_x = que.front().first;
		int current_y = que.front().second;
		que.pop();
		// 체스판 이동
		for (int i = 0; i <= 5; i++)
		{
			int next_x = current_x + x[i];
			int next_y = current_y + y[i];
			// 범위 체크
			if (next_x >= 0 && next_x < num && next_y >= 0 && next_y < num)
			{
				// 방문하지 않았다면
				if (dist[next_x][next_y] == -1)
				{
					// 여기서 부터 방문할 수 있도록 que에 저장
					que.push({next_x, next_y});
					// dist[current_x][current_y]: 현재까지 방문한 횟수에서 1을 추가
					dist[next_x][next_y] = dist[current_x][current_y] + 1;
				}
			}
		}
	}
	cout << dist[end_x][end_y];
	return 0;
}