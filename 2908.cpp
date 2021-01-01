#include <iostream>
using namespace std;

int main()
{
	int num[4], hund, ten, one;
	for (int i = 0; i < 2; i++)
	{
		cin >> num[i];
		hund = num[i] / 100;
		ten = num[i] / 10 - hund * 10;
		one = num[i] % ((hund * 100) + ten * 10);
		// cout << (one * 100) + (ten * 10) + hund << '\n';
		num[i + 2] = (one * 100) + (ten * 10) + hund;
		//cout << num[i + 1] << '\n';
	}
	if (num[2] < num[3])
	{
		cout << num[3];
	}
	else
		cout << num[2];
}
