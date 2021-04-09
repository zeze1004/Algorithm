#include <iostream>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	double N;
	cin >> N;

	cout << (int)(N * 0.78) << " "
			 << (int)(N * 0.956);

	return 0;
}