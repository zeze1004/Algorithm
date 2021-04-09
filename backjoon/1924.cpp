#include <iostream>
#include <string>
using namespace std;

int main()
{
	string string_day[7] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
	int month_lastday[12] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int month, int_day, count = 0;
	cin >> month >> int_day;

	for (int i = 1; i <= month; i++)
	{
		if (i == month)
		{
			// 해당 달의 입력 받은 날을 더함
			count += int_day;
		}
		else
		{
			// 전 달들의 일 수를 더 함
			count += month_lastday[i - 1];
		}
	}

	cout << string_day[count % 7];

	/*
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int month, day, lastday, count = 0;
	int seven_day[8] = {
			1,
			2,
			3,
			4,
			5,
			6,
			7};
	int all_day[13][32] = {0};
	for (month = 1; month < 13; month++)
	{
		if (month == 4 || month == 6 || month == 9 || month == 11)
		{
			lastday = 30;
		}
		else if (month == 2)
		{
			lastday = 28;
		}
		else
			lastday = 31;
		for (day = 1; day <= lastday; day++)
		{
			// cout << month << " " << day << " " << lastday << '\n';
			all_day[month][day] = seven_day[count];
			count++;
			if (count == 7)
				count = 0;
		}
	}
	cin >> month >> day;
	if (all_day[month][day] == 1)
		cout << "MON";
	else if (all_day[month][day] == 2)
		cout << "TUE";

	else if (all_day[month][day] == 3)
		cout << "WED";

	else if (all_day[month][day] == 4)
		cout << "THU";

	else if (all_day[month][day] == 5)
		cout << "FRI";

	else if (all_day[month][day] == 6)
		cout << "SAT";

	else if (all_day[month][day] == 7)
		cout << "SUN";
*/
	return 0;
}