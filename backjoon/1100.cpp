#include <iostream>
#include <string>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	char str;
	// getline(cin, str);
	string chess[8][8];
	int count = 0;
	for (int i = 0; i < 8; i++)
	{
		for (int j = 0; j < 8; j++)
		{
			cin >> str;
			chess[i][j] = str;
			if (i % 2 == 0 && j % 2 == 0)
			{
				if (chess[i][j] == "F")
					count++;
			}
			else if (i % 2 == 1 && j % 2 == 1)
			{
				if (chess[i][j] == "F")
					count++;
			}
		}
	}
	cout << count;
	return 0;
}