#include <iostream>
#include <vector>
#include <queue>

using namespace std;

vector<pair<int, int>> vec[1001];					// (node, cost) 저장
int shortest_dist[1001], inf = 100000000; // 최단거리 저장, 무한대(연결되지 않는 노드는 계속 무한대로, 갱신 되지 않음)
bool visit_check[1001];										// 디폴트 false, 방문한 곳은 true

int main()
{
	int N, M;
	int start, destination, cost;
	int goal_start, goal_destination;
	cin >> N >> M;
	for (int i = 0; i < M; i++)
	{
		cin >> start >> destination >> cost;
		vec[start].push_back(make_pair(destination, cost));
	}
	cin >> goal_start >> goal_destination;
	for (int i = 1; i <= N; i++)
	{
		shortest_dist[i] = inf; // 첫 번째 도시부터 N번째 도시를 무한대로 갱신
	}
	shortest_dist[goal_start] = 0; // 자기 자신으로 가는 가중치는 무조건 0

	// pair.first가 같은 경우 pair.second(cost)가 작은 걸 우선순위로 정렬
	// 출력할 때 cost가 가장 작은 것을 출력하게 됨
	priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> q;

	q.push(make_pair(0, goal_start)); // 시작점 가중치 0
	while (!q.empty())
	{
		int curent_node = q.top().second;
		q.pop();
		if (!visit_check[curent_node]) // 방문하지 않은 노드라면
		{
			visit_check[curent_node] = true; // 방문한 노드 true로 갱신
			for (int k = 0; k < vec[curent_node].size(); k++)
			{
				cout << k << " size: " << vec[curent_node].size() << '\n';
				int next = vec[curent_node][k].first;
				// 현재 노드의 최소 비용에서 그 노드에서 목적지 노드로 가는 비용이
				// 현재 목적지 노드로 가는 비용보다 작다면 갱신
				if (shortest_dist[next] > shortest_dist[curent_node] + vec[curent_node][k].second)
				{
					shortest_dist[next] = shortest_dist[curent_node] + vec[curent_node][k].second;
					q.push(make_pair(shortest_dist[next], next));
				}
			}
		}
	}
	// gola_start에서 goal_destination으로 가는 최소 비용 출력
	cout << shortest_dist[goal_destination];
}
