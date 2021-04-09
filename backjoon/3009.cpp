
#include <iostream>
using namespace std;

int main()
{
	int x1, y1, x2, y2, x3, y3;
	bool x_check = true, y_check = true;
	for (int i = 0; i < 2; i++)
	{
		cin >> x1 >> y1 >> x2 >> y2;
		if (x1 == x2)
			x_check = false;
		if (y1 == y2)
			y_check = false;
		if (x_check) // x1 != x2
		{
			cin >> x3;
			if (x3 == x1)
				cout << x2 << " ";
			else
				cout << x1 << " ";
		}
		else if (!x_check) // x1 == x2
		{
			cin >> x3;
			cout << x3 << " ";
		}
		if (y_check) // y1 != y2
		{
			cin >> y3;
			if (y3 == y1)
				cout << y2;
			else
				cout << y1;
		}
		else if (!y_check) // x1 == x2
		{
			cin >> y3;
			cout << y3;
		}

		return 0;
	}
}