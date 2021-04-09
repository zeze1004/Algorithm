#include <iostream>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int sum = 0, max = 0, score, winner;
	for (int i = 1; i < 6; i++)
	{
		sum = 0;
		for (int j = 0; j < 4; j++)
		{
			cin >> score;
			sum += score;
		}
		if (sum > max)
		{
			max = sum;
			winner = i;
		}
	}
	cout << winner << " " << max;
	return 0;
}