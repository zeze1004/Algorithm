#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
	int N, arr[500001] = {0}, same_arr[250001] = {0}, num, sum = 0, same = 0;
	cin >> N;
	for (int i = 0; i < N; i++)
	{
		cin >> num;
		arr[i] = num;
		sum += num;
	}
	sort(&arr[0], &arr[N]);
	cout << sum / N << '\n'
			 << arr[(N / 2) + 1] << '\n';
	for (int i = 0; i < N; i++)
	{
		// 중복된 값이 있을 경우
		if (find(arr, arr + N, arr[i]) != arr + N)
		{
			same++;
			same_arr[i] = arr[i];
		}
	}
	if (same >= 1)
	{
		for (int i = 0; i < N; i++)
		{
			if (same == 1 && same_arr[i] != 0)
			{
				cout << same_arr[i] << '\n';
			}
			else if (same > 1 && same_arr[])
		}
	}
	// 중복 되는 값이 없으면 두 번째로 작은 값 출력
	else
		cout << arr[1] << '\n';
}