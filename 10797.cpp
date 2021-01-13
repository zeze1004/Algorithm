#include <iostream>
#include <string>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int day, count = 0, arr[5];
	cin >> day;

	for (int i = 0; i < 5; i++)
	{
		cin >> arr[i];
		if (day == arr[i])
			count++;
	}
	cout << count;
	return 0;
}