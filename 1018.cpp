#include <iostream>
#include <string>

using namespace std;

int main()
{
	char chess[250];
	int y, x, w_num = 0, b_num = 0, i = 0, j = 0;
	cin >> y >> x;
	for (int i = 0; i < x * y; i++)
	{
		cin >> chess[i];
	}

	// 시작이 w인 체스판
	for (i; i < x * y; i++)
	{
		for (j = i; j < 64 + i; j++)
		{
			if (j - 8)
			{
				if (chess[j] != 'B' && chess[j] != 'W')
					break;
				if (i % 2 == 0) // i가 짝수일 때
				{
					if (k % 2 == 0)
					{
						if (chess[i] != 'W')
						{
							w_num++;
						}
					}
					else
					{
						if (chess[i] != 'B')
						{
							w_num++;
						}
					}
				}
			}
		}
	}
	cout << w_num;
	return 0;
}
