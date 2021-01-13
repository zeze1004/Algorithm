#include <iostream>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int num, count = 0;
	cin >> num;
	// num부터 하나씩 줄인다
	for (int i = num; i > 0; i--)
	{
		// count 개수만큼 공백 출력
		for (int k = 0; k < count; k++)
		{
			cout << " ";
		}
		count++;
		// i부터 하나씩 줄인다
		for (int j = i; j > 0; j--)
		{
			cout << "*";
		}
		cout << '\n';
	}
	return 0;
}