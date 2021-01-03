#include <iostream>
using namespace std;

int main()
{
	int x, y, w, h;
	int garo, sero, far_zero;
	cin >> x >> y >> w >> h;
	if (x >= y)
		far_zero = y;
	else
	{
		far_zero = x;
	}

	if (w - x >= h - y)
	{
		sero = h - y;
		if (far_zero > sero)
		{
			cout << sero;
			return 0;
		}
	}
	else if (w - x < h - y)
	{
		garo = w - x;
		if (far_zero > garo)
		{
			cout << garo;
			return 0;
		}
	}
	cout << far_zero;
}