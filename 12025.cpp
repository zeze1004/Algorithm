#include <iostream>
using namespace std;

int main()
{
	ios::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	string password;
	long long k; // k ≤ 2^63 – 1
	long long num = 1;
	cin >> password >> k;

	for (int i = 0; i < password.size(); i++)
	{
		if (password[i] == '1' || password[i] == '2' || password[i] == '6' || password[i] == '7')
		{
			num = num * 2;
			if (password[i] == '6' || password[i] == '7')
			{
				password[i] = '1';
			}
			if (password[i] == '7')
			{
				password[i] = '2';
			}
		}
	}

	// 각 자리의 1,2,6,7이 바뀔 수 있는 경우의 수는 2이므로 결과가 16개 보다 많을 수 없다
	if (num < k || k < 0)
	{
		cout << "-1" << '\n';
		return 0;
	}

	k = k - 1; // password를 6->1, 7->2 바꿀 때 이미 k = 1 완성 되므로 1회를 빼야 완하는 k 번째 출력 가능

	// 사전순으로 나열해야하므로 뒤에서 부터 숫자 바꿔야 함
	for (int i = password.length() - 1; i >= 0; i--)
	{
		// cout << i << " password: " << password << '\n';
		if (password[i] == '1' || password[i] == '2' || password[i] == '6' || password[i] == '7')
		{
			if (k % 2 == 1)
			{
				if (password[i] == '1')
				{
					password[i] = '6';
				}
				else if (password[i] == '2')
				{
					password[i] = '7';
				}
			}

			// 한 자리 수만 바뀐 채 나머지 숫자들은 그대로야 사전식으로 나열 가능
			// 예시의 67이 12, 17, 62, 67 순으로 바뀜
			// 홀수번째부터 앞자리 변하니(힌트 예시) k를 2로 나눠줌
			k = k / 2;
		}
	}
	cout << password << '\n';

	return 0;
}