#include <iostream>
#include <string>
using namespace std;

int main()
{
	int A, B, C;
	int sum, arr[10] = {0};
	cin >> A >> B >> C;
	sum = A * B * C;
	while (sum != 0)
	{
		arr[sum % 10]++;
		sum = sum / 10;
	}
	for (int i = 0; i < 10; i++)
	{
		cout << arr[i] << '\n';
	}
}