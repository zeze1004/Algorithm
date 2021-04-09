#include <iostream>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int price[10], total_price, sum = 0;
	cin >> total_price;
	for (int i = 0; i < 9; i++)
	{
		cin >> price[i];
		sum += price[i];
	}
	cout << total_price - sum;
	return 0;
}