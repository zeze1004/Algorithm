#include <iostream>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int N, arr[10001] = {0}, input;
	cin >> N;
	for (int i = 0; i < N; i++)
	{
		cin >> input;
		arr[input]++;
	}
	for (int i = 1; i <= 10000; i++)
	{
		for (int j = 0; j < arr[i]; j++) // arr[i] = 0이면 어차피 for문 안 돌아감
		{
			cout << i << '\n';
		}
	}
}