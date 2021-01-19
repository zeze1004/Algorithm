#include <iostream>
#include <string>
#include <algorithm>
#include <queue>
#include <vector>
using namespace std;

vector<pair<int, int>> vec;
queue<pair<int, int>> que;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	int x, y; // 시간복잡도 x*Y => O(NM)
	int arr[10][10];

	cin >> y >> x;

	for (int i = 0; i < x; i++)
	{
		for (int j = 0; j < y; j++)
		{
			cin >> arr[i][j];
			// 바이러스가 있는 곳이 vector에 저장
			if (arr[i][j] == 2)
			{
				vec.push_back({i, j});
			}
		}
	}

	for (int i = 0; i < y; i++)
	{
		for (int j = 0; j < x; j++)
		{
			if (arr[i][j] == 0)
			{
			}
		}
	}

	// 바이러스 근방의 0은 바이러스를 퍼트릴 수 있음

	// 0의 개수를 더하고 출력
	return 0;
}