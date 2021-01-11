#include <iostream>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int young, middle;

	cin >> young >> middle;
	cout << middle - young + middle;

	return 0;
}