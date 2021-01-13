#include <algorithm>
#include <iostream>
using namespace std;

int K, N, num[10001];

// 영식이의 랜선을 length로 자르면 몇 개의 랜선을 만들 수 있는 지
bool check(int length)
{
	long long count = 0;
	for (int i = 0; i < K; i++)
	{
		count += num[i] / length;
	}
	// cout << "count: " << count << '\n';
	return count >= N;
}

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	long long max = 0;
	cin >> K >> N;
	for (int i = 0; i < K; i++)
	{
		cin >> num[i];
		if (max < num[i])
		{
			max = num[i];
		}
	}
	long long output = 0, left = 1, right = max;
	while (right >= left)
	{
		long long mid = (left + right) / 2;
		cout << "mid: " << mid << '\n';

		// mid 값을 높여서 나눗셈 값이 더 적게
		if (check(mid))
		{
			// 랜선 길이의 최대값을 구하는 것이므로 전의 길이보다 커야함
			if (output < mid)
			{
				output = mid;
			}
			left = mid + 1;
			// cout << "left: " << left << '\n';
		}
		// mid 값을 더 줄여서 나눗셈 값이 더 크게
		else
		{
			right = mid - 1;
			// cout << "right: " << right << '\n';
		}
	}
	cout << output;
	return 0;
}