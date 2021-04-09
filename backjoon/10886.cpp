#include <iostream>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int N, input, sum = 0;
	cin >> N;
	for (int i = 0; i < N; i++)
	{
		cin >> input;
		sum += input;
	}
	if (sum > N / 2)
		cout << "Junhee is cute!";
	else
		cout << "Junhee is not cute!";

	return 0;
}