#include <iostream>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int num;
	int rank = 1;
	pair<int, int> arr[50];
	cin >> num;
	for (int i = 0; i < num; i++)
		cin >> arr[i].first >> arr[i].second;
	for (int i = 0; i < num; i++)
	{
		for (int j = 0; j < num; j++)
		{
			if (arr[i].first < arr[j].first && arr[i].second < arr[j].second)
				rank++;
		}
		cout << rank << " ";
		rank = 1;
	}
}