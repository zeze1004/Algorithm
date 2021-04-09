#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	long long num, goal_num, arr[10001], sum = 0, count = 0;
	int start = 0, end = 0;
	cin >> num >> goal_num;

	// 배열에 값 집어넣기
	for (int i = 0; i < num; i++)
	{
		cin >> arr[i];
	}

	// start부터 end 하나씩 더하고
	// if: goal_num 초과 값 나오면 sum - arr[start-1]
	//					start++
	// else if: sum < goal_num 이면 end++
	// if: num == end, end가 배열의 끝까지 탐색한 것이므로 반복문 끝낸다

	while (1)
	{
		if (sum >= goal_num)
		{
			sum -= arr[start]; // 1 1 1 1일 때 goal_num이 2라면
												 // arr[0] + arr[1] = 2
												 // sum >= goal_num
												 // sum -= arr[start]
			start++;
		}
		else if (end == num)
			break;
		else
		{
			sum += arr[end++];
		}
		if (sum == goal_num)
			count++;
	}

	cout << count;
	return 0;
}