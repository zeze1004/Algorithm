#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int N, K, input[500001], num;

	cin >> N;
	for (int i = 0; i < N; i++)
	{
		cin >> input[i];
	}
	sort(&input[0], &input[N]);
	cin >> K;
	for (int i = 0; i < K; i++)
	{
		cin >> num;
		// auto: 변수 선언과 동시에 초기화, 초기화시 주어지는 값을 통해 가장 적합한 자료형 저장
		auto upper = upper_bound(input, input + N, num); // return 값이 배열의 포인터
		auto lower = lower_bound(input, input + N, num);
		cout << upper - lower << " ";
	}
	return 0;
}