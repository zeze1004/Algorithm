#include <iostream>
using namespace std;

void star(int i, int j, int num)
{
	// 공백이 찍힐 때 좌표 (3,3) (3,4) (3,5) (4,3) (4,4) (4,5) (5,3) (5,4) (5,5)
	if ((i / num) % 3 == 1 && (j / num) % 3 == 1)
	{
		cout << " ";
	}
	else
	{
		if (num / 3 == 0)
			cout << "*";
		// 3으로 나눠서 계속 값 줄 임
		else
			star(i, j, num / 3);
	}
}

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);

	int num;
	cin >> num;

	for (int i = 0; i < num; i++)
	{
		for (int j = 0; j < num; j++)
		{
			star(i, j, num);
		}
		cout << '\n';
	}

	return 0;
}