#include <iostream>
using namespace std;

int main()
{
	int hour, minute, time, second;
	cin >> hour >> minute >> second >> time;
	int tmp = 0, second_tmp = 0;
	tmp = time;
	time = time / 60;
	tmp = tmp % 60;
	second += tmp;
	minute += time;

	if (second >= 60)
	{
		minute++;
		second = second - 60;
	}
	if (minute >= 60)
	{
		cout << "minute" << '\n';
		int minute_tmp = minute;
		minute_tmp /= 60;
		minute %= 60;
		hour += minute_tmp;
	}
	if (hour >= 24)
	{
		hour = hour - 24;
	}
	cout << hour << " " << minute << " " << second;
	return 0;
}