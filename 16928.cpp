#include <iostream>
#include <algorithm>
#include <queue>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	queue<int> que;
	int dist[101], next_node[101]; // 1에서 각 칸이 몇 번으로 갈 수 있는지, 연결 노드
	int ladder, snake;						 //사다리, 뱀 개수

	cin >> ladder >> snake;
	// 초기화
	for (int i = 1; i <= 6; i++)
	{
		next_node[i] = i;
		dist[i] = -1;
	}
	while (ladder--)
	{
		int num1, num2;
		cin >> num1 >> num2;
		next_node[num1] = num2;
	}

	while (snake--)
	{
		int num1, num2;
		cin >> num1 >> num2;
		next_node[num1] = num2;
	}

	// 시작점
	dist[1] = 0;
	que.push(1); // 1번 칸부터 시작
	while (!que.empty())
	{
		int current_space = que.front();
		que.pop();

		// 주사위
		for (int i = 1; i <= 100; i++)
		{
			int next_space = current_space + i;
			// 100을 넘을 수 없다
			if (next_space > 100)
				continue;
			next_space = next_node[next_space];
			if (dist[next_space] == -1)
			{
				dist[next_space] = dist[current_space] + 1;
				que.push(next_space);
			}
		}
	}
	// 1에서 100번 칸으로 가는 횟수 출력
	cout << dist[100];
	return 0;
}