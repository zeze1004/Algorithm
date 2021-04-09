#include <iostream>
using namespace std;

int main()
{
	int num[5], i = 0, tmp = 0;
	for (i; i < 5; i++)
	{
		cin >> num[i];
		tmp += num[i] * num[i];
	}
	cout << (tmp % 10);
}