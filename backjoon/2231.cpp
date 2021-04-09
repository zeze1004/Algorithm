#include <iostream>
#include <string>
using namespace std;

int result(int index)
{
	int sum = index, res = index;
	while (res)
	{
		sum = sum + res % 10;
		res = res / 10; // res가 10보다 작아지면 0이 되므로 while문 break
	}
	return sum;
}

int main()
{
	int N, sum = 0, n = 0;
	string input;
	cin >> N;

	for (int i = 0; i < N; i++)
	{
		if (result(i) == N)
		{
			cout << i;
			return 0;
		}
	}

	/*
	for (int i = 0; i < N; i++)
	{
		int thoud_thoud = i / 1000000;
		int hund_thoud = i / 100000 - thoud_thoud * 10;
		int ten_thoud = i / 10000 - thoud_thoud * 100 - hund_thoud * 10;
		int thoud = i / 1000 - thoud_thoud * 1000 - hund_thoud * 100 - ten_thoud * 10;
		int hund = i / 100 - thoud_thoud * 10000 - hund_thoud * 1000 - ten_thoud * 100 - thoud * 10;
		int ten = i / 10 - thoud_thoud * 100000 - hund_thoud * 10000 - ten_thoud * 1000 - thoud * 100 - hund * 10;
		int one = i - thoud_thoud * 1000000 - hund_thoud * 100000 - ten_thoud * 10000 - thoud * 1000 - hund * 100 - ten * 10;

		if ((i + thoud_thoud + hund_thoud + ten_thoud + thoud + hund + ten + one) == N)
		{
			cout << i;
			break;
		}
	}
	*/

	cout << 0;
	return 0;
}