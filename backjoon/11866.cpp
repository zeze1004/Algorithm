#include <iostream>
#include <queue>

using namespace std;

int main()
{
	int N, K;
	queue<int> que;
	cin >> N >> K;
	for (int i = 1; i <= N; i++)
	{
		que.push(i);
	}
	cout << "<";
	while (1)
	{
		for (int i = 1; i < K; i++)
		{
			que.push(que.front());
			que.pop();
		}
		cout << que.front();
		que.pop();
		if (!que.empty())
		{
			cout << ", ";
		}
		else
			break;
	}
	cout << ">";
	return 0;
}