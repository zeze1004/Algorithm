#include <iostream>
#include <vector>
#include <algorithm>
#include <queue>
using namespace std;

queue<int> que;
vector<int> vec[200]; // 모든 회원이 친구인 경우
bool check[200] = {false};

int bfs(int index)
{
	check[index] = true;
	que.push(index);

	while (que.empty())
	{
	}
}

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);

	int num, member1, member2, count = 0;

	cin >> num;
	while (1)
	{
		cin >> member1 >> member2;
		if (member1 == -1)
			break;

		vec[member1].push_back(member1);
		vec[member2].push_back(member2);
	}
	for (int i = 1; i <= num; i++)
	{
	}

	return 0;
}