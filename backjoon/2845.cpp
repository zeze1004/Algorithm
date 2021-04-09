#include <iostream>
using namespace std;

int main()
{
	int N, M, num;
	cin >> N >> M;
	for (int i = 0; i < 5; i++)
	{
		cin >> num;
		cout << num - N * M << " ";
	}

	return 0;
}