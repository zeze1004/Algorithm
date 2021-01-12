#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int N, M, input[100005], num;
	cin >> N;
	for (int i = 0; i < N; i++)
	{
		cin >> input[i];
	}
	sort(&input[0], &input[N]);
	cin >> M;
	for (int i = 0; i < M; i++)
	{
		cin >> num;
		auto upper = upper_bound(input, input + N, num);
		auto lower = lower_bound(input, input + N, num);
		if (upper - lower >= 1)
		{
			cout << 1 << '\n';
		}
		else
			cout << 0 << '\n';
	}
	return 0;
}