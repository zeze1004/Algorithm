#include <iostream>
#include <string>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	string input;
	int sum = 0;
	cin >> input;
	for (int i = 0; i < input.length(); i++)
	{
		if (input[i] >= 'A' && input[i] <= 'C')
		{
			sum += 3;
			// cout << input[i] << " " << sum << '\n';
		}
		if (input[i] >= 'D' && input[i] <= 'F')
		{
			sum += 4;
			// cout << input[i] << " " << sum << '\n';
		}
		if (input[i] >= 'G' && input[i] <= 'I')
		{
			sum += 5;
			// cout << input[i] << " " << sum << '\n';
		}
		if (input[i] >= 'J' && input[i] <= 'L')
		{
			sum += 6;
			// cout << input[i] << " " << sum << '\n';
		}
		if (input[i] >= 'M' && input[i] <= 'O')
		{
			sum += 7;
			// cout << input[i] << " " << sum << '\n';
		}
		if (input[i] >= 'P' && input[i] <= 'S')
		{
			sum += 8;
			// cout << input[i] << " " << sum << '\n';
		}
		if (input[i] >= 'T' && input[i] <= 'V')
		{
			sum += 9;
			// cout << input[i] << " " << sum << '\n';
		}
		if (input[i] >= 'W' && input[i] <= 'Z')
		{
			sum += 10;
			// cout << input[i] << " " << sum << '\n';
		}
	}
	cout << sum;
	return 0;
}