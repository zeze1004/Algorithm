#include <iostream>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);

	int T, student_num, apple, sum = 0;
	cin >> T;
	while (T--)
	{
		cin >> student_num >> apple;
		sum += apple % student_num;
	}
	cout << sum;

	return 0;
}