#include <iostream>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int num;
	cin >> num;
	for (int i = num; i > 0; i--)
	{
		for (int j = i; j > 0; j--)
		{
			cout << '*';
		}
		cout << '\n';
	}
	return 0;
}