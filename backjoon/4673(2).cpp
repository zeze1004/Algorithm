#include <iostream>
using namespace std;

int self_num(int index)
{
	int res = index, sum = index;
	while (res != 0)
	{
		sum = sum + (res % 10);
		res = res / 10;
	}
	return sum;
}

int main()
{

	int selfNum_arr[10001] = {0};
	for (int i = 1; i <= 10000; i++)
	{
		if (self_num(i) <= 10000) // 이 구문 안넣으면 배열 넘어서 값 저장돼서 런타임 에러 남~!
		{
			selfNum_arr[self_num(i)]++;
		}
	}
	for (int i = 1; i <= 10000; i++)
	{
		if (selfNum_arr[i] == 0)
			cout << i << '\n';
	}
	return 0;
}