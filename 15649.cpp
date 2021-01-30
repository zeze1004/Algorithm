#include <iostream>
using namespace std;

#define max 9

int N, M;
int output[max];
bool visited[max];

void tracking(int num)
{
	if (num == M)
	{
		for (int i = 0; i < M; i++)
			cout << output[i] << " ";
		cout << '\n';
		return;
	}
	for (int i = 1; i <= N; i++)
	{
		if (!visited[i])
		{
			visited[i] = true;
			output[num] = i;
			tracking(num + 1);
			visited[i] = false;
		}
	}
}

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);

	cin >> N >> M;

	tracking(0);

	return 0;
}