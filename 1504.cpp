#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

/*
1-> V1 -> V2 -> N
1-> V2 -> V1 -> N
시작점이 1, V1, V2로 다익스트라 알고리즘 3번 수행
*/
int N, E, V1, V2, cost, a, b;
int arr[1001][1001]; // 문제의 그래프
int shortest_distance[1001];
bool check[1001];
int inf = 100000000; // 3번의 다익스트라를 더해야 하므로 10억하면 오버플로우 발생

vector<int> dijkstra(int start)
{
	for (int i = 1; i <= N; i++)
	{
		shortest_distance[i] = inf;
		check[i] = false; // 3번 사용할거이므로 false로 갱신해줘야 함
	}
	shortest_distance[start] = 0;		// 자기 자신으로 가는 거리는 0
	for (int j = 0; j < N - 1; j++) // 첫 노드랑 마지막 노드 빼기
	{
		int shortest_cost = inf + 1;
		int shortest_index = -1;
		for (int i = 1; i <= N; i++)
		{
			if (check[i] == false && shortest_cost > shortest_distance[i])
			{
				shortest_cost = shortest_distance[i];
				shortest_index = i;
			}
		}
		// if문에 안걸렸으면 check[-1] = true
		check[shortest_index] = true;
		for (int i = 1; i <= N; i++)
		{
			if (shortest_distance[i] > shortest_distance[shortest_index] + arr[shortest_index][i])
			{
				shortest_distance[i] = shortest_distance[shortest_index] + arr[shortest_index][i];
			}
		}
	}
	return vector<int>(shortest_distance, shortest_distance + N + 1);
}

main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	cin >> N >> E;
	for (int i = 1; i <= N; i++)
	{
		for (int j = 1; j <= N; j++)
		{
			arr[i][j] = inf;
		}
	}

	for (int i = 0; i < E; i++)
	{
		cin >> a >> b >> cost;
		if (arr[a][b] > cost)
		{
			arr[a][b] = cost; // cost 최소 값으로 갱신
		}
		if (arr[b][a] > cost)
		{
			arr[b][a] = cost;
		}
	}
	cin >> V1 >> V2;
	vector<int> start = dijkstra(1);		// 무조건 1에서 시작
	vector<int> func_V1 = dijkstra(V1); // 시작점 V1에서 시작
	vector<int> func_V2 = dijkstra(V2); // 시작점 V2에서 시작

	// 1 -> V1 -> V2 -> N
	int first_V1 = start[V1] + func_V1[V2] + func_V2[N];
	// 1 -> V2 -> V1 -> N
	int first_V2 = start[V2] + func_V2[V1] + func_V1[N];

	if (first_V1 > first_V2)
	{
		first_V1 = first_V2;
	}
	if (first_V1 >= inf)
	{
		first_V1 = -1;
	}
	cout << first_V1;
	return 0;
}