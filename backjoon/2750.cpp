#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
	int N, arr[1001], num;
	cin >> N;
	for (int i = 0; i < N; i++)
	{
		cin >> num;
		arr[i] = num;
	}
	sort(&arr[0], &arr[N]);
	for (int i = 0; i < N; i++)
	{
		cout << arr[i] << '\n';
	}
	return 0;
}