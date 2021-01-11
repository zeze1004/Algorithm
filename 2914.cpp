#include <iostream>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int song_num, avg;
	cin >> song_num >> avg;
	cout << avg * song_num - song_num + 1;
	return 0;
}